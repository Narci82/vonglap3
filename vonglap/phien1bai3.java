/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacban.donglenh.vonglap;

import java.util.Scanner;

/**
 *
 * @author 7480
 */
public class phien1bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int arr[] = new int[];
        int i, n, sum = 0;
        double avg = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        
        
         for(i = 1; i<=n; i++)
         {
             
             sum += i;         
             System.out.println("Tong la: "+sum);
         } 
         System.out.println("Tong " +n+ " so la: " +sum);
         
    }   
    
}
