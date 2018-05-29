package com.mymeds.utility;

import com.mymeds.base.BrowserFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Screenshots extends BrowserFactory {

    public static void takeScreenshot(String Ssname) throws IOException {
        TakesScreenshot screen = (TakesScreenshot) driver;
        File source = screen.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File(".\\ScreenshotsTaken\\" + Ssname + ".png"));


    }
}
