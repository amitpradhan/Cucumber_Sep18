package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\Webdriver_May_2018\\Cucumber_FreeCRM_OnlineBatch_Sep18\\src\\main\\java\\features\\",
		/**
		 * Glue - path of the step definition files which contains the Java
		 *  and Webdriver  commands
		 */
		glue={"stepDefintions"},
		monochrome=true,//It is used to display the console output  in a proper readable format.
				/*dryRun used to check if the mapping is proper between feature file and step
				 * definition file.
				 * It just checks  all the steps in feature file have corresponding
				 * stepDef or not. But it will not execute the code. Value could be
				 * true or false
				*/
		
		plugin={"pretty", "html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"},
		
		
		dryRun=false,
		strict =true 
		//tags={"@SmokeTest,@End2End"}
		//tags = {"@SmokeTest" , "~@RegressionTest", "~@End2End"}
		
		)




public class TestRunner {

}
