import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super (driver, 10);
    }




//    public By getLoginField(){
//        return LoginField;
//    }
//    public By getPassField(){
//        return PassField;
//    }
//
//
//    public HomePage autorization(String login, String pass){
//        sendKeys(getLoginField(), login);
//        sendKeys(getPassField(), pass);
//        clickElement(getBtnMap().get("EnterBtn"));
//        assertAutoriz(login);
//        return this;
//    }
//
//    public HomePage assertAutoriz(String loginName){
//        assertTextContains(getBtnMap().get("Privet"), "Приветствуем Вас, " + loginName);
//        return this;
//    }

}
