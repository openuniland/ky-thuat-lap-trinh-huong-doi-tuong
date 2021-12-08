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
public class HocSinh {
    int maSV;
    String hoTen;
    int lop;
    int soBuoiAn;
    int soTienAn;
    public void nhapHS() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien ");
        maSV = Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap ho ten: ");
        hoTen = nhap.nextLine();
        System.out.println("Nhap lop: ");
        lop = nhap.nextInt();
        System.out.println("Nhap so buoi an ban tru: ");
        soBuoiAn = nhap.nextInt();
        soTienAn = soBuoiAn * 30000;
    }
    public void hienHS(){
        System.out.println(maSV + "\t" + hoTen + "\t" + lop + "\t" + soBuoiAn);
    }
}
