package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI extends Remote {
    public float librasEuros(float cantidad) throws RemoteException;

    public float eurosLibras(float cantidad) throws RemoteException;

    public float dolaresEuros(float cantidad) throws RemoteException;

    public float eurosDolares(float cantidad) throws RemoteException;

}
