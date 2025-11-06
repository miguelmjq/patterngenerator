//  Class author:  Miguel Mirabal Q
//  Date created:  10/29/25
//  General description: Creates and prints patterns based on what the user provides.
import java.util.*;

class Patterns{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows - stars");
      //  stars(scan.nextInt());

        System.out.println("enter number of rows - triangle");
        //triangle(scan.nextInt());

        System.out.println("enter starting number - odds");
     //   odds(scan.nextInt());        

        System.out.println("enter max number - maxE");
        eo(scan.nextInt());  

        System.out.println("enter number of rows - pyramid");
        pyramid(scan.nextInt());  

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

    //precon: an integer above 0
    //poscon: a triangle of numbers
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

    //precon: integer above 0
    //poscon: all the numbers from start to 1 going down by 2 each time
    public static void odds(int start){

        for (int i =0;i<=start;i+=2){
            int n = start-i;
            for(int b =0; b<n; b++){
                System.out.print(n);
                
            }
            System.out.println("");
        }
        
    }

    //precon: integer above 0
    //poscon: 
    public static void eo(int maxE){

        String letter = "E";

        for (int i =0; i<maxE;i++){
            if (maxE%2==0){
                letter ="O";
                
            }
            else if (maxE%2!=0){
                letter ="E";
            }               
        }




    }

    public static void pyramid(int rows){
        for (int i=1; i<rows;i+=2){
            int n = (rows*2)-i;
            
        }


    }
}
