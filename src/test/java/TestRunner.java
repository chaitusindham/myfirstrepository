import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //rightclick on featurefile and copy the content root path and paste in the features.
        features = {"src/test/java/features/login.feature"},
      //  glue = {"steps"},//location of step definition
        plugin = {"pretty","html:target/report.html"}


)



public class TestRunner
{



}
