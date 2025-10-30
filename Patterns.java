//  Class author:  Miguel Mirabal Q
//  Date created:  10/29/25
//  General description: Creates and prints patterns based on what the user provides.
import java.util.*;

class Patterns{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows");
        stars(scan.nextInt());

        System.out.println("enter number of rows");
        triangle(scan.nextInt());

        scan.close();
    }


    //  precon: a non 0 integer 
    //  poscon: a pattern of stars with the specified number of rows
    public static void stars(int rows){ 

        
        int n =0;
        int b = 0;
        String m = "*";
        while (b<=rows){
            while (n<b){
                System.out.print(m); 
                n+=1;
                m = m+ "**";
            }
            System.out.println("");
            b++;
        }
    }

    //not done to do 
    public static void triangle(int rows){
        int n =0;
       
        while(n<=rows){
             int b =0;
            while(b<n){
                
                System.out.print(n);
                b++;
            }
            System.out.println("");
            n++;
            
        }
    }



}