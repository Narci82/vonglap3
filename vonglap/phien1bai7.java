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
public class phien1bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i,soDau = 0,soKe =1,soTiep = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        for (i = 1;i<=n;i++){
            //System.out.println(soDau);
            System.out.println(soTiep);
            soTiep = soDau + soKe;           
            soKe = soDau;
            soDau = soTiep;
            
            //System.out.println(soDau);
            
        }
    }
    
}
