/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CongNhan {
    float lcb;
    float hsl;
    String hoten;
    float Luong=0;
    public float gethsl()
    {
        return hsl;
    }
    public void sethsl(float hsl)
    {
        this.hsl = hsl;
    }
    public String gethoten()
    {
        return hoten;
    }
    public void sethoten(String hoten)
    {
        this.hoten = hoten;
    }
    public void NhapCongNhan()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Ho ten:");
        hoten = nhap.nextLine();
        System.out.print("He so luong:");
        hsl = Float.parseFloat(nhap.nextLine());
        System.out.print("\n-------------------------\n");
    }
    public void HienCongNhan()
    {
        System.out.println("Ho ten:"+hoten+"");
        System.out.println("He so luong:"+hsl+"");
        System.out.println("Luong:"+1150*hsl+"");
        System.out.println("------------------------");
    }
    
}
