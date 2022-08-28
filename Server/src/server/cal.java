 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.rmi.RemoteException;
import operation.op;
import java.rmi.*;
import java.rmi.server.*;


/**
 *
 * @author mero2
 */
public class cal extends UnicastRemoteObject  implements op {

    public cal()throws RemoteException
    {
    
    }
    
    @Override
    public int sum(int x, int y)throws RemoteException {
       return x+y; 
    }

    @Override
    public int sub(int x, int y) throws RemoteException {
        return x-y;
    }

    @Override
    public int mul(int x, int y) throws RemoteException {
        return x*y;
    }    

    @Override
    public int div(int x, int y) throws RemoteException {
        return x/y;
    }
    
    
}
