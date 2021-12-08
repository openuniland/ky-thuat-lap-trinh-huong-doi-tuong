/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author Admin
 */
public class DoanThangBLL {
    static Scanner in = new Scanner(System.in);
    int soDT;
    Vector<DoanThang> list = new Vector<DoanThang>();
    public DoanThang dtInfo(){
        DoanThang dt = new DoanThang();
        System.out.println("Diem dau: ");
        dt.setA();
        System.out.println("Diem cuoi: ");
        dt.setB();
        return dt;
    }
    public void nhapsodt(){
        System.out.print("Nhap so doan thang: ");
        soDT = in.nextInt();
        for (int i=0; i<soDT; i++) {
            System.out.println("\nDoan thang thu "+(i+1)+":");
            list.add(dtInfo());
        }
    }
    
    @SuppressWarnings("empty-statement")
    public void hienDSDT() {     
        
       for (DoanThang doanthang: list) 
        {
            System.out.println("" + doanthang.toString());
        };    
    }
    public void MaxLength(){
        double max = list.firstElement().doDai();
        int vitri = list.indexOf(list.firstElement());
        for (DoanThang doanthang: list) {
            if (doanthang.doDai() > max) {
                max = doanthang.doDai();
                vitri = list.indexOf(doanthang);
            }
        }
        System.out.println(""+ list.elementAt(vitri).toString());
    }
    DecimalFormat dt = new DecimalFormat ("#.000");
    public String tongDoDai(){
        double tong=0;
        for (DoanThang doanthang: list) {
            tong+=doanthang.doDai();
        }
        return dt.format(tong);
    }
}
