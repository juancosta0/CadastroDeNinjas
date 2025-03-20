package com.yncs.CadastroDeNinjas.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Responsavel por identificar a minha classe falando que é um controlador
@RequestMapping //Faz com que todas as rotas estejam juntas
public class Controller {

    @GetMapping("/ola") //Identifica a rota da requisição
    public String ola(){
        return "Olá!";
    }
}
