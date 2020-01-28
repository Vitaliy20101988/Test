import org.testng.annotations.Test;

import javax.xml.xpath.XPathExpressionException;

public class HPTest extends BaseTest{


    @Test
    public void authorization(){
        HomePage homePage = new HomePage(driver);
//        homePage.autorization(UserData.LOGIN_ADMIN.getValue(), UserData.PASS_ADMIN.getValue());
    }
}
