package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.ToggleCheckBoxes;
import util.BrowserFactory;

public class LaunchBrowserAndToggleCheckboxTest {

	WebDriver driver;
	ToggleCheckBoxes checkTogalAll;
	
	@Test
	public void testLaunchBrowserAndToggleCheckBoxes() throws InterruptedException {
		driver = BrowserFactory.init();
		
		checkTogalAll = PageFactory.initElements(driver,ToggleCheckBoxes.class);
		checkTogalAll.toggleCheckBox_IsChecked();
		checkTogalAll.listItemCheckBox1();
		checkTogalAll.listItemCheckBox2();
		checkTogalAll.toggleCheckBox_IsNotChecked();
		checkTogalAll.listItemCheckBox1();
		
		
		BrowserFactory.tearDown();
	}
}
