package Rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Leandro Pereira Sampaio
 */
public interface Servico extends Remote {

    public String getDataHora() throws RemoteException;

}
