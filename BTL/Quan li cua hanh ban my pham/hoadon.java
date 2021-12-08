/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplonlamlai;

import java.io.*;
import java.util.*;

/**
 *
 * @author ADMIN
 */
public class hoadon extends khachhang implements Serializable{
    private String mahd;
    private String tennv;
    private int sosp;
    public float tong=0;
    ArrayList<mypham> listmp;

    public hoadon(String mahd, String tennv, int sosp) {
        this.mahd = mahd;
        this.tennv = tennv;
        this.sosp = sosp;
    }

    public hoadon() {
        mahd = "";
        tennv = "";
        sosp=0;
    }
//
//    public hoadon(String mahd, String tennv, int sosp, String makh, String tenkh, String cmtnd, String sdt) {
//        super(makh, tenkh, cmtnd, sdt);
//        this.mahd = mahd;
//        this.tennv = tennv;
//        this.sosp = sosp;
//    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public int getSosp() {
        return sosp;
    }

    public void setSosp(int sosp) {
        this.sosp = sosp;
    }

    public float getTong() {
        return tong;
    }

    public void setTong(float tong) {
        this.tong = tong;
    }

    public ArrayList<mypham> getListmp() {
        return listmp;
    }

    public void setListmp(ArrayList<mypham> listmp) {
        this.listmp = listmp;
    }
    
    public void nhaphd(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap ma hoa don: ");
       mahd = sc.nextLine();
       System.out.println("Nhap ten nhan vien: ");
       tennv = sc.nextLine();
       super.nhapkh();
       System.out.println("Nhap so luong san pham: ");
       sosp =sc.nextInt();
       listmp = new ArrayList(sosp);
        for (int i = 0;i<sosp;i++) {            
            mypham x= new mypham();
            x.nhapmp();
            listmp.add(x);
            System.out.println("=====================");
        }
    }
    public void hienhd(){
        System.out.println("Ma hoa don: "+mahd);
        System.out.println("Ten nhan vien: "+tennv);
        super.hienkh();
        for (mypham x : listmp){             
            System.out.println("Hoa don thu: "+(listmp.indexOf(x)+1));
                    x.hienmp();
        }
        System.out.println("=====================");
    }
    public float tinhtong(){
        for (mypham x : listmp) {
            tong = tong + (x.getSl()*x.getGiaban());
        }
        return tong; 
    }
    
}
