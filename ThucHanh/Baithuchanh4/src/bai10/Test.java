/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author Admin
 */
import java.io.InputStream;
import java.util.Scanner;

public class Test {    
    public static void main(String[] args) {
        TuLanhBLL tlbll = new TuLanhBLL();

        int luaChon;
        do {
            menu();
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = new Scanner(System.in).nextInt();
            switch (luaChon) {
                case 1: {
                    System.out.println("========NHAP TU LANH=============");
                    tlbll.nhapDanhSach();
                    break;
                }
                case 2: {
                    System.out.println("========HIEN THI================");
                    tlbll.hienDanhSach();
                    break;
                }
                case 3: {
                    System.out.println("=======LIET KE THEO HANG======");
                    tlbll.lietKeTheoHang();
                    break;
                }
                case 4: {
                    System.out.println("========TONG TIEN============");
                    tlbll.tongTienTuLanh();
                    break;
                }
                case 5: {
                    System.out.println("==========TIM KIEM=============");
                    tlbll.tuLanhCoDungTichTren200();
                    break;
                }
                case 6: {
                    System.out.println("========SAP XEP THEO SO LUONG=============");
                    tlbll.sapXepTheoSoLuong();
                    break;
                }
            }
        } while (luaChon != 7);
    }

    public static void menu() {   
        System.out.println("==============MENU=============");
        System.out.println("1. Nhap thong tin");
        System.out.println("2. Hien thong tin");
        System.out.println("3. Liet ke theo hang");
        System.out.println("4. Tong tien");
        System.out.println("5. Tim kiem");
        System.out.println("6. Sap xep");
    }
}

