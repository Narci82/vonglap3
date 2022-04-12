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
public class phien1bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i,giaiThua = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        n = sc.nextInt();
        if(n<0){
            System.out.println("Nhap lai:");
        }if (n ==0){
            System.out.println("Ket qua: 1");
        }else {
            for (i=1; i<=n; i++){
                giaiThua = giaiThua * i;
            }
            System.out.println("Ket qua: " +giaiThua);
        }
    }
    
}
