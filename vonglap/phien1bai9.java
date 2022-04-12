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
public class phien1bai9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,n,dNguoc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        n = sc.nextInt();
        while(n!=0){
            //chia lay so 
            a =n%10;
            // 4*10 +3= 43; 43*10+2= 432
            dNguoc = dNguoc * 10 + a;
            n = n/10;           
        }
        System.out.println("Dao nguoc n: " + dNguoc);
    }
    
}
