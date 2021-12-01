package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleCheckBoxes {

	WebDriver driver;

	public ToggleCheckBoxes(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[name='allbox']")
	WebElement ToggleCheckbox_Element;

	@FindBy(how = How.CSS, using = "input[name='todo[1]']")
	WebElement ListCheckbox1_Element;

	@FindBy(how = How.CSS, using = "input[name='todo[2]']")
	WebElement ListCheckbox2_Element;

	public void toggleCheckBox_IsChecked() throws InterruptedException {
		// This will Toggle on the check box

		ToggleCheckbox_Element.click();

		if (ToggleCheckbox_Element.isSelected()) {
			System.out.println("Toggle All Checkbox is Selected");
		} else {
			System.out.println("Toggle All Checkbox is not Selected");
		}
		Thread.sleep(1000);

	}

	public void listItemCheckBox1() throws InterruptedException {
		if (ListCheckbox1_Element.isSelected()) {
			System.out.println("Check box for list items No1 is Checked!!");
		} else {
			System.out.println("Check box for list items No1 is Not Checked!!");
		}
		Thread.sleep(1000);

	}

	public void listItemCheckBox2() throws InterruptedException {
		if (ListCheckbox2_Element.isSelected()) {
			System.out.println("Check box for list items No2 is Checked!!");
		} else {
			System.out.println("Check box for list items No2 is Not Checked!!");
		}
		Thread.sleep(1000);

	}

	public void toggleCheckBox_IsNotChecked() throws InterruptedException {
		// This should Toggle off the check box

		ToggleCheckbox_Element.click();
		if (!ToggleCheckbox_Element.isSelected()) {
			System.out.println("Checkbox is now Toggled OFF!!");
		}
		Thread.sleep(1000);
	}
}
