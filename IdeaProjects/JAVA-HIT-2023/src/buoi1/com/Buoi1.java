package buoi1.com;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Buoi1 {
    public static void main(String[] args) {
        // System.out.println("Hello mn");
        //System.out.println("hello"+18+2);
        //System.out.println(1+1);
        //System.out.printf("hello %d %s", 18 ,"world !");
        Scanner sc = new Scanner(System.in);
        //System.out.print("nhap chuoi a: ");
        //String a= sc.nextLine();
        //int b=10;
        //System.out.println((double) b);
       for(int i=0; i< 5; i++){
           System.out.println(i);
       }
       int b;

       do{
           System.out.println("nhap b");
           b=sc.nextInt();
           if( b>8){
               System.out.println("nhap lai b:");
           }



       }while(b>8);

    }
    }
