package Pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MyAccountPage extends BasePage{

    public WishlistPage goToWishlist(){
        $(By.xpath("//i[@class='icon-heart']")).click();
        return new WishlistPage();
    }

}
