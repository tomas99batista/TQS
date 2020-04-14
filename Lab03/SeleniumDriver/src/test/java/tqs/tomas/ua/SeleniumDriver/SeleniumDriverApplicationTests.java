package tqs.tomas.ua.SeleniumDriver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import io.github.bonigarcia.seljup.SeleniumExtension;
import io.github.bonigarcia.seljup.SeleniumExtension;

import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(SeleniumExtension.class)
class SeleniumDriverApplicationTests {
	ChromeDriver driver;

	public ChromeInConstructorJupiterTest(ChromeDriver driver) {
		this.driver = driver;
	}

	@Test
	public void testWithOneChrome(ChromeDriver chromeDriver) {
		// Use Chrome in this test
	}


}
