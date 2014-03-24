package foo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class SimpleLocate {
	public void simpleLocate() throws InterruptedException{
		File pathToBinary=new File("D:\\Program Files\\firefox.exe");
		FirefoxBinary ffBinary=new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		FirefoxDriver dr=new FirefoxDriver(ffBinary,firefoxProfile);
		Thread.sleep(2000);
		
		File file=new File("src/main/java/foo/form.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n",filePath);
		
		dr.get(filePath);
		Thread.sleep(2000);
		
		//by id
		dr.findElement(By.id("inputEmail")).click();
		Thread.sleep(1000);
		
		//by name
		dr.findElement(By.name("password"));
		Thread.sleep(1000);
		
		//by tagname
		String classOfForm=dr.findElement(By.tagName("form")).getAttribute("class");
		System.out.printf("%s\n",classOfForm);
		
		//by link text
		WebElement link=dr.findElement(By.linkText("register"));
		((JavascriptExecutor)dr).executeScript("$(arguments[0].fadeOut().fadeIn()",link);
		Thread.sleep(1000);
		
		//by partial link test
		WebElement sameLink=dr.findElement(By.partialLinkText("reg"));
		((JavascriptExecutor)dr).executeScript("$(arguments[0].fadeOut().fadeIn()",sameLink);
		Thread.sleep(1000);
		
		//by css selector
		WebElement div=dr.findElement(By.cssSelector(".controls"));
		((JavascriptExecutor)dr).executeScript("$(arguments[0].fadeOut().fadeIn()",div);
		Thread.sleep(1000);
		
		//By xpath
		dr.findElement(By.xpath("/html/body/form/div[3]/div/label/input")).click();
		Thread.sleep(1000);
		
		System.out.println("browser will be close");
		dr.quit();
		
	}

}
