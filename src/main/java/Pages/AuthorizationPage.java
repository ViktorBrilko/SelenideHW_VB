package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage extends BasePage{

    public AuthorizationPage checkOnPage() {
        String navigationPanel = $(By.xpath("//span[@class='navigation_page']")).getText();
        Assert.assertEquals("Authentication", navigationPanel);
        return this;
    }

    public MyAccountPage doAuthorize(String login, String pass) {
        $(By.xpath("//input[@id='email']")).setValue(login);
        $(By.xpath("//input[@id='passwd']")).setValue(pass);
        $(By.xpath("//button[@id='SubmitLogin']")).click();
        return new MyAccountPage();
    }
}
