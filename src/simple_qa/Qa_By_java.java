package simple_qa;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qa_By_java {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("http://127.0.0.1:5500/index.html");

String Mytittle=driver.getTitle();


System.out.println(Mytittle);


List<WebElement> Myoptionlist =driver.findElements(By.tagName("option"));
for(int i=0;i<Myoptionlist.size();i++) {

	System.out.println(	Myoptionlist.get(i).getText());
	
}
	

	}

	
	

}
