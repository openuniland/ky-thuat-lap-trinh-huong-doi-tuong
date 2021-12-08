/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

/**
 *
 * @author Admin
 */
public class Student extends Person {

    private float diemMon1;
    private float diemMon2;

    public Student() {
    }

    public Student(float diemMon1, float diemMon2, String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
    }

    public float getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(float diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public float getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(float diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public float diemTrungBinh() {
        return (this.diemMon1 + this.diemMon2) / 2;
    }
   
    @Override
    public void hienThongTin() {
        super.hienThongTin(); //To change body of generated methods, choose Tools | Templates.        
        System.out.println("Diem mon 1 = "+ this.diemMon1);
        System.out.println("Diem mon 2 = "+ this.diemMon2);
        System.out.println("Diem TB = "+ diemTrungBinh());      
    }
}

