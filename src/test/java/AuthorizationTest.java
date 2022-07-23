import Pages.AuthorizationPage;
import Pages.BasePage;
import Pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class AuthorizationTest extends BaseTest {

    @Test
    public void doAuthorizeTest() {
        open("http://automationpractice.com/index.php");
        BasePage basePage = new BasePage();
        AuthorizationPage authorizationPage = basePage.clickSignIn();
        authorizationPage.checkOnPage();
        MyAccountPage myAccountPage = authorizationPage.doAuthorize("skillupdemo@gmail.com", "12345");
        String accountName = myAccountPage.getAuthorizedAccount();
        Assert.assertEquals(accountName, "name lasr");
    }

}
