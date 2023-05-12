package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;
@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {

        ResultPage resultPage;
        HomePage homePage;

        @BeforeMethod(alwaysRun = true)
        public void inIt(){
            homePage = new HomePage();
            resultPage = new ResultPage();

        }
        @Test(dataProvider = "job search",dataProviderClass = TestData.class)
        public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                               String result)throws InterruptedException{

           // Thread.sleep(2000);
            driver.switchTo().frame(4);


            homePage.acceptIFrameAlert();
            driver.switchTo().defaultContent();
            homePage.enterJobTitle(jobTitle);
            homePage.enterLocation(location);
            homePage.selectDistance(distance);
            homePage.clickOnMoreSearchOptionLink();
            homePage.enterMinSalary(salaryMin);
            homePage.enterMaxSalary(salaryMax);
          //  Thread.sleep(2000);
            homePage.selectSalaryType(salaryType);
            homePage.selectJobType(jobType);
            homePage.clickOnFindJobsButton();
            resultPage.verifyTheResults(result);


}

    }


