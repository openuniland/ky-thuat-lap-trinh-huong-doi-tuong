/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplonlamlai;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class khachhang implements Serializable{
    private String makh;
    private String tenkh;
    private String cmtnd;
    private String sdt;

    public khachhang(String makh, String tenkh, String cmtnd, String sdt) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.cmtnd = cmtnd;
        this.sdt = sdt;
    }

    public khachhang() {
        makh = "";
        tenkh = "";
        cmtnd = "";
        sdt = "";
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getCmtnd() {
        return cmtnd;
    }

    public void setCmtnd(String cmtnd) {
        this.cmtnd = cmtnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public void nhapkh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang: ");
        makh = sc.nextLine();
        System.out.println("Nhap ten khach hang: ");
        tenkh = sc.nextLine();
        System.out.println("Nhap cmtnd: ");
        cmtnd = sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        sdt = sc.nextLine();
    }
    public void hienkh(){
        System.out.println("Ma khach hang: "+makh);
        System.out.println("Ten khach hang: "+tenkh);
        System.out.println("So cmtnd: "+cmtnd);
        System.out.println("SDT: "+sdt);
    }

    @Override
    public String toString() {
        return "khachhang{" + "makh=" + makh + ", tenkh=" + tenkh + ", cmtnd=" + cmtnd + ", sdt=" + sdt + '}';
    }
        
}
