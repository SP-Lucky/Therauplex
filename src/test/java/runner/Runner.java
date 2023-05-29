package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features ="C:\\Users\\DELL\\eclipse-workspace\\sadup\\src\\test\\resources\\features\\thrauplex.feature",
		glue="stepdefination",
		plugin={"pretty"},
		monochrome= false
)

public class Runner 
{

}
