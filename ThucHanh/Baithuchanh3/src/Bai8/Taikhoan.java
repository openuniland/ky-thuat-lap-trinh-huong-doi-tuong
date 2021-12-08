/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Taikhoan {
    private String sotaikhoan;
    private String tentaikhoan;
    private double sotien;
    private float laisuat;
    public Taikhoan()
    {
       sotien=100;
    }
    public void setsotaikhoan(String sotaikhoan)
    {
        this.sotaikhoan=sotaikhoan;
    }
    public String getsotaikhoan()
    {
        return sotaikhoan;
    }
    public void settentaikhoan(String tentaikhoan)
    {
        this.tentaikhoan = tentaikhoan;
    }
    public String gettentaikhoan()
    {
        return tentaikhoan;
    }
    public void setsotien(double sotien)
    {
        this.sotien = sotien;
    }
    public double getsotien()
    {
        return sotien;
    }
    public void setlaisuat(float laisuat)
    {
        this.laisuat = (float) 0.05;
    }
    public float getlaisuat()
    {
        return laisuat;
    }
    public void nhaptt()
    {
        
        Scanner nhap = new Scanner(System.in);
        System.out.print("So tai khoan:");
        sotaikhoan = nhap.nextLine();
        System.out.print("Ten tai khoan:");
        tentaikhoan = nhap.nextLine();
        System.out.print("So tien:");
        sotien = nhap.nextDouble();
    }
    public void hientt()
    {
        System.out.println("So tai khoan:"+sotaikhoan+"");
        System.out.println("Ten tai khoan:"+tentaikhoan+"");
        System.out.println("So tien:"+sotien+"");
    }
    public void guitien()
    {
        double sotiennew;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so tien muon gui vao tai khoan:");
        do
        {
            sotiennew = nhap.nextDouble();
            System.out.print("Nhap lai");
        }
        while(sotiennew<0);
        sotien = sotien + sotiennew;
        System.out.println("gui vao thanh cong, so tien moi la:"+sotien+"");
    }
    public void ruttien()
    {
        double sotienrut;
        double phiruttien=0;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so tien muon rut:");
        do
        {
            sotienrut = nhap.nextDouble();
            if((sotienrut+phiruttien)<=sotien)
            {
                sotien = sotien - (sotienrut + phiruttien);
                System.out.println("rut tien thanh cong so tien con lai la:"+sotien+"");
            }
            else
            {
                System.out.println("So tien rut khong hop le");
            }
        }
        while(sotienrut<sotien);
    }
    public void daohan()
    {
        double daohan;
        laisuat = (float) 0.05;
        daohan = sotien + sotien*laisuat;
        System.out.println("Dao han:"+daohan+"");
    }
    @Override
    public String toString()
    {
        return ""+sotaikhoan+""+tentaikhoan+""+sotien;
    }
}
