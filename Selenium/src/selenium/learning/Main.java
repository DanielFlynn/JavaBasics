package selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver", "//Users/dfflynn/IdeaProjects/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.google.com");
    }
}
