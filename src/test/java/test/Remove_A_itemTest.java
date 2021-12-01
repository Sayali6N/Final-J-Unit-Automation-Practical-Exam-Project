package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.RemoveSingleItem;
import page.ToggleCheckBoxes;
import util.BrowserFactory;


public class Remove_A_itemTest {
	WebDriver driver;
	RemoveSingleItem remove;
	ToggleCheckBoxes checkTogalAll;
//	String itemName;
	
	@Test
	public void userShould_beAbleTo_remove_A_Items() {
		driver = BrowserFactory.init();

		remove = PageFactory.initElements(driver, RemoveSingleItem.class);
		
		remove.selectSingle_listItem0();
		remove.selectSingle_listItem1();
	//	remove.selectSingle_listItem2();
	//	remove.selectSingle_listItem3();
		
		remove.removeSingle_listItemButton();
		
		remove.validateSingleItemIsRemoved(By.cssSelector("input[name='todo[0]']"));
		remove.validateSingleItemIsRemoved(By.cssSelector("input[name='todo[1]']"));
		
		BrowserFactory.tearDown();
	}

}
