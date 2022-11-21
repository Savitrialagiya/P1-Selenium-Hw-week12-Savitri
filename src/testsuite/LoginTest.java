package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        browserSetUp(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //click on the login link
        clickOnElement(By.linkText("Log in"));

        //Verify the text ‘Welcome, Please Sign In!’
        String expectedMessage = "Welcome, Please Sign In!";

        //Find the Welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextMessageElement.getText();

        //Validate actual and expected Message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        //click on login page
        clickOnElement(By.linkText("Log in"));

        //Enter Valid Username
        sendTextToElement(By.id("Email"), "admin123@gmail.com");

        //Enter valid password
        sendTextToElement(By.name("Password"), "admin123");

        //click on login button
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //Verify the logout text is display
        clickOnElement(By.xpath("//button[contains(text(),'Log out')]"));

    }
    @Test
    public void verifyTheErrorMessage(){
        //click on login link
        clickOnElement(By.linkText("Log in"));

        //Enter invalid username
        sendTextToElement(By.id("Email"),"admin12@gmail.com");

        //Enter invalid password
        sendTextToElement(By.name("Password"),"admin");

        //click on login button
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //Verify the text message(error message)
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        //Find the error text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));

        //Validate actual and expected message
        Assert.assertEquals("Not navigate to login page",expectedMessage,actualMessage);
    }
    @After
    public void tearDown(){
        //closeBrowser();
    }
}
