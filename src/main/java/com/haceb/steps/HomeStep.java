package com.haceb.steps;

import com.haceb.PageObject.HomePage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

public class HomeStep {
    @Page
    HomePage homePage;



    @Managed(driver = "chrome")
    WebDriver driver;

    public void abrirNavegador(){
        homePage.openUrl("https://www.haceb.com/");
    }

    @Step("Ir a perfil y dar click en registrarse")
    public void ClicRegistro(){
        homePage.realizarHoverElemento();
        homePage.txtRegistrar.click();
    }


    @Step("Dar clic en ingresar a Haceb")
    public void ClicIngresarHaceb(){
        homePage.txtClicIngresarHaceb.click();

    }

}
