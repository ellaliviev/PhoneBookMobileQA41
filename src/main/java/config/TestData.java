package config;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "loginData")
    public Object[][] loginData(){

        return new Object[][]{
                {"fakeUser01@mail.ru", "fakePassword02"},
                {"fakeUser02@mail.ru", "fakePassword01"}
        };
    }

}
