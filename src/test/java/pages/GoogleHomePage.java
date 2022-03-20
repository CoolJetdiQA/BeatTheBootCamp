package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;

public class GoogleHomePage {
	
	public GoogleHomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@class='gLFyf gsfi']")
	public WebElement searchInputBox;

}
