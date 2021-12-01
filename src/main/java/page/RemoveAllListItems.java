package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllListItems {

	WebDriver driver;
	
	public RemoveAllListItems(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[name='allbox']")WebElement ALL_listItem_Element;

	@FindBy(how = How.CSS, using = "input[value='Remove']")WebElement RemoveButton_Element;

	

	public void selectAll_listItem() {
		ALL_listItem_Element.click();
		if (ALL_listItem_Element.isSelected()) {
			System.out.println("Checkbox is now Toggled ON!!");
		}
		
	}

	public void removeAll_listItem() {
		RemoveButton_Element.click();
	}
	
	public boolean validateAllListItemIsRemoved(By locatorKey) {
		try {
			driver.findElement(By.cssSelector("input[name='allbox']"));
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}
	

}
