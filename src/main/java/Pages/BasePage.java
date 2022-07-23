package Pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public AuthorizationPage clickSignIn(){
        $(By.xpath("//a[@class='login']")).click();
        return new AuthorizationPage();
    }

    public String getAuthorizedAccount() {
        return $(By.xpath("//a[@class='account']")).getText();
    }

    public MyAccountPage goToMyAccount(){
        $(By.xpath("//a[@class='account']")).click();
        return new MyAccountPage();
    }
}
