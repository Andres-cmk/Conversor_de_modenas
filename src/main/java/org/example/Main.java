package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Main {
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

            while (opcion != 18){
                API.getMenu();
                opcion = Integer.parseInt(input.readLine());

                switch (opcion){
                    case 1:

                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        double monto = Double.parseDouble(input.readLine());
                        Map<String, Object> map = API.getMapFromApi("USD","ARS", monto);
                        System.out.println("El monto " + monto + " [USD] en pesos argentinos es " + map.get("conversion_result") + " [ARS]");
                        break;
                    case 2:

                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("ARS","USD", monto);
                        System.out.println("El monto " + monto + " [ARS] en dolares es " + map.get("conversion_result") + " [USD]");
                        break;
                    case 3:

                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("USD", "BRL", monto);
                        System.out.println("El monto " + monto + " [USD] en real brasileño es " + map.get("conversion_result") + " [BRL]");
                        break;
                    case 4:

                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("BRL","USD", monto);
                        System.out.println("El monto " + monto + " [BRL] en dolares es " + map.get("conversion_result") + " [USD]");
                        break;
                    case 5:

                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("USD","COP", monto);
                        System.out.println("El monto " + monto + " [USD] en peso colombiano es " + map.get("conversion_result") + " [COP]");
                        break;
                    case 6:

                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("COP","USD", monto);
                        System.out.println("El monto " + monto + " [COP] en dolares es " + map.get("conversion_result") + " [USD]");
                        break;
                    case 7:
                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("USD","EUR", monto);
                        System.out.println("El monto " + monto + " [USD] en eures es " + map.get("conversion_result") + " [EUR]");
                        break;
                    case 8:
                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("EUR","USD", monto);
                        System.out.println("El monto " + monto + " [EUR] en dolares es " + map.get("conversion_result") + " [USD]");
                        break;
                    case 9:
                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("USD","GBP", monto);
                        System.out.println("El monto " + monto + " [USD] en libras esterlinas es " + map.get("conversion_result") + " [GBP]");
                        break;
                    case 10:
                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("GBP","USD", monto);
                        System.out.println("El monto " + monto + " [GBP] en dolares es " + map.get("conversion_result") + " [USD]");
                        break;
                    case 11:
                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("USD","JPY", monto);
                        System.out.println("El monto " + monto + " [USD] en yueanes japones es " + map.get("conversion_result") + " [JPY]");
                        break;
                    case 12:
                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("JPY","USD", monto);
                        System.out.println("El monto " + monto + " [JPY] en dolares es " + map.get("conversion_result") + " [USD]");
                        break;
                    case 13:
                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("EUR","ARS", monto);
                        System.out.println("El monto " + monto + " [EUR] en pesos argentinos es " + map.get("conversion_result") + " [ARS]");
                        break;
                    case 14:
                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("ARS","EUR", monto);
                        System.out.println("El monto " + monto + " [ARS] en euros es " + map.get("conversion_result") + " [EUR]");
                        break;
                    case 15:
                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("EUR","BRL", monto);
                        System.out.println("El monto " + monto + " [EUR] en reales brasileños es " + map.get("conversion_result") + " [BRL]");
                        break;
                    case 16:
                        time = LocalDateTime.now();
                        resultado = formatter.format(time);
                        fechaOpcion.put(resultado, opcion);

                        System.out.print("Ingrese el valor que desea convertir: ");
                        monto = Double.parseDouble(input.readLine());
                        map = API.getMapFromApi("BRL","EUR", monto);
                        System.out.println("El monto " + monto + " [BRL] en euros es " + map.get("conversion_result") + " [EUR]");
                        break;
                    case 17:
                        System.out.println("Historial");
                        historial.put(nombre,fechaOpcion);
                        System.out.println(historial);
                        break;
                    case 18:
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