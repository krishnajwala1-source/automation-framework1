package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        DriverFactory.initDriver();
        DriverFactory.getDriver().get("https://www.amazon.in");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
		
		
		
	  /*  public class BaseTest {
	   * 
	   * public WebDriver driver;
	    public Properties prop;

	    public WebDriver initializeDriver() throws Exception {
	        prop = new Properties();
	        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
	        prop.load(fis);
	        
	        String browserName = prop.getProperty("browser");

	        if (browserName.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver(); // Ensure WebDriverManager or exe is set
	        } else if (browserName.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();
	        }

	        driver.manage().window().maximize();
	        driver.get(prop.getProperty("https://www.amazon.in"));
			return driver;
	    }

	    public void tearDown() {
	        if (driver != null) {
	            driver.quit(); // Closes all windows and ends session
	        }
	    }*/
	

