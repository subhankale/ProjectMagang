package com.testing.magang.testpage.login;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.pages.login.LoginPage;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    public static WebDriver driver;
    public static LoginPage pageLog;
    public static ExtentTest ext;

    public TestLogin() {
        driver = LibraryTest.driver;
        pageLog = new LoginPage();
        ext = LibraryTest.extentTest;
    }

    @Given("Open browser and url")
    public void open_browser_and_url() {
        ext.log(LogStatus.PASS, "Open browser and url");
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/login");
    }
    @When("Tanpa input username")
    public void tanpa_input_username() {
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Tanpa input username");
        pageLog.enterUsername("");
    }
    @And("Tanpa input password")
    public void tanpa_input_password() {
        RegularPage.delayDuration(2);
        ext.log(LogStatus.PASS, "Tanpa input password");
        pageLog.enterPassword("");
    }

    @Given("Input username yang terdaftar")
    public void input_username_yang_terdaftar() {
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Input username yang terdaftar");
        pageLog.enterUsername("ucen1315@gmail.com");
    }
    @When("Input password yang tidak terdaftar")
    public void input_password_yang_tidak_terdaftar() {
        ext.log(LogStatus.PASS, "Input password yang tidak terdaftar");
        pageLog.enterPassword("ucen123");
    }

    @Given("Input username yang tidak terdaftar")
    public void input_username_yang_tidak_terdaftar() {
        ext.log(LogStatus.PASS, "Input username yang tidak terdaftar");
        pageLog.enterUsername("ucen@gmail.com");
    }

    @Given("Input username menggunakan nomor handphone")
    public void input_username_menggunakan_nomor_handphone() {
        ext.log(LogStatus.PASS, "Input username menggunakan nomor handphone");
        pageLog.enterUsername("0898123123");
    }

    @When("Input password yang terdaftar")
    public void input_password_yang_terdaftar() {
        ext.log(LogStatus.PASS, "Input password yang terdaftar");
        pageLog.enterPassword("a");
        RegularPage.delayDuration(1);
    }

    @When("Input password yang terdaftar menggunakan huruf kapital")
    public void input_password_yang_terdaftar_menggunakan_huruf_kapital() {
        ext.log(LogStatus.PASS, "Input password yang terdaftar menggunakan huruf kapital");
        pageLog.enterPassword("A");
    }
    @When("Input password menggunakan angka")
    public void input_password_menggunakan_angka() {
        ext.log(LogStatus.PASS, "Input password menggunakan angka");
        pageLog.enterUsername("1");
    }

    @Then("Get message username atau password kosong")
    public void get_message_username_atau_password_kosong() {
        ext.log(LogStatus.PASS, "Get message username atau password kosong");
        Assert.assertEquals(pageLog.getTxtUsernameAtauPasswordKosong(), "username Atau Password Kosong");
    }
    @Then("Get message username atau password salah")
    public void get_message_username_atau_password_salah() {
        ext.log(LogStatus.PASS, "Get message username atau password salah");
        Assert.assertEquals(pageLog.getTxtUsernameAtauPasswordSalah(), "Username Atau Password Salah");
    }
    @Then("Get to page dashboard")
    public void get_to_page_dashboard() {
        ext.log(LogStatus.PASS, "Get to page dashboard");
        Assert.assertEquals(pageLog.getTxtDashboard(), "Dashboard");
    }
    @And("Click button sign-in")
    public void click_button_signin() {
        ext.log(LogStatus.PASS, "Click button sign-in");
        pageLog.btnLogin();
    }
    @And("Click profil")
    public void click_profil() {
        ext.log(LogStatus.PASS, "Click profil");
        pageLog.pageLogot();
    }
    @And("Click button ok")
    public void click_button_ok() {
        ext.log(LogStatus.PASS, "Click button ok");
        RegularPage.delayDuration(1);
        pageLog.buttonOk();
    }
    @And("Click button logout")
    public void click_button_logout() {
        ext.log(LogStatus.PASS, "Click button logout");
        pageLog.btnLogot();
    }
}
