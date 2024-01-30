package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class LaunchApiDemoApp {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		//cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appPackage", "com.example.hirdle");
		//cap.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
		//hirdel pack -   a0b5261 u0 com.example.hirdle
		
		//cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		cap.setCapability("appActivity", "com.example.hirdle.MainActivity");

		//cap.setCapability("appActivity", ".NexusLauncherActivity t108");
		//hirdel acti - com.example.hirdle.MainActivity
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='Skip']")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
		
		//Thread.sleep(1000);
		
		/*
		List<WebElement> element = driver.findElements(By.className("android.widget.TextView"));
		
		for(int i=0;i<element.size();i++) {
			
			System.out.println("The value of element is :- "+element.get(i).getText());
		/*	
			if(element.get(i).getText().equals("Media")) {
				
				element.get(i).click();
				break;
			}
			
		}
		
		
		
		//driver.findElement(By.id("android:id/text1")).click();
		
		//android.widget.TextView
	/*	
		List<WebElement> element = driver.findElements(By.className("android.widget.TextView"));
		
		for(int i=0;i<element.size();i++) {
			
			System.out.println("The value of element is :- "+element.get(i).getText());
			
			if(element.get(i).getText().equals("Media")) {
				
				element.get(i).click();
				break;
			}
			
		}
		*/				
	}

}
