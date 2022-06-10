package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Guru\\FreeCrmBDDFramework\\src\\test\\java\\Features\\window.feature"
		,glue= {"stepDefinition"},//the path of the step definition files
		plugin= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome = true,//display the console output in a proper readable format
		dryRun = false,//to check the mapping is proper between feature file and step def file
		strict = true)//it will check if any step is noted defined in step defination file)
		//tags = {"~@Remote"})
public class TestRunner {

	
	
}
