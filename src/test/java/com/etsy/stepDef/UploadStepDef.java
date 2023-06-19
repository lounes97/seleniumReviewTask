package com.etsy.stepDef;

import com.etsy.pages.UploadPage;
import com.etsy.utilities.BrowserUtil;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Keys;

public class UploadStepDef {
    UploadPage uploadPage = new UploadPage();
    @Then("user upload the file")
    public void user_upload_the_file() {
    uploadPage.id.sendKeys("/Users/adilyadanil/Library/CloudStorage/OneDrive-FoothillDeAnzaCCD/ESL 272/Root or Affix Meaning Example Your Word Root or Affix Meaning_files/1.txt");
    uploadPage.submitBtn.click();
    }
    @Then("user verify that the file uploaded is displayed")
    public void user_verify_that_the_file_uploaded_is_displayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(uploadPage.fileUploadedText.isDisplayed());
    }
}
