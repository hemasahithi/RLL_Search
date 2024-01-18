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
	       
	       
	        if (performSearch(searchTerm)) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    
	    private boolean performSearch(String searchTerm) {
	       
	        return searchTerm.equals("existingTerm");
	    }
		
	
	}

