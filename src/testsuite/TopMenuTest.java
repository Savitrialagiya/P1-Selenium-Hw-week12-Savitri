package testsuite;

import javafx.scene.control.Tab;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        browserSetUp(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
       //click on the ‘Computers’ Tab
       clickOnElement(By.linkText("Computers"));
       //Expected message
        String expectedMessage = "Computers";
        //Find the Computer text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a"));
        //Validate actual and expected message
        Assert.assertEquals("Not navigate to Computer tab",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on the ‘Electronics’ Tab
        clickOnElement(By.linkText("Electronics"));
        //Expected Text
        String expectedText = "Electronics";
        //Find the Computer text element and get the text
        String actualText = getTextFromElement(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]/a"));
        //Validate actual and expected message
       Assert.assertEquals(expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //click on the ‘Apparel’ Tab
        clickOnElement(By.linkText("Apparel"));
        //Expected text
        String expectedText = "Apparel";
        //Find the element and get the text
        String actualText = getTextFromElement(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[3]/a"));
        //Validate actual and expected message
        Assert.assertEquals("Not navigate to Apparel tab ",expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on the ‘Digital downloads’ Tab
        clickOnElement(By.linkText("Digital downloads"));
        //Expected Text
        String expectedText = "Digital downloads";
        //Find element and get the text
        String actualText = getTextFromElement(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[4]/a"));
        //Validate the actual and expected
        Assert.assertEquals("Not navigate to Digital downloads",expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on the ‘Books’ Tab
        clickOnElement(By.linkText("Books"));
        //Expected Text
        String expectedText = "Books";
        //Find the books element and get the text
        String actualText = getTextFromElement(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[5]/a"));
        //Validate the actual and expected
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //click on the ‘Jewelry’Tab
        clickOnElement(By.linkText("Jewelry"));
        //Expected Text
        String expectedText = "Jewelry";
        //Find the element and get the text
        String actualText = getTextFromElement(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[6]/a"));
        //Validate the actual and expected
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on the ‘Gift Cards’ Tab
        clickOnElement(By.linkText("Gift Cards"));
        //Expected Text
        String expectedText = "Gift Cards";
        //Find element and get the text
        String actualText = getTextFromElement(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[7]/a"));
        //Validate actual and expected
        Assert.assertEquals(actualText, expectedText);
    }
    @After
    public void tearDown(){
       // closeBrowser();
    }
}
