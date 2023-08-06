package btvn3;

import java.util.Scanner;

public class btvn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so nguyen duong n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Nhap lai");
            }

        } while (n <= 0);
        for(int i=2; i<n; i++){
                if( n % i == 0){
                    System.out.println( n + " khong phai la so nguyen to");
                    return;
                }
                else {
                    System.out.println(n + " la so nguyen to");
                    return;
                }
        }
    }
}
