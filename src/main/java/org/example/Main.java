package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void getMenu(){
        StringBuilder menu = new StringBuilder();

        menu.append("************************************************************").append("\n");

        menu.append("Sea Bienvenido/a al converso de Monedas =]").append("\n\n");

        menu.append("(1) Dólar => Peso Argentino").append("\n");
        menu.append("(2) Peso Argentino => Dólar").append("\n");
        menu.append("(3) Dólar => Real Brasileño").append("\n");
        menu.append("(4) Real Brasileño => Dolar").append("\n");
        menu.append("(5) Dolar => Peso Colombiano").append("\n");
        menu.append("(6) Peso colombiano => Dolar").append("\n");
        menu.append("(7) revisar el historial").append("\n");
        menu.append("(8) Salir").append("\n\n");

        menu.append("Elija una opcion valida: ").append("\n");

        menu.append("****************************************************************");
        System.out.println(menu);
    }

    public static void main(String[] args) {
        try {

            LocalDateTime time;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy dd MMMM-HH:mm:ss");
            String resultado;

            HashMap<String,Integer> fechaOpcion = new HashMap<>();
            HashMap<String, HashMap<String,Integer>> historial = new HashMap<>();
            String nombre;


            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Bienvenido al sistema de conversiones :)");
            System.out.print("Ingesa tu nombre: ");
            nombre = input.readLine();

            int opcion = 0;

            while (opcion != 8){
                getMenu();
                opcion = Integer.parseInt(input.readLine());

                switch (opcion){
                    case 1:

                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        double monto = Double.parseDouble(input.readLine());
                        Map<String, Object> map = API.getMapApi("USD","ARS", monto);
                        System.out.println("El monto " + monto + "[USD] en pesos argentinos es " + map.get("conversion_result") + " [ARS]");
                        break;
                    case 2:

                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapApi("ARS","USD", monto);
                        System.out.println("El monto " + monto + "[ARS] en dolares es " + map.get("conversion_result") + " [USD]");
                        break;
                    case 3:

                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapApi("USD", "BRL", monto);
                        System.out.println("El monto " + monto + "[USD] en real brasileño es " + map.get("conversion_result") + " [BRL]");
                        break;
                    case 4:

                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapApi("BRL","USD", monto);
                        System.out.println("El monto " + monto + "[BRL] en dolares es " + map.get("conversion_result") + " [USD]");
                        break;
                    case 5:

                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapApi("USD","COP", monto);
                        System.out.println("El monto " + monto + "[USD] en peso colombiano es " + map.get("conversion_result") + " [COP]");
                        break;
                    case 6:

                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapApi("COP","USD", monto);
                        System.out.println("El monto " + monto + "[COP] en dolares es " + map.get("conversion_result") + " [USD]");
                        break;
                    case 7:
                        System.out.println("El historial: ");
                        historial.put(nombre, fechaOpcion);
                        System.out.println(historial);
                        break;
                    case 8:
                        System.out.println("Gracias por utilizar mi conversion de monedas :3");
                        break;
                    default:
                        System.out.println("La opcion no es valida.");
                        break;
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}