package com.testing.magang.pages.login;


import com.testing.magang.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[normalize-space()='Admin Login']")
    WebElement loginTitle;
    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Sign-In']")
    WebElement btnLogin;
    @FindBy(xpath = "//p[@class='alert alert-warning']")
    WebElement txtUsernameAtauPasswordSalah;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]")
    WebElement txtUsernameAtauPasswordKosong;
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    WebElement txtDashboard;
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement btnOk;
    @FindBy(xpath = "//p[@class='mb-0 font-roboto']")
    WebElement pageLogout;
    @FindBy(xpath = "//span[normalize-space()='Log Out']")
    WebElement btnLogout;

    public String getLoginTitle() {
        return loginTitle.getText();
    }

    public String getTxtUsernameAtauPasswordSalah() {
        return txtUsernameAtauPasswordSalah.getText();
    }

    public String getTxtUsernameAtauPasswordKosong(){
        return txtUsernameAtauPasswordKosong.getText();
    }

    public String getTxtDashboard() {
        return txtDashboard.getText();
    }

    public void enterUsername(String username) {
        this.username.sendKeys(username);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }


    public void btnLogin() {
        btnLogin.click();
    }
    public void buttonOk(){
        btnOk.click();
    }
    public void btnLogot() {
        btnLogout.click();
    }

    public void pageLogot() {
        pageLogout.click();
    }
}
