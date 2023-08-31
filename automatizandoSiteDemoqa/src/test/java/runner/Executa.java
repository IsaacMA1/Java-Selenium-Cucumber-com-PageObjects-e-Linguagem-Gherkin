package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driver.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@page2TestPositivo3",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/report-cucumber.html"},
		snippets = SnippetType.CAMELCASE
		
		)

public class Executa extends Drivers {

	
	public static void abrirNavegador(){
		boolean headless = false;
		String site = "https://demoqa.com/";
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		
		if(headless) {
			chromeOptions.addArguments("--headless");
		}
	driver = new ChromeDriver(chromeOptions);
	driver.get(site);
	
	}

}
