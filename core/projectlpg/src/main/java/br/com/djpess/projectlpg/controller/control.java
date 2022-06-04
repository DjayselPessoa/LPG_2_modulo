package br.com.djpess.projectlpg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class control {
    @GetMapping(value="/")
    public String getMethodName() {
        return "Olá! Iniciando!";
    }
    
}
