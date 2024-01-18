package Steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pagefactory.Searchpage;


public class Searchsteps {
	Logger logger = LogManager.getLogger(Searchsteps.class);
	  
	WebDriver driver = new ChromeDriver();
	
	
    public Searchpage searchPage;
    
    
    
    @Given("I open the browser and enter the URL")
    public void iOpenTheBrowserAndEnterTheURL() {
    	logger.info("Chilternoak Furniture Homepage");
    	 searchPage = new Searchpage();
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chilternoakfurniture.co.uk/");
        searchPage= PageFactory.initElements(driver, Searchpage.class);
        
    }

    @When("I enter a valid product name as {string} in the search bar")
    public void iEnterAValidProductNameInTheSearchBar(String productName) {
    	logger.info( "entering valid product name");
        searchPage.enterSearchTerm(productName);
       
        
    }

    @When("I click on the search button")
    public void iClickOnTheSearchButton() {
    	logger.info("clicking on search button");
        searchPage.clickSearchButton();
        driver.close();
    }
    @Then("results should be found for the search term")
    public void resultsShouldBeFoundForTheSearchTerm() {
       
        Searchpage Searchpage = new Searchpage();

        String validProductName = "Genoa Glass Sofa Table With Gold Frame";
 
        boolean resultsFound = Searchpage.isResultFound(validProductName);
        
        assertFalse("Results should be found for the search term", resultsFound);
    }

    @Then("no results should be found for the search term")
    public void noResultsShouldBeFoundForTheSearchTerm() {
        
        Searchpage searchpage = new Searchpage();

        String nonExistentTerm = "Bikes";
       
        boolean resultsFound = searchpage.isResultFound(nonExistentTerm);
      
        assertFalse("No results should be found for the search term", resultsFound);
    }
}
   
        
        
