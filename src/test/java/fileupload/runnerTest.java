package fileupload;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
        features = "C:\\Users\\ANKITHA\\Desktop\\java-selenium\\fileupload\\src\\test\\java\\fileupload\\featurefile.feature",
        //tags = "@Test1 or @Test2",
        glue = "/fileupload"
        
        
		)

public class runnerTest {

}
