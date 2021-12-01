package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveSingleItem {

	WebDriver driver;
//	String checkbox ;

	public RemoveSingleItem(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[name='todo[0]']")
	WebElement ListItem0_Element;

	@FindBy(how = How.CSS, using = "input[name='todo[1]']")
	WebElement ListItem1_Element;

	@FindBy(how = How.CSS, using = "input[name='todo[2]']")
	WebElement ListItem2_Element;

	@FindBy(how = How.CSS, using = "input[name='todo[3]']")
	WebElement ListItem3_Element;

	@FindBy(how = How.CSS, using = "input[type='submit'][name='submit'][value='Remove']")
	WebElement RemoveButton_Element;

//	public boolean userselectSingle_listItemAndClicksOnRemoveButton() {
////		String checkbox = null;
//		switch (checkbox) {
//		case "1":
//			ListItem1_Element.click();
//			RemoveButton_Element.click();
//			break;
//		case "2":
//			ListItem2_Element.click();
//			RemoveButton_Element.click();
//			break;
//		case "3":
//			ListItem3_Element.click();
//			RemoveButton_Element.click();
//			break;
//		default:
//			System.out.println("Unable to click!!");
//
//		}
//		return false;
//	}

	public void selectSingle_listItem0() {
		ListItem0_Element.click();
		if (ListItem0_Element.isDisplayed()) {
			System.out.println("Item No 0 is Removed!!");
		}else {
			System.out.println("Item No 0 is Present!!");
		}
	}

	public void selectSingle_listItem1() {
		ListItem1_Element.click();
		if (ListItem0_Element.isDisplayed()) {
			System.out.println("Item No 1 is Removed!!");
		} else {
			System.out.println("Item No 1 is Present!!");
		}
	}

	public void selectSingle_listItem2() {
		ListItem2_Element.click();
		if (ListItem0_Element.isDisplayed()) {
			System.out.println("Item No 2 is Removed!!");
		}else {
			System.out.println("Item No 2 is Present!!");
		}

	}

	public void selectSingle_listItem3() {
		ListItem3_Element.click();
		if (ListItem0_Element.isDisplayed()) {
			System.out.println("Item No 3 is Removed!!");
		}else {
			System.out.println("Item No 3 is Present!!");
		}

	}

	public void removeSingle_listItemButton() {
		RemoveButton_Element.click();
	}

	public boolean validateSingleItemIsRemoved(By locatorKey) {
		try {
			driver.findElement(By.cssSelector("input[name='todo[0]']"));
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

}
