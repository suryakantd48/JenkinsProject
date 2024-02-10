package browsers_opening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
	@Test
	public void flipkart() {
		Reporter.log("Opening Flipkart site",true);
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}

}
