#language:es
Característica: Registrar un usuario

  @registroExitoso
  Escenario: Registro Exitoso de un usuario
    Dado que el usuario ingresa a la pagina para registrarse en la opcion mi perfil
    Cuando el usaurio da clic en la opcion de "INGRESAR A HACEB" y completa el formulario de manera exitosa
    Y da click en terminos y condiciones
    Y da click en autorizar
    Y elige la opción de registrarme e ingresa los campos requeridos
    Entonces da click en enviar y se visualizara la informacion del perfil
