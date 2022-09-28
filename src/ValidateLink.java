import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ValideteLinks {

	@Test
	void testCheckNumberOfLink() {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver browser = new ChromeDriver();

		
		browser.get("http://www.google.com");
		
		List<WebElement> list = browser.findElements(By.tagName("a"));
		
		for(int i=0; i<list.size();i++) {
			if(!list.get(i).getText().equals(""))
			System.out.println(" "+list.get(i).getText());
		}
		
		System.out.println("Number of Link : "+list.size());
		assertEquals(17,list.size());
		
		try {
			Thread.sleep(500);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		browser.close();
		System.out.println("Finish !!!");
		
	}

}
