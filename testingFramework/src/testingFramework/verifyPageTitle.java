package testingFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyPageTitle {
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.gecko.driver", "D:\\Jethro\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		String expectedTitle = "Google";
		String actualTitle = "";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);
		//driver.navigate().to(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		/*
		 * compare the actual title of the page with the expected one and print
		 * the result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		//close Fire fox
		driver.quit();

		// exit the program explicitly
		System.exit(0);
	}
}
