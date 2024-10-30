package com.maioara.testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignments { 
	//public static void main(String[] args) throws InterruptedException, AWTException {
	@Test
	public void AssignTest() throws InterruptedException, AWTException {
//ASSIGNMENT1
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prajwal gowda\\eclipse-workspace\\assignments\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://3.7.121.249:8080/maioraSSO/#/");
	driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("kowshikshaiva121@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kowshik@123");
	driver.findElement(By.xpath(" //span[text() =' Log In ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class= 'ant-card-body']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()=' Datastore']")).click();
	Thread.sleep(3000);
    driver.navigate().refresh();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()=' Add Datastore ']/..")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[7]/..")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//nz-select-top-control[@ng-reflect-place-holder='Select Datastore'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Maiora_Datastore']")).click();
	driver.findElement(By.xpath("(//input[@placeholder='Title'])[2]")).sendKeys("prajwal10");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//textarea[@placeholder='Description'])[2]")).sendKeys("data creation10");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text() =' Test ']/..")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(@class,'ant-btn-primary ant-btn n')])[4]")).click();
	Thread.sleep(10000);
	
		//ASSIGNMENT2
	driver.findElement(By.xpath("//span[text()=' Scheduler']/..")).click();Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()=' Create Scheduler ']/..")).click();Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Schedule Name']")).sendKeys("prajwal10");
	driver.findElement(By.xpath("//input[@placeholder='Description']")).sendKeys("prajwal descp 10");Thread.sleep(2000);
	Thread.sleep(2000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_SUBTRACT);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_SUBTRACT);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_SUBTRACT);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_SUBTRACT);
	driver.findElement(By.xpath("(//input[@placeholder='Select time'])[1]")).click();
	driver.findElement(By.xpath("//a[text()=' Now ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@placeholder='Select date'])[2]")).click();Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()=' 31 ']")).click();	
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@placeholder='Select date'])[1]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()=' 29 ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//nz-select-placeholder[text()=' Job Name ']")).click();
	driver.switchTo().activeElement().sendKeys("farheen-source2");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='farheen-source2']")).click();
	Thread.sleep(3000);
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//span[text()=' Save ']/.."))).click().perform();
	driver.findElement(By.xpath("//span[text()=' Save ']/..")).click();
	Thread.sleep(10000);
	driver.quit();
}
}
