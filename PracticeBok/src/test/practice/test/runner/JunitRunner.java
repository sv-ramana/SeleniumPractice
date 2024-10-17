package practice.test.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/practice/test/featurefiles/"},
        glue= {"practice/test/steps"},
        tags="@justscanrio or validCred",
        monochrome=true,
        //plugin = {"html:target/cucumber-html-reports, json:target/cucumber-html-reports/cucumber.json"})
        plugin = {
                "html:target/report.html",
                "json:target/cucumber.json"})
public class JunitRunner {

}
