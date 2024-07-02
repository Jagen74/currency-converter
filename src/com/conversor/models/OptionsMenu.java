package com.conversor.models;

import com.conversor.ConvMenu;

import java.util.Scanner;

public class OptionsMenu {
    public void mainMenu() {
        String mainOptions = """
                *********** Bienvenido ***************                                
                Sistema de Conversión de Monedas.
                Elije una Opción.
                
                1. Convertir Monedas.
                2. Ver Lista de Divisas Disponibles.
                3. Salir.
                """;
        System.out.println(mainOptions);
    }

    public void selectOption() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 3) {
            mainMenu();
            System.out.print("Seleccione una opción: ");
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        ConvMenu convMenu = new ConvMenu();
                        convMenu.menu();
                        break;
                    case 2:
                        CurrenciesList curList = new CurrenciesList();
                        curList.showList();
                        break;
                    case 3:
                        System.out.println("Saliendo del sistema.");
                        break;
                    default:
                        System.out.println("Opción invalida, intenta de nuevo.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida, por favor intente de nuevo.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
        scanner.close();
    }
}
