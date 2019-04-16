/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasgithub;
import java.util.Scanner;
/**
 *
 * @author AFIFAH NADHIRAH
 */
public class Tugasgithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double stasioner = (-(Math.pow(b,2)- 4*a*c)/4*a);
        double Diskriminan = (Math.pow(b,2)- 4*a*c);
        System.out.println("Polinomial = "+a+"x^2 +"+b+"x +"+c+" memiliki");
        System.out.println("1. Diskriminan = " +(Math.pow(b,2)- 4*a*c));
        if (Diskriminan<0){
            Diskriminan*=-1;
            double f = (-b/(2*a));
            double g = (-Math.sqrt(Diskriminan)/(2*a));
            System.out.println("2. Akar-akar dari polinomial =" +f+"+"+g+"i"+" dan "+ f+(-g)+"i");
        }
        else{
        System.out.println("2. Akar-akar dari polinomial = " + ((-b)+ Math.sqrt(Math.pow(b,2)- 4*a*c)/(2*a)));
        }
        System.out.println("3. Titik stasioner =" + (-b/2*a)+","+(stasioner)  ) ;
        if(2*a>0){
            System.out.println("4. Kecekungan kurva = atas");}
            else {
             System.out.println("4. Kecekungan kurva = bawah");}   
        if(a>0){
            System.out.println("5. Nilai maksimum lokal =" + stasioner);
            }
        else {
            System.out.println("5. Nilai minimum lokal =" + stasioner);
        }
        }
                
                
        // TODO code application logic here
    }
    

