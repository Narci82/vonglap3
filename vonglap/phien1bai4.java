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
public class phien1bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so: ");
        a = sc.nextInt();
        while (a != 0){
            a /= 10;
            count++;
            System.out.print("So: " +count);
        }
        System.out.print("So: " +count);
    }
    
}
