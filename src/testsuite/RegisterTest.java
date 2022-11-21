package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class RegisterTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        browserSetUp(baseUrl);
    }
    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){
        //click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));
        //Expected Text
        String expectedText = "Register";
        //Find Register Element and get the text
        WebElement actualTextElement = driver.findElement(By.linkText("Register"));
        String actualText = actualTextElement.getText();
        //Validate actual and expected Text
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));
        // Select gender radio button
        clickOnElement(By.id("gender-female"));
        //Enter First name
        sendTextToElement(By.name("FirstName"),"Savitri");
        //Enter Last name
        sendTextToElement(By.id("LastName"),"Alagiya");
        //Select Day Month and Year
        sendTextToElement(By.name("DateOfBirthDay"),"20");
        sendTextToElement(By.name("DateOfBirthMonth"),"02");
        sendTextToElement(By.name("DateOfBirthYear"),"1986");
        // Enter Email address
        sendTextToElement(By.id("Email"),"admin123@gmail.com");
        //Enter Password
        sendTextToElement(By.id("Password"),"admin123");
        //Enter Confirm password
        sendTextToElement(By.id("ConfirmPassword"),"admin123");
        //Click on REGISTER button
        clickOnElement(By.name("register-button"));
        //Verify the text 'Your registration completed’
        //Expected Text
        String expectedText = "Your registration completed";
        //Find the element and get the text
        String actualText = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        //Validate expected and actual
       Assert.assertEquals(expectedText,actualText);
    }

    @After
    public void tearDown(){
       // closeBrowser();
    }

}
