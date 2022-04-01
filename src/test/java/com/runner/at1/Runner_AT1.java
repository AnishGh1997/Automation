package com.runner.at1;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.baseclas.org.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\at1\\", glue = "com\\stepdef\\at1", plugin = {
		"pretty" }, monochrome = true)

public class Runner_AT1 {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

		driver = BaseClass.launchdriver("chrome");
		BaseClass.geturl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

}
