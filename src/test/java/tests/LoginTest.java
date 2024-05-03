package tests;

import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AuthenticationScreen;
import screens.ContactListScreen;
import screens.SplashScreen;

public class LoginTest extends AppiumConfig {

    @Test
    public void loginPositive() throws InterruptedException {
        ContactListScreen contactListScreen = new SplashScreen(driver)
                .switchToAuthScreen()
                .fillEmailField("abcd@mail.ru")
                .fillPasswordField("Ab01234@")
                .clickByLoginButton();
        AuthenticationScreen authenticationScreen = contactListScreen.logout();
        Assert.assertTrue(authenticationScreen.isItAuthenticationScreen());
    }

    @Test
    public void loginTestNegative() {
        AuthenticationScreen authenticationScreen = new SplashScreen(driver).switchToAuthScreen()
                .fillEmailField("mail")
                .fillPasswordField("pass")
                .clickByLoginButton();
        Assert.assertTrue(authenticationScreen.isItAuthenticationScreen());
    }
}