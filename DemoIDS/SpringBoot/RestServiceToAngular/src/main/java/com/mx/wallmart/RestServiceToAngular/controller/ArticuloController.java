package com.mx.wallmart.RestServiceToAngular.controller;

import static org.slf4j.LoggerFactory.getLogger;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.wallmart.RestServiceToAngular.business.ArticulosBO;
import com.mx.wallmart.RestServiceToAngular.persistence.DTO.ArticuloDTO;

/**
 * A very basic Hello World controller which returns the hostname.
 *
 * @author kim
 *
 */
@RestController
public class ArticuloController {

    private static final Logger LOG = getLogger(ArticuloController.class.getName());

    public static final String MESSAGE_KEY = "NumeroCoincidenciasComparacion";
    public static final String HOSTNAME_KEY = "hostname";
    public static final String IP_KEY = "ip";

    @GetMapping(path = "/demo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String, String> helloWorld() throws UnknownHostException {
        return getResponse();
    }

    private Map<String, String> getResponse() throws UnknownHostException {

        ArticuloDTO articulo1 = new ArticuloDTO();
        articulo1.setId("1");
        articulo1.setNombre("Mochila");

        ArticuloDTO articulo2 = new ArticuloDTO();
        articulo2.setId("2");
        articulo2.setNombre("Plátano");

        ArticuloDTO articulo3 = new ArticuloDTO();
        articulo3.setId("3");
        articulo3.setNombre("Manzana");

        ArticuloDTO articulo4 = new ArticuloDTO();
        articulo4.setId("4");
        articulo4.setNombre("Auto");

        ArticuloDTO articulo5 = new ArticuloDTO();
        articulo5.setId("5");
        articulo5.setNombre("Manzana");

        ArticuloDTO articulo6 = new ArticuloDTO();
        articulo6.setId("6");
        articulo6.setNombre("Celular");

        ArticuloDTO articulo21 = new ArticuloDTO();
        articulo21.setId("21");
        articulo21.setNombre("Lámpara");

        ArticuloDTO articulo7 = new ArticuloDTO();
        articulo7.setId("7");
        articulo7.setNombre("Plátano");

        ArticuloDTO articulo8 = new ArticuloDTO();
        articulo8.setId("8");
        articulo8.setNombre("Pera");

        ArticuloDTO articulo9 = new ArticuloDTO();
        articulo9.setId("9");
        articulo9.setNombre("Monitor");

        ArticuloDTO articulo10 = new ArticuloDTO();
        articulo10.setId("10");
        articulo10.setNombre("Escritorio");

        ArticuloDTO articulo11 = new ArticuloDTO();
        articulo11.setId("11");
        articulo11.setNombre("CPU");

        ArticuloDTO articulo12 = new ArticuloDTO();
        articulo12.setId("12");
        articulo12.setNombre("Bocina");

        ArticuloDTO articulo13 = new ArticuloDTO();
        articulo13.setId("13");
        articulo13.setNombre("Mouse");

        ArticuloDTO articulo14 = new ArticuloDTO();
        articulo14.setId("14");
        articulo14.setNombre("Manzana");

        ArticuloDTO articulo15 = new ArticuloDTO();
        articulo15.setId("15");
        articulo15.setNombre("Teclado");

        ArticuloDTO articulo16 = new ArticuloDTO();
        articulo16.setId("16");
        articulo16.setNombre("Manzana");

        ArticuloDTO articulo17 = new ArticuloDTO();
        articulo17.setId("17");
        articulo17.setNombre("Plátano");

        ArrayList<String> listaArticulosA = new ArrayList<String>();

        listaArticulosA.add(articulo1.getNombre());
        listaArticulosA.add(articulo2.getNombre());
        listaArticulosA.add(articulo3.getNombre());
        listaArticulosA.add(articulo4.getNombre());
        listaArticulosA.add(articulo5.getNombre());
        listaArticulosA.add(articulo6.getNombre());
        listaArticulosA.add(articulo7.getNombre());
        listaArticulosA.add(articulo8.getNombre());
        listaArticulosA.add(articulo9.getNombre());
        listaArticulosA.add(articulo10.getNombre());
        listaArticulosA.add(articulo11.getNombre());
        listaArticulosA.add(articulo12.getNombre());
        listaArticulosA.add(articulo13.getNombre());
        listaArticulosA.add(articulo14.getNombre());
        listaArticulosA.add(articulo15.getNombre());
        listaArticulosA.add(articulo16.getNombre());
        listaArticulosA.add(articulo17.getNombre());
        listaArticulosA.add(articulo21.getNombre());

        ArrayList<String> listaArticulosB = new ArrayList<String>();

        ArticuloDTO articulo18 = new ArticuloDTO();
        articulo18.setId("18");
        articulo18.setNombre("Manzana");

        ArticuloDTO articulo19 = new ArticuloDTO();
        articulo19.setId("19");
        articulo19.setNombre("Plátano");

        ArticuloDTO articulo20 = new ArticuloDTO();
        articulo20.setId("20");
        articulo20.setNombre("Pera");

        listaArticulosB.add(articulo18.getNombre());
        listaArticulosB.add(articulo19.getNombre());
        listaArticulosB.add(articulo20.getNombre());

        ArticulosBO articulosBO = new ArticulosBO();

        StringBuffer totalArticulosCoincidentes= new StringBuffer();
        
        totalArticulosCoincidentes = articulosBO.contarArticulosRepetidos(listaArticulosA, listaArticulosB);

        String host = InetAddress.getLocalHost().getHostName();
        String ip = InetAddress.getLocalHost().getHostAddress();
        Map<String, String> response = new HashMap<>();
        // if (totalArticulosRepetidos != null && totalArticulosRepetidos != 0) {
        // response.put(MESSAGE_KEY, totalArticulosRepetidos);
        // }else{
        // response.put(MESSAGE_KEY, "Defaul Value");
        // }
        response.put(MESSAGE_KEY, totalArticulosCoincidentes.toString());
        response.put(HOSTNAME_KEY, host);
        response.put(IP_KEY, ip);
        LOG.info("Returning {}", response);
        return response;
    }

}
