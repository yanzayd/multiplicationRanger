/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicatonranger;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class MultiplicatonRanger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0, b=0, c=0, d=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter origin a: "+ a );
         a = in.nextInt();
         System.out.println("Enter extremity b: " + b);
         b = in.nextInt();
         System.out.println("Enter origin c: " + c);
         c = in.nextInt();
         System.out.println("Enter extremity d: " + d);
         d = in.nextInt();
        
        for(int i=a,j=c; i<=b && j<=d; i++,j++)
            System.out.println(i + " * " + j + " = " + (i*j) );
        
        
    } 
}
