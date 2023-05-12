package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    @CacheLookup
    // @FindBy(xpath = "//label[@for='per-page']")
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultsText;

    public void verifyTheResults(String expected) {
        CustomListeners.test.log(Status.PASS, "Verify the results");
        Reporter.log("Verify the results" + resultsText.toString());
        String actual = getTextFromElement(resultsText);
        Assert.assertEquals(expected, actual);
    }
}