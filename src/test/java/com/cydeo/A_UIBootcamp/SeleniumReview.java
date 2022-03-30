package com.cydeo.A_UIBootcamp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumReview {
    public static void main(String[] args) throws InterruptedException {
        //Set up browser driver
        WebDriverManager.chromedriver().setup();

        //Create a driver object
        WebDriver driver=new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        //navigate to the web page we want
        driver.get("https://web-table-2.cydeo.com/login");

        //wait for 2 seconds
        Thread.sleep(3000);

        //get the title of th page
        String expectedTitle="Cydeo Web Table App";
        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title test passed");
        }

    }
}
