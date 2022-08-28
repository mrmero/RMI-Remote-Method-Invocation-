/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client;

import java.rmi.*;
import java.util.Scanner;
import operation.op;
/**
 *
 * @author mero2
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        try{
        op o=(op) Naming.lookup("rmi://192.168.43.254:12345/cal");
            
        while (true) { 
            System.out.println("1-Enter a number one if you want to combine \n"
                    + "2-Enter a number two if you want to Subtract \n"
                    + "3-Enter a number three if you want to Multiply \n"
                    + "4-Enter a number  four if you want to Dividing \n");
            int choice =sc.nextInt();
            int x,y;
            switch(choice)
            {
                case 1:
                    System.out.println("the function is combine ");
                    System.out.println("Enter the number One");
                    x=sc.nextInt();
                    System.out.println("Enter the number Two");
                    y=sc.nextInt();
                    System.out.println("the result = "+o.sum(x, y));
                    break;
                    
               case 2:
                      System.out.println("the function is Subtract ");

                    System.out.println("Enter the number One");
                    x=sc.nextInt();
                    System.out.println("Enter the number Two");
                    y=sc.nextInt();
                    System.out.println("the result = "+o.sub(x, y));
                    break;
                    
               case 3:
                     System.out.println("the function is Multiply ");

                    System.out.println("Enter the number One");
                    x=sc.nextInt();
                    System.out.println("Enter the number Two");
                    y=sc.nextInt();
                    System.out.println("the result = "+o.mul(x, y));
                    break;
                    
              case 4:
                    System.out.println("the function is Dividing ");

                    System.out.println("Enter the number One");
                    x=sc.nextInt();
                    System.out.println("Enter the number Two");
                    y=sc.nextInt();
                    System.out.println("the result = "+o.div(x, y));
                    break;
                    
            }
            
        }
        }catch(Exception ex)
        {
        }
    }
    
}
