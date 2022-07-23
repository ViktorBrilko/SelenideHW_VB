package Pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$$;

public class ProductListPage extends BasePage{

    public void addFirstProductToWishlist(){
        $$(By.xpath("//div[@class='product-container']")).get(0).hover().find(By.cssSelector("a.addToWishlist")).click();
    }
}
