import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver, int waitTime) {
        this.driver = driver;
        wait = new WebDriverWait(driver, waitTime);

    }
//
//    //Click Method
//    public void clickElement(By elementBy) {
//        driver.findElement(elementBy).click();
//    }
//
//    //Send Keys
//    public void sendKeys(By elementBy, String value) {
//        driver.findElement(elementBy).sendKeys(value);
//    }
//
////    Assert//
////    public void AssertEqualURLs(String currentUrl, String expectedURL) {
////        Assert.assertEquals(currentUrl, expectedURL);
////    }
//
//    public void assertTextContains(By elementBy, String textPart) {
//        String text = readText(elementBy);
//        assert text.contains(textPart);
//    }
//
//    public String readText(By elementBy) {
//        return driver.findElement(elementBy).getText();
//    }
//
//
////    public void select(By elementBy, String value) {
////        Select select = new Select(driver.findElement(elementBy));
////        select.selectByValue(value); }
//
//
////    public void AllertAccept() { driver.switchTo().alert().accept(); }
//
//
//    public void clearField(By elementBy){
//        driver.findElement(elementBy).clear();
//    }

}

