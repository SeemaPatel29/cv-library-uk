package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement accpetCookies;
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(id = "location")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@class='hp-distance form__select']")
    WebElement selectDistance;
    @CacheLookup
    @FindBy(xpath = "//div[@class='hp-search-more']//button[@type='button']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Salary Min']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Salary Max']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@class='hp-sal-type form__select']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@class='hp-jobtype form__select']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Find Jobs']")
    WebElement findJobsBtn;

public void acceptIFrameAlert(){
    CustomListeners.test.log(Status.PASS,"gdpr-consent-notice");
    mouseHoverToElementAndClick(accpetCookies);
    Reporter.log("gdpr-consent-notice" + accpetCookies.toString());
}
    public void enterJobTitle(String enterjobTitle) {
    CustomListeners.test.log(Status.PASS,"Search By JobTitle");
        sendTextToElement(jobTitle,enterjobTitle);
        Reporter.log("Search By JobTitle" + jobTitle.toString());
    }

    public void enterLocation(String enterLocation) {
        CustomListeners.test.log(Status.PASS,"Search By location");
        sendTextToElement(location,enterLocation);
        Reporter.log("Search By location" + location.toString());
    }

    public void selectDistance(String distance) {
        CustomListeners.test.log(Status.PASS,"Search By Distance");
        selectByVisibleTextFromDropDown(selectDistance,distance);
        Reporter.log("Search By Distance" + selectDistance.toString());
    }

    public void clickOnMoreSearchOptionLink() {
        CustomListeners.test.log(Status.PASS,"Search By More Option");
        clickOnElement(moreSearchOptionsLink);
        Reporter.log("Search By More Option" + moreSearchOptionsLink.toString());
    }

    public void enterMinSalary(String minSalary) {
        CustomListeners.test.log(Status.PASS,"Minimum Salary");
        sendTextToElement(salaryMin,minSalary);
        Reporter.log("Minimum Salary" + minSalary.toString());
    }

    public void enterMaxSalary(String maxSalary) {
        CustomListeners.test.log(Status.PASS,"Maximum Salary");
        sendTextToElement(salaryMax,maxSalary);
        Reporter.log("Maximun Salary" + salaryMax.toString());
    }

    public void selectSalaryType(String salaryType) {
        CustomListeners.test.log(Status.PASS,"Search By Salary Trpe");
        selectByVisibleTextFromDropDown(salaryTypeDropDown,salaryType);
        Reporter.log("Search By Salary Type" + salaryTypeDropDown.toString());
    }

    public void selectJobType(String jobType) {
        CustomListeners.test.log(Status.PASS," Search By Job Type");
    selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
        Reporter.log("Search By Job Type" + jobTypeDropDown.toString());
    }

    public void clickOnFindJobsButton() {
        CustomListeners.test.log(Status.PASS,"Click on Find Button");
        clickOnElement(findJobsBtn);
        Reporter.log("Click on Find Button" + findJobsBtn.toString());
    }






}
