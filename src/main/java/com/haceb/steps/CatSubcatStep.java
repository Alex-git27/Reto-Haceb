package com.haceb.steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatSubCatStep extends PageObject {
    @FindBy(xpath = "//img[@alt='Electrodomésticos Haceb']")
    public WebElementFacade btnMenu;

    @FindBy(xpath = "//a[@title='Electrodomésticos de cocina']")
    public WebElementFacade txtCategoria;

    @FindBy(xpath = "//li[@class='has-children cocina-line']//li")
    public List<WebElement> listSubCategorias;

    public void realizarHoverCategoria() {
        withAction().moveToElement(txtCategoria).build().perform();
    }

    @FindBy(xpath = "//a[@title='Electrodomésticos de cocina']")
    public WebElementFacade btnComprar;

}
