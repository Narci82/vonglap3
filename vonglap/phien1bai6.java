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
public class phien1bai6 {
    public static boolean SoNguyenTo(int a){
        if (a < 2){
            return false;
        }
        for(int i = 2; i <= a/i;++i){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dau,n,cuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so bat dau: ");
        dau= sc.nextInt();
        System.out.println("Nhap so ket thuc: ");
        cuoi= sc.nextInt();
        
        for(n = dau; n <= cuoi; n++){
            if(SoNguyenTo(n)){
                System.out.println(n);
            }
        }
    }
    
}
