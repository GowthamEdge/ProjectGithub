package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
}
