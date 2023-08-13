package com.haceb.steps;

import com.haceb.PageObject.RegistroPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class RegistroStep {

    @Page
    RegistroPage registroPage;

    @Step("clic en ingresar y enviar datos requeridos al form")
    public void registro (){

    }
}
