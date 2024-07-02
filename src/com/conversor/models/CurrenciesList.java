package com.conversor.models;

import java.util.Scanner;

public class CurrenciesList {
    public void currenciesMenu() {
        String currencies = """
                1. (USD) Dólar Estadounidense   | 10. (MXN) Peso Mexicano       | 19. (ZAR) Rand Sudafricano
                2. (EUR) Euro                   | 11. (HKD) Dólar de Hong Kong  | 20. (BRL) Real Brasileño
                3. (JPY) Yen japonés            | 12. (SEK) Corona Sueca        | 21. (ARS) Peso Argentino
                4. (GBP) Libra esterlina        | 13. (SGD) Dólar de Singapur   | 22. (CLP) Peso Chileno
                5. (AUD) Dólar australiano      | 14. (NOK) Corona Noruega      | 23. (COP) Peso Colombiano
                6. (CAD) Dólar canadiense       | 15. (KRW) Won Surcoreano      | 24. (PEN) Sol Peruano
                7. (CHF) Franco suizo           | 16. (TRY) Lira Turca          | 25. (UYU) Peso Uruguayo
                8. (NZD) Dólar neozelandés      | 17. (RUB) Rublo Ruso          | 26. (PKR) Rupia Pakistaní
                9. (CNY) Renminbi chino         | 18. (INR) Rupia India         |  
                """;
        System.out.println(currencies);
    }

    public void showList() {
        Scanner scanner = new Scanner(System.in);
        currenciesMenu();
        System.out.print("Presiona Enter para Salir.");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Saliendo al Menú Principal.");
                break;
            } else {
                System.out.println("Error, presiona Enter para salir.");
            }
        }
    }
}