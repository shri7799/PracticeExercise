package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; @RunWith(Cucumber.class)
@CucumberOptions(features="\"C:\\Users\\lenovo\\Desktop\\CoreJavaPracticeProgram\\Phase2_Cucumber\\CucumberNov29\\src\\test\\java\\feature\\AmazonTest.feature\"",
glue= {"steps"}, dryRun=false, plugin={"pretty",
"html:target/cucumberreport.html"}

)

public class TestRunner {

}
