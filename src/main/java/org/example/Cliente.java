package org.example;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.connectServer();
    }

    private void connectServer() {
        try {
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 4321);
            RMI interfaz = (RMI) registro.lookup("RemotoRMI");

            System.out.println("5 libras en euros son: " + interfaz.librasEuros(5) + " euros.");
            System.out.println("2 euros en libras son: " + interfaz.eurosLibras(4) + " libras.");
            System.out.println("32 dólares en euros son: " + interfaz.dolaresEuros(32) + " euros.");
            System.out.println("420 euros en dolares son: " + interfaz.eurosDolares(420) + " dolares.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
