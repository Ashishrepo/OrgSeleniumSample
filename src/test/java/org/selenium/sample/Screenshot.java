package org.selenium.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends FailedScreenshots_test {
   
	
		
	public static void TS(String name) throws IOException {
		
		File shot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shot, new File(System.getProperty("user.dir")+"\\Screenshots\\"+name+".jpg"));

	}

}
