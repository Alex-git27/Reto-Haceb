package com.haceb.steps;

import com.haceb.PageObject.RegistroPage;
import com.haceb.models.DataUsuario;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistroStep {

    @Page
    RegistroPage registroPage;



    @Step("dar click en ingresar y envio de datos al formulario")
    public void registro(){
       WebDriverWait wait = new WebDriverWait(registroPage.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(registroPage.btnIngresar));
        wait.until(ExpectedConditions.visibilityOf(registroPage.txtCerrarModalBloqueante));
        registroPage.txtCerrarModalBloqueante.click();
        WebDriverWait waitSecond = new WebDriverWait(registroPage.getDriver(),Duration.ofSeconds(30));
        registroPage.btnIngresar.click();
        switchToPage(registroPage.getDriver().getWindowHandles().toArray()[1].toString());
    }

    public void switchToPage(String windowHadle){
      registroPage.getDriver().switchTo().window(windowHadle);
    }


    @Step("enviar datos en el primer formulario de registro")
    public void enviarDatos(){
        String correo = DataUsuario.data().get(0).get("Correo");
        registroPage.txtCorreo.type(correo);

        String nombre = DataUsuario.data().get(0).get("Nombre");
        registroPage.txtNombre.type(nombre);

        String apellido = DataUsuario.data().get(0).get("Apellido");
        registroPage.txtApellido.type(apellido);

        String ingresarContrasena = DataUsuario.data().get(0).get("Contrasena");
        registroPage.txtIngresarContrasena.type(ingresarContrasena);

        String contrasena = DataUsuario.data().get(0).get("ConfirmacionContrasena");
        registroPage.txtConContrasena.type(contrasena);

        WebDriverWait wait = new WebDriverWait(registroPage.getDriver(),Duration.ofSeconds(10));

        registroPage.scroll();
    }

    public void clickCheck(){
        registroPage.txtTerminos.click();
        registroPage.txtAutorizo.click();
    }

    @Step("Click en ingresar")
    public void clickRegistrarYDatos(){
        registroPage.btnRegistrar.click();
    }
}
