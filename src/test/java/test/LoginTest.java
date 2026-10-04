package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {


        HomePage homePage = new HomePage(driver);


        homePage.clickMenu();


        homePage.clickLogin();


        LoginPage loginPage = new LoginPage(driver);


        loginPage.enterUsername("bod@example.com");


        loginPage.enterPassword("10203040");


        loginPage.clickLogin();


        Assert.assertTrue(
                homePage.isHomePageDisplayed(),
                "Login gagal: halaman utama tidak muncul"
        );
    }
}