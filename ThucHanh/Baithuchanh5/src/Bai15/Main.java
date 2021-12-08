/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai15;

/**
 *
 * @author Admin
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        DSHS sbll = new DSHS();
        File fName = new File("DSSV.txt");
        int luaChon;
        do {
            menu();
            luaChon = new Scanner(System.in).nextInt();
            switch (luaChon) {
                case 1: {
                    try {
                        System.out.println("-------------NHAP HOC SINH----------");
                        sbll.nhapDS();
                        sbll.ghiFile(fName);
                        break;
                    } 
                    catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                case 2: {
                    try {
                        System.out.println("-------------XUAT DANH SACH---------------");
                        ArrayList<HocSinh> ls =  sbll.docFile(fName);
                        sbll.xuatDS(ls);
                    }   
                    catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    catch (ClassNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 3: {
                    System.out.println("------------TIM KIEM-------------");
                    sbll.timKiem();
                }
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("1. Nhap");
        System.out.println("2. Xuat");
        System.out.println("3. Tim kiem");
        System.out.print("Nhap lua chon: ");
    }
    
}
