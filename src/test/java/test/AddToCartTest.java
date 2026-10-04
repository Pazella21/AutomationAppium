package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCartTest() {

        ProductPage productPage = new ProductPage(driver);

        // Select product
        productPage.selectProduct();

        // Add product to cart
        productPage.clickAddToCart();

        // Verify quantity
        Assert.assertEquals(
                productPage.getQuantity(),
                "1",
                "Quantity produk seharusnya 1 setelah Add to Cart"
        );
    }
}