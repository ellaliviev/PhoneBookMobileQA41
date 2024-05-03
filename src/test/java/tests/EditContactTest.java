package tests;

import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.ContactListScreen;
import screens.SplashScreen;

public class EditContactTest extends AppiumConfig {

    @Test
    public void editContactMailPositive(){
        String text = "updatedMail@mail.com";
        new SplashScreen(driver)
                .switchToAuthScreen()
                .fillEmailField("abcd@mail.ru")
                .fillPasswordField("Ab01234@")
                .clickByLoginButton();

        Assert.assertTrue(new ContactListScreen(driver).
                editOneContact().
                editEmailField(text).
                submitChanges().isContactContainsText(text));

    }
















}