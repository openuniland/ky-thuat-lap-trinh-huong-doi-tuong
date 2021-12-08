/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class GiangVien extends CanBo implements Luong {

    public String khoa;

    /**
     *
     * @return
     */
    @Override
    public float TinhLuong() {
        return this.hsl * 1350000 + this.hsl * 1350000 * 0.2f;
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Nhap khoa: ");
        this.khoa = new Scanner(System.in).nextLine();
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Khoa:" + this.khoa);
        System.out.println("Luong: " + TinhLuong());
    }   
}
