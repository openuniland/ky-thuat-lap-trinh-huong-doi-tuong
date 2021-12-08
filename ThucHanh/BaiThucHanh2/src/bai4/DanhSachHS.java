-/*
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
public class DanhSachHS {
    HocSinh dsHS[];
    int SoHS;
    int Tong = 0,dem = 0;
    public DanhSachHS(){
        System.out.println("Nhap so hoc sinh");
        Scanner nhap = new Scanner(System.in);
        SoHS = nhap.nextInt();
        dsHS = new HocSinh[SoHS];
        
    }
    public void nhapDSHS(){
        for(int i =0; i<SoHS; i++){
            //khoi tao doi tuong can bo thu i cua mang
            dsHS[i] = new HocSinh();
            dsHS[i].nhapHS();
        }
    }
    public void hienDSHS(){
        for (HocSinh hocSinh : dsHS) {
            hocSinh.hienHS();
        }
    }
    public void tongTienAn(){
        for (int i = 0; i < SoHS; i++) {
            Tong = Tong + dsHS[i].soTienAn;
        }
        System.out.println("Tong so tien an la : "+ Tong);
    }
    public void sapXepTienAn(){
        for(int i =0; i<SoHS-1; i++)
            for(int j=i+1; j<SoHS; j++){
                if(dsHS[i].soTienAn > dsHS[j].soTienAn){
                    //thuc hien doi cho can bo thu i cho 
                    //can bo thu j
                    HocSinh tmp ;
                    tmp = dsHS[i];
                    dsHS[i] = dsHS[j];
                    dsHS[j] = tmp;
                }
            }
    }
    
}
