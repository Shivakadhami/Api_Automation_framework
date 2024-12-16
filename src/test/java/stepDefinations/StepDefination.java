package stepDefinations;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import pojo.*;
import resources.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;  // Import for the 'lessThan' matcher
public class StepDefination extends Utils
{

    private static final Log log = LogFactory.getLog(StepDefination.class);
    private Object payload; // POJO instance
    private Response response;
    private Response createApiResponse;
    private String Id;
    private String appointment_id = "9718000271";
    private RequestSpecification requestSpec;
    public StepDefination() throws FileNotFoundException
    {
        this.requestSpec = Utils.requestSpecifications(appointment_id);
    }

    // Step: Given the following JSON payload is prepared
    @Given("the following JSON payload is prepared")
    public void prepareJsonPayload()
    {
        // You can either hardcode the JSON or use a POJO to convert to JSON
        String jsonPayload1 = "{\n" +
                "    \"inspectionType\": \"PRE_PURCHASE\",\n" +
                "    \"inspectionSubType\": \"FULL\"\n" +
                "}";
        // Log the JSON payload for debugging
        System.out.println("Prepared JSON Payload: " + jsonPayload1);
    }

    // Step: When user calls CreateAPI with POST HTTP request
    @When("user calls CreateAPI with POST HTTP request")
    public void userCallsCreateApi() throws FileNotFoundException
    {
        // Send POST request with JSON payload
     //   RequestSpecification requestSpec    =Utils.requestSpecifications("FullUrl");
        createApiResponse = given(requestSpec)
                .queryParam("ri","true")
                .queryParam("preInventory","true")
                .contentType("application/json")
                .header("X_COUNTRY", "AE")
                .header("X_VEHICLE_TYPE", "CAR")
                .header("Authorization", authorizationToken)// Set the content type as JSON
                .body("{\n" +                        // Body of the request
                        "    \"inspectionType\": \"PRE_PURCHASE\",\n" +
                        "    \"inspectionSubType\": \"FULL\"\n" +
                        "}")
                .when()
                .post("/inspection/" + appointment_id);
        // Replace with the actual API URL
        // Extract inspection ID from the Create API response (assuming it's in the response body)
        Id = createApiResponse.jsonPath().getString("id");
        // Log the response and the extracted inspection ID for debugging
        System.out.println("Create API Response: " + createApiResponse.getBody().asString());
        System.out.println("Extracted inspectionId: " + Id);
        // Check if the createApiResponse is not null and is a valid response
        if (createApiResponse != null && createApiResponse.statusCode() == 200) {
            Id = createApiResponse.jsonPath().getString("Id"); // Extract the ID from the response
            System.out.println("Create API Response: " + createApiResponse.getBody().asString());
            System.out.println("Extracted inspectionId: " + Id);
            response = createApiResponse;  // Assign the response to the 'response' variable used in @Then
        }

        else {
            throw new IllegalStateException("Create API request failed or response is null");
        }

        // Extract derivedStatus from the response body
        String derivedStatus = createApiResponse.jsonPath().getString("data.derivedStatus");
      // Log the extracted value
        System.out.println("Derived Status: " + derivedStatus);

        // Validate if derivedStatus is "CHECKED_IN"
        if ("CHECKED_IN".equals(derivedStatus)) {
            System.out.println("Status: Pass");
        }
        else
        {
            System.out.println("Status: Fail");
            // Optionally, you can throw an assertion failure to make the test fail
            throw new AssertionError("Expected derivedStatus to be CHECKED_IN, but was " + derivedStatus);
        }
    }

    @Given("the following JSON payload is prepared:for {string}")
    public void the_following_json_payload_is_prepared_for(String fileName) throws IOException
    {
        String filePath = "/Users/cars24/ApiAutomation/ApiAutomation/src/test/java/resources/" + fileName;
        System.out.println("File Name: " + fileName);
        System.out.println("File Path: " + filePath);
        ObjectMapper objectMapper = new ObjectMapper();

        // Check if the file exists
        File file = new File(filePath);
        if (file.exists())
        {
            System.out.println("File exists: " + filePath);
        } else {
            System.err.println("File not found: " + filePath);
        }

        if (fileName.contains("BasicInspectionApiPayload"))
        {
            payload = objectMapper.readValue(new File(filePath),BasicDetailsAPI.class);
            System.out.println("Loaded BasicInspectionAPIpayload API Payload from: " + filePath);
        }

        else if (fileName.contains("InspectionCheckpointPayload"))
            {
                // Load the JSON file into CreateInspectionAPI POJO
                payload = objectMapper.readValue(new File(filePath),InspectionCheckpoint.class);
                System.out.println("Loaded InspectionCheckpointPayload API Payload from: " + filePath);
            }
        else if (fileName.contains("LooseItems")) {
                payload = objectMapper.readValue(new File(filePath),looseIteams.class);
                System.out.println("Loaded LooseItems API Payload from: " + filePath);
            }
        else if (fileName.contains("SandFPayload"))
            {
                payload = objectMapper.readValue(new File(filePath),SandF.class);
                System.out.println("Loaded SandFPayload API Payload from: " + filePath);
            }
        else if (fileName.contains("Warranty")) {
                payload = objectMapper.readValue(new File(filePath),Warranty.class);
                System.out.println("Loaded Warranty API Payload from: " + filePath);
            }
        else if (fileName.contains("SubmitPayload")) {
                // Load the JSON file into BasicDetailsAPI POJO
                payload = objectMapper.readValue(new File(filePath),SubmitInspection.class);
                System.out.println("Loaded SubmitPayload API Payload from: " + filePath);
            }
        else
            {
                throw new IllegalArgumentException("Unknown file type: " + fileName);
            }

            // Log the loaded payload for debugging purposes
            System.out.println("Payload: " + payload);
         System.out.println("response is "+ response);
         System.out.println("response is "+ createApiResponse);

        }
    @When("User calls {string} with POST http  request")
    public void PostAPIs (String Api) throws Exception
    {

            // Serialize the POJO to JSON using Jackson ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonPayload = objectMapper.writeValueAsString(payload);
            System.out.println(jsonPayload);
            // Ensure the authorizationToken is not null
            if (authorizationToken == null || authorizationToken.isEmpty()) {
                throw new IllegalStateException("Authorization token is not set!");
            }
            // Make the POST request
            response = given(requestSpec)
                    .contentType("application/json")
                    .header("Authorization", authorizationToken)
                    .header("X_COUNTRY", "AE")
                    .header("X_VEHICLE_TYPE", "CAR")
                    .body(jsonPayload)
                    .log().all()
                    .when()
                    .post("/inspection/" + appointment_id);
        // Verify if the response is not null
        if (response == null) {
            throw new RuntimeException("API response is null!");
        }

            // Log the response body for debugging
            System.out.println("Response: " + response.getBody().asString());
        }

        @Then("the response status should be {int}")
        public void theResponseStatusShouldBe ( int statusCode)
        {
            if (response == null) {
                throw new NullPointerException("API response is null. Cannot validate status code.");
            }

            response.then().statusCode(statusCode);
            System.out.println(statusCode);
        }

    @Then("the response time should be less than 1 minute")
    public void the_response_time_should_be_less_than_1_minute()
    {
        // Extract the response time in milliseconds
        long responseTime = response.time();

        // Assert that the response time is less than 60000 milliseconds (1 minute)
        assertThat("Response time is greater than 1 minute", responseTime, lessThan(60000L));

        // Optionally, log the response time for debugging
        System.out.println("API Response Time: " + responseTime + " milliseconds");
    }

    }





