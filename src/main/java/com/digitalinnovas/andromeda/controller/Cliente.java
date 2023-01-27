package com.digitalinnovas.andromeda.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/cliente")
public class Cliente {
    @RequestMapping(value = "/saludar", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String saludar(){
        return "Hola a todos";
    }

    @RequestMapping(value = "/saludar2", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<String> saludar2(){
        return ResponseEntity.
                status(HttpStatus.OK)
                .header("Content-Type", "application/json")
                .body("{\"name\": \"mary\"}");
    }

    @RequestMapping(value = "/saludar3", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Map<String, Map<String, String>> saludar3(){
        return Map.of("cliente", Map.of("Nombre", "Luis"));
    }
}
