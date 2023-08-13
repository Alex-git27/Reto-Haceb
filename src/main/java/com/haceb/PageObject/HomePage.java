package com.haceb.PageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    @FindBy(xpath = "//span[@class=\"icon-user\"]")
    public WebElementFacade txtPerfil;

    @FindBy(xpath = "//a[@class='cdc-fire cdc-register']")
    public WebElementFacade txtRegistrar;

    @FindBy(xpath = "//button[@id='vtexIdUI-custom-oauth']//p")
    public WebElementFacade txtClicIngresarHaceb;

    public void realizarHoverElemento() {

        withAction().moveToElement(txtPerfil).build().perform();
        withAction().moveToElement(txtRegistrar).build().perform();
    }
}
