package com.Back.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class IntegrantesService {
	
	 // Método para obtener una lista con los nombres y apellidos de los integrantes
    public List<String> getIntegrantes() {
        List<String> integrantes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("integrantes.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    integrantes.add(parts[2] + " " + parts[3]); // Nombre y apellido
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return integrantes;
    }


}
