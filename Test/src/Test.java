import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("I love Sunny");
		
		WebDriver driver = new SafariDriver();
		
		driver.get("https://www.yahoo.com");
		
	}

}
