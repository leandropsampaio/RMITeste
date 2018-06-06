/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro Pereira Sampaio
 */
public class Servidor extends UnicastRemoteObject implements Servico {

    public Servidor() throws RemoteException {
        super();
    }

    public static void main(String[] args) {
        try {
            Servidor servidor = new Servidor();
            String localizacao = "//localhost/servico";
            Naming.rebind(localizacao, servidor);
            
        } catch (RemoteException | MalformedURLException ex) {
            System.out.println("ERRO:" + ex.getMessage());
        }

    }

    @Override
    public String getDataHora() throws RemoteException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        return sdf.format(Calendar.getInstance().getTime());
    }
}
