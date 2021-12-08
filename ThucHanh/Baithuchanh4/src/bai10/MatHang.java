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
import java.util.Scanner;

public class MatHang {
    private String tenHang;
    private int maHang;
    private String nuocSX;
    
    public MatHang(){
    }
    
    public MatHang(String tenHang, int maHang, String nuocSX) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.nuocSX = nuocSX;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.print("Nhap ma hang: ");
        maHang = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap nuoc SX: ");
        nuocSX = sc.nextLine();
    }
    public void xuat(){
        System.out.print("\n + Ten hang: "+tenHang+"\n + Ma hang: "+maHang+"\n + Nuoc SX: "+nuocSX);
    }
}
