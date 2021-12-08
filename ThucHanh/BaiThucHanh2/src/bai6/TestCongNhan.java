/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestCongNhan {
    public static void menu()
    {
        System.out.println("Quan ly cong nhan");
        System.out.println("1.Nhap danh sach cong nhan");
        System.out.println("2.Hien danh sach cong nhan");
        System.out.println("3.Hien danh sach cong nhan co luong lon hon S");
        System.out.println("4.Thoat Chuong trinh");
        System.out.println("Chon chuc nang tu 1-4");
    }
    public static void main(String[] args)
    {
        DanhSachCongNhan dscn = new DanhSachCongNhan();
        menu();
        float lcb = 1150;
        int tiep;
        Scanner nhap = new Scanner(System.in);
        tiep = nhap.nextInt();
        do
        {
            switch(tiep)
            {
                case 1:
                    dscn.DanhSachCongNhan();
                    dscn.NhapDanhSachCongNhan();
                    break;
                case 2:
                    dscn.HienDanhSachCongNhan();
                    break;
                case 3:
                    dscn.HienCongNhanCoLuongLonHonS();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
            System.out.println("Chon 0 de thoat chuong trinh");
            tiep = new Scanner(System.in).nextInt();
        }
        while(tiep!=0);
    }
}
