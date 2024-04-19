package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class ContactListScreen extends BaseScreen{

    public ContactListScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@content-desc='More options']")
    MobileElement moreOptions;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/title']")
    MobileElement logoutButton;
    public AuthenticationScreen logout(){
        moreOptions.click();
        logoutButton.click();
        return new AuthenticationScreen(driver);
    }
}
