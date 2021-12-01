package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.RemoveAllListItems;
import page.RemoveSingleItem;
import page.ToggleCheckBoxes;
import util.BrowserFactory;

public class Remove_AlIitem_Test {

	WebDriver driver;
	RemoveSingleItem remove;
	ToggleCheckBoxes checkTogalAll;
	RemoveAllListItems removeAll;
	
	@Test
	public void userShould_beAbleTo_remove_AllItems() {
		driver = BrowserFactory.init();
		removeAll= PageFactory.initElements(driver, RemoveAllListItems.class);
		
		removeAll.selectAll_listItem();
		removeAll.removeAll_listItem();
		removeAll.validateAllListItemIsRemoved(By.cssSelector("input[name='allbox']"));
	
		
		BrowserFactory.tearDown();
	}
}
