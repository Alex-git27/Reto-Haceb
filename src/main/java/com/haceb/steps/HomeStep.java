package com.haceb.steps;

import com.haceb.PageObject.HomePage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

public class HomeStep {

    @Page
    HomePage homePage;

    @Managed (driver = "chrome")
    WebDriver driver;

    public void abrirNavegador (){
        homePage.
    }

    @Step("dar clic en registrarse")
    public void clciRegistro(){

    }

}
