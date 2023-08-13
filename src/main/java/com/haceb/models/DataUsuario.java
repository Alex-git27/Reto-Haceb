package com.haceb.models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class DataUsuario {

    private static ArrayList<Map<String, String>> datosUser= new ArrayList<>();

    public static ArrayList<Map<String, String>> data(){

        try {
            datosUser = com.haceb.utils.Excel.leerDatosDeHojaDeExcel("src/test/resources/data/DatosUsuario.xlsx", "datosUsuario");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return datosUser;
    }
}
