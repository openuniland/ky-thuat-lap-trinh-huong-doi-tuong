/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HCN {
    private float cDai;
    private float cRong;
    private String tenNhanVien;
    private double heSoLuong;

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    

    public float getcDai() {
        return cDai;
    }
    public void setcDai(float cDai) {
        this.cDai = cDai;
    }
    public float getcRong() {
        return cRong;
    }
    public void setcRong(float cRong) {
        this.cRong = cRong;
    }
    public HCN()
    {};
    public HCN(float cDai,float cRong){
        this.cDai = cDai;
        this.cRong = cRong;
    }
    public float DienTich(){
        return cDai*cRong;
    }
    public float ChuVi(){
        return ((cDai+cRong)*2);
    }
    public void NhapThongTin(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        do {
            cDai = nhap.nextFloat();
        } while (cDai<=0);
        
        
       
        System.out.println("Nhap chieu rong: ");
        do {
            cRong = nhap.nextFloat();
        } while (cRong<=0);
        
        
    }
    @Override
    public String toString() {
        return String.format("%15.2f %15.2f %15.2f %15.2f ", cDai,cRong,DienTich(),ChuVi());
    }
    public static String Ketqua(){
        return String.format("%15s %15s %15s %15s", "Chieu dai","Chieu rong","Dien tich","Chu vi");
    }
    
}
