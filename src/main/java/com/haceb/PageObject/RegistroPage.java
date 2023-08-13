package com.haceb.PageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistroPage {

    @FindBy(id = "vtexIdUI-custom-oauth")
    public WebElementFacade btnIngresar;

    //Llenar formulario
    @FindBy(xpath = "//input[@id='gigya-loginID-51216659851706440']")
    public WebElementFacade txtCorreo;

    @FindBy(xpath = "//input[@id='gigya-textbox-72173553995486780']")
    public WebElementFacade txtNombre;

    @FindBy(xpath = "//input[@id='gigya-textbox-146410824335495100']")
    public WebElementFacade txtApellido;

    @FindBy(xpath = "//input[@id='gigya-password-54061940132406190']")
    public WebElementFacade txtIngresarContrasena;

    @FindBy(xpath = "//input[@id='gigya-password-142670944012194750']")
    public WebElementFacade txtConfirmarcontrasena;

    @FindBy(xpath = "//label[@for='gigya-checkbox-70031539084410860']//span[@class='gigya-label-text gigya-checkbox-text']")
    public WebElementFacade txtTerminosCondiciones;

    @FindBy(xpath = "//label[@for='gigya-multiChoice-0-98366419479004930']")
    public WebElementFacade txtAutorizo;

    @FindBy(xpath = "//input[@value='REGISTRARME']")
    public WebElementFacade btnRegistrar;


}
