package Hooks;

import com.assignment.utils.ConfigReader;
import com.assignment.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class hooks {
    @Before
    public void setUpScenario(){
        DriverManager.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @After
    public void tearDownScenario(Scenario scenario){
        if(scenario.isFailed()){
            byte[]screenShot= ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png", scenario.getName());
        }
        DriverManager.quitDriver();
    }
}
