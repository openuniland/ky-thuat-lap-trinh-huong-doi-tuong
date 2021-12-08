/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Test {
    public static void menu() {
        System.out.println("1. Nhap DSDT");
        System.out.println("2. Hien DSDT");
        System.out.println("3. Doan thang dai nhat");
        System.out.println("4. Tong do dai cac doan thang");
        System.out.println("5. Thoat ");             
    }
    public static void main(String[] args) {
        DoanThangBLL dtbll = new DoanThangBLL();
        int chon;
        do {
            menu();
            System.out.print("Chon 1-5: ");
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1: 
                    dtbll.nhapsodt();
                    break;
                case 2:
                    System.out.println("Danh sach cac doan thang da nhap: ");
                    dtbll.hienDSDT();
                    break;
                case 3:
                    System.out.println("Doan thang co do dai max: ");
                    dtbll.MaxLength();
                    break;
                case 4:
                    System.out.println("Tong do dai cac doan thang: "+ dtbll.tongDoDai());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;  
            }
            System.out.println("Ban co muon tiep tuc ko - ket thuc");
            chon = new Scanner(System.in).nextInt();
        } while (chon!=0);
    }
}
