import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyTestCases {

	DesiredCapabilities caps =new DesiredCapabilities();
	AndroidDriver driver;
	
	String AppiumURL="http://127.0.0.1:4723/wd/hub";
	
	@BeforeTest
	public void MySetup() {
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4");
		File MyApplication=new File("src/MyApp/calculator.apk");
		caps.setCapability(MobileCapabilityType.APP,MyApplication.getAbsolutePath());

	}
	
	@Test
	public void MyFirstTest() throws MalformedURLException {
		driver =new AndroidDriver(new URL(AppiumURL),caps);
	}
	
	
}
