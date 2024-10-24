package com.Back.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

	  // Método para autenticar a un usuario con su nombre de usuario y contraseña
    public boolean autenticar(String username, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("integrantes.txt"))) {
            String line;
            // Lee el archivo línea por línea
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                // Verifica si la línea tiene el formato correcto y si coinciden el username y password
                if (parts.length == 4 && parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // En caso de error en la lectura del archivo
        }
        return false; // Si no se encuentra coincidencia o hay un error, retorna false
    }

}
