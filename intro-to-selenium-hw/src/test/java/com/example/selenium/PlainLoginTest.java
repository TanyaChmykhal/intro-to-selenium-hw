package com.example.selenium;
        import org.testng.annotations.Test;
public class PlainLoginTest extends BaseTest{


    @Test
    public void login() {
        userSteps.login("tomsmith", "SuperSecretPassword!");
        userSteps.logout();
    }
}



