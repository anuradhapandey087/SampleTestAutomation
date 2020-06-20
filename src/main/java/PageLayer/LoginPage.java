package PageLayer;

import org.openqa.selenium.By;

import Base.BaseTest;



public class LoginPage extends BaseTest{
	
	private static String signin="//*[@class='login']";
	private static String email="//*[@id='email']";
    private static String pwd="//*[@id='passwd']";
    private static String submit="//*[@id='SubmitLogin']";
    private static String signout="//*[@class='logout']";
  
    public void loginAction()
    {
    	driver.findElement(By.xpath(signin)).click();
    	driver.findElement(By.xpath(email)).sendKeys("anuradhapandey087@gmail.com ");
    	driver.findElement(By.xpath(pwd)).sendKeys("Nsel@123");
    	
    }
    public void signin()
    {
    	driver.findElement(By.xpath(submit)).click();
    }
    public void verifyHomePage()
    {
    boolean verify=	driver.findElement(By.xpath(signout)).isDisplayed();
    if(verify==true)
    {
    	System.out.println("Test Pass");
    }
    else
    {
    	System.out.println("Test Failed");
    }
    
    }
    
    
}
