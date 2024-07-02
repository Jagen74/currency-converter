package com.conversor;

import com.conversor.models.CurBase;
import com.conversor.utils.ConTool;
import java.io.IOException;
import java.util.Scanner;


public class ConvMenu {

    public void menu() {

        ConTool conTool = new ConTool();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("""
                            *******************************************
                            ** Bienvenido(a) al conversor de Monedas **
                            *******************************************""");
            System.out.println("Ingresa la divisa, ej. USD");
            System.out.print("Convertir de: ");
            String moneda1 = scanner.nextLine();

            System.out.println("Ingresa la divisa, ej. USD");
            System.out.print("Convertir a: ");
            String moneda2 = scanner.nextLine();

            System.out.print("Ingrese el monto a convertir: ");
            double cantidad = scanner.nextDouble();

            CurBase resultado = conTool.conversion(moneda1, moneda2, cantidad);
            double cantidadConvertida = cantidad * resultado.conversion_rate();
            System.out.printf("%.2f %s equivalen a %.2f %s%n",
                    cantidad, resultado.base_code(), cantidadConvertida, resultado.target_code());
            System.out.printf("Valor de %s al tipo de cambio respecto a %s: %.2f%n", moneda1, moneda2, resultado.conversion_rate());
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("¿Deseas archivar tus conversiones?");
        String archivar = scanner.nextLine();

    }

}
