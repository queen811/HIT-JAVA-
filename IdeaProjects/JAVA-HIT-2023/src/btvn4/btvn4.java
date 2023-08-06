package btvn4;

import java.util.Scanner;
import java.lang.Math;

public class btvn4 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap so a: ");
                double a = sc.nextDouble();
                System.out.print("Nhap sp b: ");
                double b = sc.nextDouble();
                System.out.print("Nhap so c: ");
                double c = sc.nextDouble();
                double x1;
                double x2;
                System.out.println(  a + "x^4" + b +"x^2"+ c +"=0");

                if( a==0 ){
                    if(b==0){
                        if(c==0){
                        System.out.println("phuong trinh vo so nghiem");
                    }
                        else {
                            System.out.println("phuong trinh vo nghiem");
                        }
                    }
                    else{
                        if( ((-c)/b) < 0){
                            System.out.println("phuong trinh vo nghiem");
                        }
                        else{
                             x1= Math.sqrt((-c)/b);
                             x2= -Math.sqrt((-c)/b);
                            System.out.println("x1=" +x1);
                            System.out.println("x2=" + x2);

                        }
                    }
                }
                else{
                    double t1;
                    double t2;

                    double delta= b*b - 4*a*c;
                    if ( delta < 0 ){
                        System.out.println("Phuong trinh vo nghiem");
                    }
                    else if ( delta == 0) {
                         t1 = (-b)/(2*a);
                        if ( t1 > 0 ){
                            System.out.println("Phuong trinh co 2 nghiem: ");
                            System.out.println("x1=" + Math.sqrt(t1));
                            System.out.println("x2="+ (-Math.sqrt(t1)));

                        }
                        if( t1 == 0){
                            System.out.println("Phuong trinh co 1 nghiem x=0");
                        }
                        else {
                            System.out.println("Phuong trinh vo nghiem");

                        }

                    }
                    else{
                        t1= (-b + Math.sqrt(delta))/(2*a);
                        t2= (-b - Math.sqrt(delta))/(2*a);
                        double x3;
                        double x4;
                       if( t1 >0 && t2 >0){
                           System.out.println("phuong trinh co 4 nghiem phan biet:");
                           x1 = Math.sqrt(t1);
                           x2 = -Math.sqrt(t1);
                           x3 = Math.sqrt(t2);
                           x4 = -Math.sqrt(t2);
                           System.out.println("x1="+x1);
                           System.out.println("x2="+x2);
                           System.out.println("x3="+x3);
                           System.out.println("x4="+x4);

                       }
                       else if ( t1 > 0 && t2<0){
                           System.out.println("phuong trinh co hai nghiem phan biet:");
                           System.out.println("x1=" + Math.sqrt(t1));
                           System.out.println("x2="+ (-Math.sqrt(t1)));
                       }
                       else if ( t1 < 0 && t2 > 0){
                           System.out.println("phuong trinh co hai nghiem phan biet:");
                           System.out.println("x1=" + Math.sqrt(t2));
                           System.out.println("x2="+ (-Math.sqrt(t2)));

                       }
                       else if ( t1 ==0 && t2 > 0){
                           System.out.println("phuong trinh co 3 nghiem phan biet:");
                           System.out.println("x1=0");
                           System.out.println("x2=" + Math.sqrt(t2));
                           System.out.println("x3="+ (-Math.sqrt(t2)));
                       }
                       else if ( t1 > 0 && t2 == 0){
                               System.out.println("phuong trinh co 3 nghiem phan biet:");
                               System.out.println("x1=0");
                               System.out.println("x2=" + Math.sqrt(t1));
                               System.out.println("x3="+ (-Math.sqrt(t1)));
                       }
                       else if ( ((t1 < 0) || (t2 < 0)) && ((t1==0)||(t2==0))){
                            System.out.println("Phuong trinh co mot nghiem x=0");

                       }
                       else {
                            System.out.println("phuong trinh vo nghiem");
                        }

                    }
                }

            }
        }


