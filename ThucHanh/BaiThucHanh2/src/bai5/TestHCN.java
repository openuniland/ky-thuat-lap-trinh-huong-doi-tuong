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
public class TestHCN {
    public static void main(String[] args) {
        float Dt,Cv;
        HCN tinh = new HCN();
        tinh.NhapThongTin();
        Dt=tinh.DienTich();
        Cv=tinh.ChuVi();
        System.out.println(HCN.Ketqua());
        System.out.println(tinh);
    }
}
