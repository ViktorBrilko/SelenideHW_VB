import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class WishListTest extends BaseTest{

    @Test
    public void createWishlistTest(){
        open("http://automationpractice.com/index.php");
        BasePage basePage = new BasePage();
        AuthorizationPage authorizationPage = basePage.clickSignIn();
        authorizationPage.checkOnPage();
        MyAccountPage myAccountPage = authorizationPage.doAuthorize("skillupdemo@gmail.com", "12345");
        open("http://automationpractice.com/index.php?id_category=11&controller=category");
        ProductListPage productListPage = new ProductListPage();
        productListPage.addFirstProductToWishlist();
        myAccountPage = productListPage.goToMyAccount();
        WishlistPage wishlistPage = myAccountPage.goToWishlist();
        String productNumber = wishlistPage.getProductNumberInWishlist();
        Assert.assertEquals(productNumber, "1");
        wishlistPage.deleteFromWishlist();
    }
}
