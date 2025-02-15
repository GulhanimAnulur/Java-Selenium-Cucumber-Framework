package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.File;
import java.util.List;

public class FindRelatedPeopleSteps {


        private static final String INPUT_FILE = "test_data.csv";
        private static final String OUTPUT_FILE = "related_people.txt";

        @Given("a CSV file {string} with valid user records")
        public void aCSVFileWithValidUserRecords(String filename) {
            File file = new File(filename);
            Assert.assertTrue("CSV file should exist", file.exists());
        }

        @When("User processes the file to find related people")
        public void iProcessTheFileToFindRelatedPeople() {
            FindRelatedPeople.processCSV(INPUT_FILE, OUTPUT_FILE);
        }

        @Then("a result file {string} should be generated")
        public void aResultFileShouldBeGenerated(String filename) {
            File file = new File(filename);
            Assert.assertTrue("Output file should exist", file.exists());
        }

        @Then("the output should contain valid relationships based on last names")
        public void theOutputShouldContainValidRelationships() throws Exception {
            List<String> lines = Files.readAllLines(Paths.get(OUTPUT_FILE));
            Assert.assertFalse("Output file should not be empty", lines.isEmpty());
        }

        @Then("invalid records should not be included in the results")
        public void invalidRecordsShouldNotBeIncludedInTheResults() throws Exception {
            List<String> lines = Files.readAllLines(Paths.get(OUTPUT_FILE));
            for (String line : lines) {
                Assert.assertFalse("Invalid names should not be in the output", line.contains("Harper7") || line.contains("--"));
            }
        }
}
