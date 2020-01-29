
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super (driver, 10);
    }

    private By LoginField = By.id("modlgn-username");
    private By PassField = By.id("modlgn-passwd");
    private By BTN = By.xpath("//*[@id=\"form-login-submit\"]/div/button");

    public By getBTN() {
        return BTN;
    }

    public By getLoginField(){
        return LoginField;
    }
    public By getPassField(){
        return PassField;
    }


    public HomePage autorization(String login, String pass){
        sendKeys(getLoginField(), login);
        sendKeys(getPassField(), pass);
        clickElement(getBTN());
//        assertAutoriz(login);
        return this;
    }
//
//    public HomePage assertAutoriz(String loginName){
//        assertTextContains(getBtnMap().get("Privet"), "Приветствуем Вас, " + loginName);
//        return this;
//    }

}
