package pagefactory;


import org.openqa.selenium.support.FindBy;

	
	import org.openqa.selenium.WebElement;

	public class Searchpage {

	    @FindBy(xpath="//input[@type='text']")
	    public WebElement searchBar;

	    @FindBy(xpath="//button[@type='submit']")
	    public WebElement searchButton;
	    
	

	    public void enterSearchTerm(String productName) {
	        searchBar.sendKeys(productName);
	    }

	    public void clickSearchButton() {
	        searchButton.click();
	    }

		

	    public boolean isResultFound(String searchTerm) {
	        // Logic to perform the search and determine if results are found
	        // You can replace this with your actual search logic

	        // For example:
	        if (performSearch(searchTerm)) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    // Mocked method for performing search
	    private boolean performSearch(String searchTerm) {
	        // Replace this with your actual search implementation
	        // For example, return true if results are found, false otherwise
	        return searchTerm.equals("existingTerm");
	    }
		
	
	}

