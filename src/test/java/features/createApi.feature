
Feature:  Dynamic inspection API Endpoint Testing for Full inspection
  Scenario: Verify if inspection is created successfully using CreateAPI

   Given the following JSON payload is prepared
   When user calls CreateAPI with POST HTTP request
   Then the response status should be 200
   Then the response time should be less than 1 minute

 Scenario:  Verify the BasicDetailsAPI with valid data
   Given the following JSON payload is prepared:for "BasicInspectionApiPayload.json"
   When User calls "BasicDetailsAPI" with POST http  request
   Then the response status should be 200
  Then the response time should be less than 1 minute

  Scenario: Verify the inspectionCheckpoint API with valid data
    Given  the following JSON payload is prepared:for "InspectionCheckpointPayload.json"
    When User calls "InspectionCheckpoint" with POST http  request
  Then the response status should be 200
Then the response time should be less than 1 minute

  Scenario: Verify the SandF API  with valid data
   Given   the following JSON payload is prepared:for "SandFPayload.json"
   When User calls "SandF" with POST http  request
   Then the response status should be 200
Then the response time should be less than 1 minute

 Scenario: Verify the warranty API  with valid data
   Given   the following JSON payload is prepared:for "Warranty.json"
   When User calls "Warranty" with POST http  request
    Then the response status should be 200
Then the response time should be less than 1 minute

 Scenario: Verify the looseIteams with valid data
Given  the following JSON payload is prepared:for "LooseItems.json"
   When User calls "looseItems" with POST http  request
   Then the response status should be 200
 Then the response time should be less than 1 minute

 Scenario: Verify the SubmitAPI with valid data
   Given  the following JSON payload is prepared:for "SubmitPayload.json"
When User calls "SubmitInspection" with POST http  request
  Then the response status should be 200
     Then the response time should be less than 1 minute

























