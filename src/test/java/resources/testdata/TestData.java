package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {

        @DataProvider(name = "job search")
        public Object[][] getData() {
            Object[][] data = new Object[][]{
                    {"Tester","Harrow, Greater London","5 miles","30000","50000","Per annum","Permanent","Permanent Tester jobs in Harrow"},
               {"Manager","Hampshire","10 miles","40000","50000","Per annum","Permanent","Permanent Manager jobs in Hampshire"},
                   {"Driver","Waterford County","15 miles","35000","45000","Per annum","Permanent","Permanent Driver jobs in Waterford County"},
                   {"Admin","Harrow on the Hill","10 miles","25000","30000","Per annum","Permanent","Permanent Admin jobs in Harrow on the Hill"},
                    {"Carer Support Worker", "Wales", "5 miles", "28000", "35000", "Per annum", "Permanent", "Permanent Carer Support Worker jobs in Wales"},
                    {"Teacher","Hertfordshire","10 miles","30000","40000","Per annum","Permanent","Permanent Teacher jobs in Hertfordshire"}
            };
            return data;
        }

}
