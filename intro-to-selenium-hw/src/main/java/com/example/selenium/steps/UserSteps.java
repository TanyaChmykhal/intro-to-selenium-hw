package com.example.selenium.steps;
import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;

public class UserSteps {
    private WebDriver driver;
 LoginPage loginPage;
    MainPage mainPage;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public UserSteps login(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.setUsername("tomsmith")
                .setPassword("SuperSecretPassword!");
        mainPage = loginPage.clickLogin();
        //assertEquals(mainPage.getTitle(), "Secure Area", "Login failed");
        return this;
    }

    public UserSteps logout() {
        mainPage = new MainPage(driver);
        mainPage.clickLogout();
        return this;
    }
}