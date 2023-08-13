package com.haceb.stepDefinitions;

import com.haceb.steps.DatosRegistroStep;
import com.haceb.steps.HomeStep;
import com.haceb.steps.RegistroStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class registrarStepDefinitions {

    @Steps
    HomeStep homeStep;

    @Steps
    RegistroStep registroStep;

    @Steps
    DatosRegistroStep datosRegistroStep;

    @Dado("que el usuario ingresa a la pagina para registrarse en la opcion mi perfil")
    public void queElUsuarioIngresaALaPaginaParaRegistrarseEnLaOpcionMiPerfil() {
        homeStep.abrirNavegador();
        homeStep.ClicRegistro();
        homeStep.ClicIngresarHaceb();
        registroStep.enviarDatos();
        registroStep.clickCheck();



    }
    @Cuando("el usaurio da clic en la opcion de {string} y completa el formulario de manera exitosa")
    public void elUsaurioDaClicEnLaOpcionDeYCompletaElFormularioDeManeraExitosa(String string) {



    }
    @Cuando("da click en terminos y condiciones")
    public void daClickEnTerminosYCondiciones() {

    }
    @Cuando("da click en autorizar")
    public void daClickEnAutorizar() {

    }
    @Cuando("elige la opción de registrarme e ingresa los campos requeridos")
    public void eligeLaOpciónDeRegistrarmeEIngresaLosCamposRequeridos() {

    }
    @Entonces("da click en enviar y se visualizara la informacion del perfil")
    public void daClickEnEnviarYSeVisualizaraLaInformacionDelPerfil() {

    }

}
