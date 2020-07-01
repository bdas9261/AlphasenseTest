Feature: Validating users Api

Scenario: Verify if user is being Added sucessfully by createUserApi .
Given Add createuser Api request payload  
When   user Calls the "createuserApi" with Post HTTP Request
Then   the api call got sucess with status code 200
And  "name" in response body is "Test2"
And   "job" in response body is "se"
