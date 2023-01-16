package org.example;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerRMI extends UnicastRemoteObject implements RMI {

    public ServerRMI() throws RemoteException {
        super();
    }

    public static void main(String[] args) {
        try {
            Registry registro = LocateRegistry.createRegistry(4321);

            registro.rebind("RemotoRMI", new ServerRMI());

            System.out.println("Servidor activo");

        } catch (RemoteException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public float librasEuros(float cantidad) throws RemoteException {
        return (float) (cantidad * 1.13);
    }

    @Override
    public float eurosLibras(float cantidad) throws RemoteException {
        return (float) (cantidad * 0.89);
    }

    @Override
    public float dolaresEuros(float cantidad) throws RemoteException {
        return (float) (cantidad * 0.92);
    }

    @Override
    public float eurosDolares(float cantidad) throws RemoteException {
        return (float) (cantidad * 1.08);
    }
}
