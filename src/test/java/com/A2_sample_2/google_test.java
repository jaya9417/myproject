package com.A2_sample_2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google_test {

	@Test
	public void googletest() throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver wd =new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File ("E:/workspace/J1_Git_Test/screenshot/goole1.jpg"));
		
	}
}
