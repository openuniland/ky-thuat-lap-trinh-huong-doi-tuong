/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {        
        DanhSachBLL dsbll = new DanhSachBLL();
        dsbll.nhapDanhSach();
        System.out.println("====Hien danh sach vua nhap====");
        dsbll.hienDanhSach();
        System.out.println("====Hien thong tin nguoi bi xoa====");
        dsbll.xoaNguoi();
        System.out.println("====Sap xep theo ho ten====");
        dsbll.sapXepTheoHoTen();
    }
}
