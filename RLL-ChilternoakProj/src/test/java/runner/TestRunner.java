package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\P.NAGA SAHITHI\\Desktop\\RLL Workspace\\RLL-ChilternoakProj\\src\\test\\java\\feature\\Search.feature",
	glue= {"Steps"}	,
	dryRun=false,
	plugin= {"pretty","html:target/cucumbersearchreport.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:test-output-thread/"}
		
		)


public class TestRunner {
	
	
	
	

}
