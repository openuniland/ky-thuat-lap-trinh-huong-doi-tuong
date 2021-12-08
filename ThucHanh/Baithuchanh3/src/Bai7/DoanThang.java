/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Admin
 */


public class DoanThang {
    static Scanner in = new Scanner(System.in);
    private Diem A; 
    private Diem B;
    
    DoanThang()
    {
        this.A = new Diem();
        this.B = new Diem();
    }
    DoanThang(float x1, float y1, float x2, float y2) 
    {
        this.A=new Diem(x1, y1);
        this.B=new Diem(x2, y2);
    }
    public Diem diemDau()
    {
        Diem diem = new Diem();
        System.out.print("x = ");
        diem.setX(in.nextFloat());
        System.out.print("y = ");
        diem.setY(in.nextFloat());
        return diem;
    }
    public Diem diemCuoi()
    {
        Diem diem = new Diem();
        System.out.print("x = ");
        diem.setX(in.nextFloat());
        System.out.print("y = ");
        diem.setY(in.nextFloat());
        return diem;
    }
    public Diem getA() {
        return A;
    }
    public void setA() {
        this.A = diemDau();        
    }
    public Diem getB() {
        return B;
    }
    public void setB() {
        this.B = diemCuoi();        
    }
    public double doDai() {
        double dodai;
        double t = Math.pow((B.getX()- A.getX()), 2) + Math.pow((B.getY() - A.getY()), 2);
        dodai = Math.sqrt(t);
        return dodai;
    }
    
    DecimalFormat dt = new DecimalFormat("#.00");
    @Override
    public String toString(){
        return "DoanThang ("+"A"+A.toString()+", B" + B.toString() +", DoDai = "+dt.format(doDai())+')';
    }   
}
