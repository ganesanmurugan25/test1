package scdemo;

import java.io.File;
import java.io.IOException;
import java.time.format.TextStyle;
import java.util.logging.FileHandler;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) throws IOException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Student\\eclipse-workspace\\Screenshot\\src\\drivers\\chromedriver.exe");
//			WebDriver driver =new ChromeDriver();
			
	//		driver.get("https://www.google.com/");
			//driver.get("https://www.facebook.com/");
			
	//		TakesScreenshot ts=(TakesScreenshot)driver;
		//	File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		    File destinationFile=new File("C:\\Users\\Student\\eclipse-workspace\\Screenshot\\Scshot\\test.png");
		  //  FileUtils.copyFile(sourceFile,destinationFile);
		    
			
	}

}
