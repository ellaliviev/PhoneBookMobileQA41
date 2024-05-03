package config;

import helpers.EmailGenerator;
import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "loginData")
    public Object[][] loginData(){

        return new Object[][]{
                {EmailGenerator.generateEmail(5,5,3), "fakePassword2"},
                {"fakeUser2@mail.com", "fakePassword1"}
        };
    }

}