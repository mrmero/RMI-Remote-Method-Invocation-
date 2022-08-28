/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package operation;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author mero2
 */
public interface op extends Remote{
    public int sum(int x,int y) throws RemoteException;
    public int sub(int x,int y) throws RemoteException;
    public int mul(int x,int y) throws RemoteException;
    public int div(int x,int y) throws RemoteException;
}
