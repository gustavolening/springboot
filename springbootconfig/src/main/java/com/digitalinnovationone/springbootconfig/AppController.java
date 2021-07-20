package com.digitalinnovationone.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


    @Value("${app.message}")
    private String appMessage;

    //Mapeamento variável de ambiente
    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;

    //GetMapping serve para aparecer direto no Browser
    @GetMapping("/")
    public String getAppMessage(){
        return appMessage;
    }

    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable(){
        return "A seguinte variável de ambiente foi passada: "+dbEnvironmentVariable;
        //Mapear variável de ambiente no terminal: export ENV_DB_URL=jdbc:h2:mem:db;DB_CLOSE_DELAY=-1
    }
}
