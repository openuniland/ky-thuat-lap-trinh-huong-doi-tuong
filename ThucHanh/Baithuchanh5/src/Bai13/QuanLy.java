/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class QuanLy extends CanBo implements Luong {

    public float phuCap;
    public String phong;
    public String khoa;

    public void nhap() {
        
        super.nhap();
        System.out.print("Nhap Phong: ");
        this.phong =  new Scanner(System.in).nextLine();
        System.out.print("Nhap Khoa: ");
        this.khoa = new Scanner(System.in).nextLine();
        System.out.print("Nhap Phu Cap: ");
        this.phuCap = new Scanner(System.in).nextFloat();
    }
    public float TinhLuong() {
        return (this.hsl + this.phuCap) * 1350000;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Phu cap: "+this.phuCap);
        System.out.println("Phong: "+this.phong);
        System.out.println("Khoa: "+this.khoa);
        System.out.println("Luong: "+TinhLuong());
    }
}