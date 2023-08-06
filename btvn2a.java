package btvn2;

import java.util.Scanner;

public class btvn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.print(" Nhap so nguye duong n:");
            n = sc.nextInt();

            if ( n< 0){
                System.out.println("Nhap lai");
            }
        }while(n<0);
        double S=0;
        for ( int i=1 ; i<=n ; i++){
            S = S + (1.0/i);
        }

        System.out.println("Gia tri cua bieu thuc la: S="+S);
    }
}
