package browsers_opening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {
	@Test
	public void meesho() {
		Reporter.log("Opening Meesho site",true);
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.meesho.com/");
		driver.quit();
	}

}
