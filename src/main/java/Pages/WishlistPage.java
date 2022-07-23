package Pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class WishlistPage extends BasePage{

    public String getProductNumberInWishlist(){
        return $(By.xpath("//div[@id='block-history']//td[@class='bold align_center']")).getText();
    }

    public void deleteFromWishlist(){
        $(By.xpath("//a[@class='icon']")).click();
        Selenide.switchTo().alert().accept();    }
}
