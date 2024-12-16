package resources;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.PrintStream;

public class Utils
{
    //resuable methods
     public static RequestSpecification req;
    public static String authorizationToken;
    public static RequestSpecification requestSpecifications(String appointment_id) throws FileNotFoundException
    {
        PrintStream log= new PrintStream(new FileOutputStream("logging.txt"));
        RestAssured.baseURI="https://stage-refurbishment-service.qac24svc.dev";
       String FullUrl=   RestAssured.baseURI+"/"+appointment_id;
       System.out.println(FullUrl);
        authorizationToken= "Bearer eyJraWQiOiJpcE0tVXI0NVlfNnBlTWJpeXNXeHVlY2RvVG5wbm13U3NJTWZaeWxDd3FzIiwiYWxnIjoiUlMyNTYifQ.eyJ2ZXIiOjEsImp0aSI6IkFULmd3SlFvYWFvRFVoSkFmdDRHcUxjb0ptYkg4RU91T1ZHVzFOeEhadlhmSncub2FyMTdldGV2dVVKdGltOTQxZDciLCJpc3MiOiJodHRwczovL2NhcnMyNC5va3RhcHJldmlldy5jb20vb2F1dGgyL2RlZmF1bHQiLCJhdWQiOiJhcGk6Ly9kZWZhdWx0IiwiaWF0IjoxNzM0MzI5MzI5LCJleHAiOjE3MzQ0MTU3MjksImNpZCI6IjBvYXJheXViZVdCbmt3UzFVMWQ2IiwidWlkIjoiMDB1NDZidXhqb1haSmFWbGkxZDciLCJzY3AiOlsib2ZmbGluZV9hY2Nlc3MiLCJwcm9maWxlIiwib3BlbmlkIl0sImF1dGhfdGltZSI6MTczNDA4MDk0NCwic3ViLW5hbWUiOiJ1YWUuY2pAY2FyczI0LmNvbSIsImxhc3ROYW1lIjoiUFJFX1BVUkNIQVNFIiwic3ViIjoidWFlLmNqQGNhcnMyNC5jb20iLCJjb3VudHJ5IjpbIkFFIl0sImZpcnN0TmFtZSI6IkNKIiwiVEVTVF9DUkVBVEVfTU9WRU1FTlQiOmZhbHNlLCJncm91cHMiOlsiRXZlcnlvbmUiLCJQUkVfUFVSQ0hBU0VfQ0oiXSwibG9jYXRpb25zIjpbIkRYQl9TQ19DMjRfSVJDIl0sInZlaGljbGVUeXBlIjpbIkNBUiJdfQ.T-boZkKTji1ij2dsSQk_PkpiqSKpA9M8L6nC4YmGePHJLZdGLQPfdp8wR8J2rPRWJaxXBnHME6CtJ_ZrUn5GjdKpgG6w89EFxaPkUiDGU2BVe3-Ue9-P-E3t8Vv-98YSYs9MUKyyf3ssWtbYG5NnLWzUNdFBM8qRZgfR-i7MAX9RrfJwuAQHnyhnswfkRu5jaAUCIav11NtO6IITYjiTM0VeSR10-h1JuIumw7K5568tmhQLe6qAnxfVN_72f7q0rLpBXrOEvNrozeQFw2-bHe8sLpbx-url8dgodtDbVYsM2m8-o-19YyEKR6wS-RENF9Gl3zY7vUeJcEBCnweqew";
      req= new RequestSpecBuilder()
              .setBaseUri(RestAssured.baseURI)
              .addFilter(RequestLoggingFilter.logRequestTo(log))
              .addFilter(ResponseLoggingFilter.logResponseTo(log)).build();
      return req;

    }

}
