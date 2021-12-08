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
public class CanBo {
    public String hoTen;
    public String diaChi;
    public int tuoi;
    public float hsl;

    public void nhap(){	
        System.out.print("Ho va ten: ");
        this.hoTen=new Scanner(System.in).nextLine();
        System.out.print("Dia chi: ");
        this.diaChi=new Scanner(System.in).nextLine();
        System.out.print("Tuoi: ");
        this.tuoi = new Scanner(System.in).nextInt();
        System.out.print("He so luong: ");
        this.hsl = new Scanner(System.in).nextFloat();		
    }
    public void xuat(){
        System.out.println("Ho va ten: "+this.hoTen);
        System.out.println("Dia chi: "+this.diaChi);
        System.out.println("Tuoi: "+this.tuoi);
        System.out.println("He so luong: "+this.hsl);
    }
}
