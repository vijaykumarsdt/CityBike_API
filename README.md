Assignment

This assignment is to determine the required level of expertise needed for automated testing on the project.

Using BDD approach, I have developed the code to test the given API endpoint.

Using Cucumber - Gherkin Key words , TESTNG, RestAssured ,I've defined the test process

All the required dependencies are available in POM.xml in the project folder.(update the project folder if required, Project Folder-> Maven-> Update)

using given. (the pre requisets)
      when.  (CRUD requirements)
      then.  (Assetions & loops)
      
    With the help of above BDD frame work we can get the partiuclar details from the API Endpoint.
    
    In this test instance we asserted the city Frankfurt is in Germany and the extracted the longitude and latitude of the bike location.
    We can adopt this code for any city of interst with in this API body.
    
    Test Approach:
    
    
   1. Get the response from the given API
   2. Verify the statusCode , It should be 200 (OK)
   3. asserted the statusCode.
   4. extracted the API body
   5. Listed the cities with in the body
   6. choose the city and country of interest for verification
   7. prinnt the details
   
   Run the test using TestNG  and check the console for the Result.
   
      






