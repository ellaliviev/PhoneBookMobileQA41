package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class EditContactScreen extends BaseScreen {
    public EditContactScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(id = "com.sheygam.contactapp:id/inputName")
    MobileElement inputNameField;
    @FindBy(id = "com.sheygam.contactapp:id/inputLastName")
    MobileElement inputLastNameField;
    @FindBy(id = "com.sheygam.contactapp:id/inputEmail")
    MobileElement inputEmailField;
    @FindBy(id = "com.sheygam.contactapp:id/inputPhone")
    MobileElement inputPhoneField;
    @FindBy(id = "com.sheygam.contactapp:id/inputAddress")
    MobileElement inputAddressField;
    @FindBy(id = "com.sheygam.contactapp:id/inputDesc")
    MobileElement inputDescriptionField;
    @FindBy(id = "com.sheygam.contactapp:id/updateBtn")
    MobileElement updateButton;

    public ContactListScreen submitChanges() {
        updateButton.click();
        return new ContactListScreen(driver);
    }
    public EditContactScreen editEmailField(String email){
        waitForAnElement(updateButton);
        inputEmailField.clear();
        inputEmailField.sendKeys(email);
        return this;

    }



}