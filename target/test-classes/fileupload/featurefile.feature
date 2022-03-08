
Feature:File upload

  Scenario: File uplaod
    Given I open the file upload demo site
    When I upload the file
    And click on the term of services and submit
    Then verify the display of file upload successfully
  


