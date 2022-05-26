package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Sky_White_Background {

	WebDriver driver;

	public Sky_White_Background(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//button[@type='button' and contains (text(),'Set SkyBlue Background')] ")
	WebElement BluebackgroundButton;
	@FindBy(how = How.XPATH, using = "//button[@type='button' and contains (text(),'Set White Background')] ")
	WebElement WhitebackgroundButton;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")
	WebElement WhiteColor;

	// =========================Methods========================
	public boolean waitForBackgroundColorButton() {
		try {
			return WhitebackgroundButton.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	public void click_background_Color_button() throws InterruptedException {
		BluebackgroundButton.click();
		Thread.sleep(3000);
		WhitebackgroundButton.click();
		Thread.sleep(2000);
		System.out.println("=======Background color changed to WHITE!!========");
	}

	public boolean isBackGroundColorWhite() {
		try {
			return WhiteColor.isEnabled();
		} catch (Exception e) {

		}
		return false;
	}

}
