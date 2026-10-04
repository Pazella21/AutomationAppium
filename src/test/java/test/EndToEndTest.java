package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class EndToEndTest extends BaseTest {

    @Test
    public void loginAndAddToCartTest() {

        HomePage homePage = new HomePage(driver);

        homePage.clickMenu();
        homePage.clickLogin();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("bod@example.com");
        loginPage.enterPassword("10203040");
        loginPage.clickLogin();

        // Assertion login berhasil
        Assert.assertTrue(
                homePage.isHomePageDisplayed(),
                "Login gagal"
        );

        ProductPage productPage = new ProductPage(driver);

        productPage.selectProduct();
        productPage.clickAddToCart();

        // Assertion quantity = 1
        Assert.assertEquals(
                productPage.getQuantity(),
                "1",
                "Quantity produk seharusnya 1"
        );
    }
}