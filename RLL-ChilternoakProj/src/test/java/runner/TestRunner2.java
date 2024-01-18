package runner;

//import org.testng.annotations.Listeners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import testnglisteners.CucumberExtentReportListener;

@CucumberOptions(
      features = {"C:\\Users\\P.NAGA SAHITHI\\Desktop\\RLL Workspace\\RLL-ChilternoakProj\\src\\test\\java\\feature\\Search.feature",
                  },
      glue = {"Steps" },
      dryRun = false,
      plugin = {
          "pretty",
          "html:targettestng/cucumberreport_search.html",
          "json:targettestng/cucumber.json",
          "junit:targettestng/xmlReport.xml",
          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\", \"timeline:test-output-thread/"
          
        
      },
      monochrome=true
)

//@Listeners(CucumberExtentReportListener.class)
public class TestRunner2 extends AbstractTestNGCucumberTests {
}