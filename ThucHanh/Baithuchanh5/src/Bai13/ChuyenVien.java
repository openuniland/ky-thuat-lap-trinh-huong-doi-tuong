/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ChuyenVien extends CanBo implements Luong {           
    public String phong;   

    @Override
    public float TinhLuong() {
        return this.hsl * 1350000;
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Nhap Phong: ");
        this.phong = new Scanner(System.in).nextLine();
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Phong: "+this.phong);
        System.out.println("Luong: " + TinhLuong());
    }
}

