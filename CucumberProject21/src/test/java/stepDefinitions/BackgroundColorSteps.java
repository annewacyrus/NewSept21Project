package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.Sky_Blue_Background;
import pages.Sky_White_Background;
import util.BrowserFactory;

public class BackgroundColorSteps {
	WebDriver driver;
	Sky_Blue_Background blue;
	Sky_White_Background white;

	@Before
	public void setUp() {
		driver = BrowserFactory.startBrowser();
		blue = PageFactory.initElements(driver, Sky_Blue_Background.class);
		white = PageFactory.initElements(driver, Sky_White_Background.class);
	}

	@Given("Set SkyBlue Background button exists")
	public void set_SkyBlue_Background_button_exists() {
		Assert.assertTrue("Skyblue Button is not Displayed", blue.waitForBackgroundColorButton());
	}

	@When("I click on the blue button")
	public void i_click_on_the_blue_button() throws InterruptedException {
		blue.click_background_Color_button();
	}

	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
		Assert.assertTrue("Background color is not Skyblue", blue.isBackGroundColorBlue());
	}

	@Given("Set SkyWhite Background button exists")
	public void set_SkyWhite_Background_button_exists() {
		Assert.assertTrue("SkyWhite Button is not Displayed", white.waitForBackgroundColorButton());
	}

	@When("I click on the white button")
	public void i_click_on_the_white_button() throws InterruptedException {
		white.click_background_Color_button();
	}

	@Then("the background color change to white")
	public void the_background_color_change_to_white() {
		Assert.assertTrue("Background color is not Skywhite", white.isBackGroundColorWhite());
	}

	@After
	public void TearDown() {
		driver.close();
		driver.quit();

	}

}
