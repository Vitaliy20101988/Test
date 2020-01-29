import Helpers.Parser;
import org.testng.annotations.Test;
import test.BaseTest;

public class HPTest extends BaseTest {


    @Test
    public void authorization() {
        HomePage homePage = new HomePage(driver);
        homePage.autorization(Parser.getLoginValue(), Parser.getPassValue());
    }

}
