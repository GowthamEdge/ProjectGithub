package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
	
	
}
