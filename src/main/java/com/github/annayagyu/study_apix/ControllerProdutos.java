package com.github.annayagyu.study_apix;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")


public class ControllerProdutos {

    @PostMapping
    public String create() {
        return "Produto cadastro";
    }

    @PutMapping
    public  String update() {
        return "Produto Atualizado";
    }
    
    @GetMapping
    public String find() {
        return"maça";
    }

    @DeleteMapping
    public void delete() {

    }
}
