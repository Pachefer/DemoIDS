package com.mx.wallmart.RestServiceToAngular.business;

import java.util.ArrayList;

public class ArticulosBO {

    public ArticulosBO() {

    }

    public StringBuffer contarArticulosRepetidos(ArrayList<String> listaArticulosA, ArrayList<String> listaArticulosB) {

        Integer numeroCoincidenciasManzana = 0;
        Integer numeroCoincidenciasPlatano = 0;
        Integer numeroCoincidenciasPera = 0;

        String strManzana="Manzana";
        String strPlatano="Plátano";
        String strPera="Pera";
        
        StringBuffer salidaComparacion= new StringBuffer();

        if (!listaArticulosA.isEmpty() && !listaArticulosB.isEmpty()) {

            for (String articuloA : listaArticulosA) {

                for (String articuloB : listaArticulosB) {
                    if (articuloA.equalsIgnoreCase(articuloB)) {
        if (articuloA.equalsIgnoreCase(strManzana)) {
            numeroCoincidenciasManzana = numeroCoincidenciasManzana + 1;
    } else if(articuloA.equalsIgnoreCase(strPlatano)){
            numeroCoincidenciasPlatano = numeroCoincidenciasPlatano + 1;
        }else if(articuloA.equalsIgnoreCase(strPera)){
            numeroCoincidenciasPera = numeroCoincidenciasPera + 1;
        }
                    }
                }
            }
            System.out.println("salidaComparacion: " + salidaComparacion);
        }
        salidaComparacion.append(strManzana).append(":").append(numeroCoincidenciasManzana).append(", ").append(strPlatano).append(":").append(numeroCoincidenciasPlatano).append(", ").append(strPera).append(":").append(numeroCoincidenciasPera);
        return salidaComparacion;
    }
}
