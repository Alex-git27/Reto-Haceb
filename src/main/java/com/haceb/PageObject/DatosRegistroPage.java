package com.haceb.PageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DatosRegistroPage extends PageObject {
    @FindBy(xpath = "//form[@id='gigya-profile-form']//input[@id='gigya-textbox-153635908553265760']")
    public WebElementFacade txtCedula;

    @FindBy(xpath = "//select[@id='gigya-dropdown-153944062160082270']")
    public WebElementFacade txtGenero;

    @FindBy(xpath = "//input[@id='gigya-textbox-29430652596742216']")
    public WebElementFacade txtFecha;

    @FindBy(xpath = "//form[@id='gigya-profile-form']//select[@aria-label='Código']")
    public WebElementFacade txtExt;

    @FindBy(xpath = "//input[@placeholder='Numero de contacto']")
    public WebElementFacade txtNumero;

    @FindBy(xpath = "//select[@id='gigya-dropdown-92626747568210580']")
    public WebElementFacade txtDepartamento;

    @FindBy(xpath = "//select[@id='gigya-dropdown-68670919361457840']")
    public WebElementFacade txtCiudad;

    @FindBy(xpath = "//input[@value='Enviar']")
    public WebElementFacade btnEnviar;
}
