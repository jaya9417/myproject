package com.A1_sample_test;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bing_test {
	
	@Test
	public void validatebing() throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		
		File src =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File ("E:/workspace/J1_Git_Test/screenshot/bing.jpg"));
		
	}
}
//multiple suits in tesg ng....->
//		copy from google  copy that tag and paste in sanity test file(i.e. create separately)
//sanity test has renamed a 2 suite name
//
//		run sanity test ...to run all the suite files...
//		inside sanity .xml file 
//		we shoulkd rename that other xml files