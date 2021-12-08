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
import java.io.Serializable;
import java.util.Scanner;

public class HocSinh extends Nguoi implements IHoatDong,Serializable{

    private String tenLop;

    public HocSinh() {
    }

    public HocSinh(String tenLop, String hoTen, int namSinh) {
        super(hoTen, namSinh);
        this.tenLop = tenLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        System.out.print("Nhap ten lop: ");
        this.tenLop = new Scanner(System.in).nextLine();
    }
    

    @Override
    public String gioiThieu() {
        return "Ho ten: "+ getHoTen() + "\nNam sinh: "+ getNamSinh()+  "\nTen lop: " + tenLop;
    }    
}
