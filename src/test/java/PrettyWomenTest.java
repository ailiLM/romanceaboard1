import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class PrettyWomenTest extends BaseUI {
    String currentUrlPrettyWomen;
    String expectedUrlprettyWomen = "https://romanceabroad.com/users/search";

    @Test
    public void testPrettyWomen() {
        driver.findElement(Locators.PRETTY_WOMEN_LINK).click();
        currentUrlPrettyWomen = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPrettyWomen, expectedUrlprettyWomen);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
