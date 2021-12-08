/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HocSinhTest {
    public static void menu(){
        System.out.println("Quan Ly Hoc Sinh");
        System.out.println("1. Nhap danh sach HS");
        System.out.println("2. Hien danh sach HS");
        System.out.println("3. Tinh Tong tien an");
        System.out.println("4. Sap xep theo tien an tang dan");
        System.out.println("5. Thoat");
    }
    public static void main(String[] args){
        DanhSachHS dshs = new DanhSachHS();
        int tiep;
        do{
            menu();
            System.out.println("Hay chon tu 1-5 de thuc hien: ");
            tiep = new Scanner(System.in).nextInt();
            switch(tiep){
                case 1:
                    dshs.nhapDSHS();
                    break;
                case 2:
                    dshs.hienDSHS();
                    break;
                case 3:
                    dshs.tongTienAn();
                    break;
                case 4:
                    dshs.sapXepTienAn();
                    dshs.hienDSHS();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
            System.out.println("Ban muon tiep tuc? 0-ket thuc");
            tiep = new Scanner(System.in).nextInt();
        }while(tiep!=0);
    }
}
