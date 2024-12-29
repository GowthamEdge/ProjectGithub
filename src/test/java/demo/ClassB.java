package demo;

<<<<<<< HEAD
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
=======
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
>>>>>>> 780e63846c992df450739d19a947ace25afa5a93

public class ClassB {

	private void webTesting() {
		System.out.println("WT");

	}
	private void apiTesting() {
		System.out.println("AT");

	}
	private void mobileTesting() {
		System.out.println("MT");

	}
<<<<<<< HEAD
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count=0;
		for (WebElement element : links) {
			String link = element.getDomAttribute("href");
			if (link!=null&&link.startsWith("http")) {
				//convert string into URL
				URL url=new URL(link);
				//open the connection of the url
				URLConnection openConnection = url.openConnection();
				//to get the response code (typecasting)
				HttpURLConnection http=(HttpURLConnection)openConnection;
				//get the status code
				int code = http.getResponseCode();
				if (code>=400) {
					System.out.println("Broken link Status code :"+code+" Broken link :"+link);
					count++;
				}
			}
		}
		System.out.println("Broken link count :"+count);
	}
=======
	
	public static void main(String[] args) {
		
		
		ChromeOptions option=new ChromeOptions();
		//to handle the Chrome popup msg
		option.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		//to maximize the window
		option.addArguments("--start-maximized");
		//to handle the chrome browser extensions
		option.addArguments("--disable-extensions");
		//to habdle notification like camera , microphones, location
		option.addArguments("--disable-notification");
		//to lauch the browser in incognito
		option.addArguments("--incognito");
		//to execute the program without launching browser
		option.addArguments("--headless");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl()+driver.getTitle());
		
		
		
		
		
	}
	
	
>>>>>>> 780e63846c992df450739d19a947ace25afa5a93
}
