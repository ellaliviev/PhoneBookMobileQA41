package tests;

import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AuthenticationScreen;
import screens.SplashScreen;

public class LoginTest extends AppiumConfig {
    @Test
    public void loginPositive(){
        new SplashScreen(driver).switchToAuthScreen()
                .fillEmailField("abcd@mail.ru")
                .fillPasswordField("Ab01234@").clickByLoginButton();
        AuthenticationScreen authenticationScreen = contactListScreen.logout();
        Assert.assertTrue(authenticationScreen.);
    }
}
