package btvn2b;

import java.util.Scanner;

public class btvn2b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so nguyen duong n: ");
            n= sc.nextInt();
            if(n <= 0){
                System.out.println("Nhap lai");
            }

        }while (n<= 0);
        int P=0;
        int S=1;
        for( int i=1 ; i<= n; i++){
            S *= i;
            P += S;
        }
        System.out.println("P = "+ P);

    }
}
