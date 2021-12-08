/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Test {
    public static void menu(){
        System.out.println("=========MENU=========");
        System.out.println("1.Chuyen vien  ");
        System.out.println("2.Giang vien  ");
        System.out.println("3.Ten quan ly  ");
        System.out.println("4.Hien danh sach  ");
        System.out.println("5.Thoat.  ");
    }
    public static void main(String[] args) {
        DSNhanVien dsnv = new DSNhanVien();
        int kt=0,chon;
        do {
                menu();
                System.out.print("Chon so: ");
                chon = new Scanner(System.in).nextInt();                        
                System.out.println("======================");
                dsnv.nhapDs(chon);
                System.out.print("Co tiep tuc ko (1-co): ");
                kt = new Scanner(System.in).nextInt();
        } while (kt!=0);
    }
}
