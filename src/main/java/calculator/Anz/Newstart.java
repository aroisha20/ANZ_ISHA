package calculator.Anz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//public WebDriver driver;
public class Newstart {
	public WebDriver driver;
	 public static Properties prop;

	@SuppressWarnings("deprecation")
	public  WebDriver initializeDriver() throws IOException, InterruptedException
	{
	prop=new Properties();	
	FileInputStream fis = new FileInputStream("C:\\Users\\Palvit Arora\\eclipse-workspace\\Anz\\src\\main\\java\\calculator\\Anz\\data.properties");
	prop.load(fis);
	String browserName= prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Palvit Arora\\eclipse-workspace\\Anz\\target\\Resource\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(100);
	}
	
	return driver;
	}

}
