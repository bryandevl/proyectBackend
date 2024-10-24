package com.Back.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Back.Service.IntegrantesService;

@RestController
@CrossOrigin(origins = "*")
public class IntegrantesController {

    @Autowired
    private IntegrantesService integrantesService;

    // Endpoint para obtener la lista de integrantes
    @GetMapping("/get-integrantes")
    public List<String> getIntegrantes() {
        return integrantesService.getIntegrantes();
    }
}
