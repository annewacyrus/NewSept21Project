package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Sky_Blue_Background {

	WebDriver driver;

	public Sky_Blue_Background(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//button[@type='button' and contains (text(),'Set SkyBlue Background')] ")
	WebElement BluebackgroundButton;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
	WebElement BlueColor;

	// ===================Actions=================

	public Boolean waitForBackgroundColorButton() {
		try {
			return BluebackgroundButton.isDisplayed();
		} catch (Exception e) {

		}
		return false;
	}

	public void click_background_Color_button() throws InterruptedException {
		Thread.sleep(3000);
		BluebackgroundButton.click();
		Thread.sleep(2000);
		System.out.println("=======Background color changed to Skyblue!!========");
	}

	public Boolean isBackGroundColorBlue() {
		try {
			return BlueColor.isEnabled();
		} catch (Exception e) {
		}
		return false;
	}

}
