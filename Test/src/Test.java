import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("I love Sunny");
		
		WebDriver driver = new SafariDriver();
		
		driver.get("https://www.yahoo.com");
		driver.get("branching test");
		driver.get("git pull master update test");
		driver.get("branching test2");
		driver.get("git pull master update test2");


		
	}

}
