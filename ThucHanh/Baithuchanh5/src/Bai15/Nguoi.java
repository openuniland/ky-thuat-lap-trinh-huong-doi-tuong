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
import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private int namSinh;
    private boolean gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
  //      this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public void nhap(){
        System.out.print("Nhap ho ten: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.print("Nam sinh: ");
        this.namSinh = new Scanner(System.in).nextInt();
        System.out.print("Gioi tinh (Nu-true, Nam-False): ");
        this.gioiTinh = new Scanner(System.in).nextBoolean();
    }
}
