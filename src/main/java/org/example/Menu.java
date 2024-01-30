package org.example;

import java.util.Scanner;

public class Menu {
   final private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }
    // Método para solicitar un correo electrónico al cuál mandar
    public String obtenerCorreoDestino() {
        System.out.print("Introduce el correo electrónico de destino: ");
        return scanner.nextLine();
    }
    // Método para solicitar el asunto del correo
    public String obtenerAsunto() {
        System.out.print("Introduce el asunto del correo: ");
        return scanner.nextLine();
    }
    // Método de escritura del correo electrónico
    public String obtenerMensaje() {
        System.out.print("Introduce el mensaje a enviar: ");
        return scanner.nextLine();
    }
}
