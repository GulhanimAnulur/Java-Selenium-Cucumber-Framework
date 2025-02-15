Feature: Find Related People from CSV File

  @Csv
  Scenario: Validate and process CSV file to find related people
    Given a CSV file "test_data.csv" with valid user records
    When User processes the file to find related people
    Then a result file "related_people.txt" should be generated
    And the output should contain valid relationships based on last names
    And invalid records should not be included in the results