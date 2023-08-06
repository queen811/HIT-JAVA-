package btvn1;

import java.util.Scanner;

public class btvn1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so nguyen duong n: ");
        n= sc.nextInt();
            if(n <=0){
                System.out.println("Nhap lai");
            }

        }while (n<=0);
        for( int i=1; i<=n;i++){
            if(i==1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print( "*");
                }
                System.out.println();
            }
            else if(i==n){
                for (int j = 1; j <= n; j++) {
                    System.out.print( "*");
                }
                System.out.println();

            }
            else{
                for(int j=1; j<= n; j++){
                    if (j==1) {
                        System.out.print("*");
                    }
                     if ( j > 1 && j < n){
                        System.out.print(" ");
                    }
                    if (j == n){
                        System.out.println("*");
                    }

                }
            }
        }
    }
}
