package browsers_opening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void amazon() {
		Reporter.log("Opening Amazon site",true);
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.quit();
	}

}
