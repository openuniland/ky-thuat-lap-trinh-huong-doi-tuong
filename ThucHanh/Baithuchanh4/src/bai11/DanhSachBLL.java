/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSachBLL {
    ArrayList<Person> listPerSon = new ArrayList<>();

    public Person inputStudent() {
        System.out.print("Nhap ho ten: ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = new Scanner(System.in).nextLine();
        System.out.print("Nhap diem mon 1 = ");
        float diemMon1 = new Scanner(System.in).nextFloat();
        System.out.print("Nhap diem mon 2 = ");
        float diemMon2 = new Scanner(System.in).nextFloat();
        return new Student(diemMon1, diemMon2, hoTen, diaChi);
    }

    public Person inputEmployee() {
        System.out.print("Nhap ho ten: ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = new Scanner(System.in).nextLine();
        System.out.print("Nhap he so luong: ");
        float heSoLuong = new Scanner(System.in).nextFloat();
        return new Employee(heSoLuong, hoTen, diaChi);
    }

    public Person inputCustomer() {
        System.out.print("Nhap ho ten: ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = new Scanner(System.in).nextLine();
        System.out.print("Nhap ten cong ty: ");
        String tenCongTy = new Scanner(System.in).nextLine();
        System.out.print("Nhap gtri hoa don: ");
        float giaTriHoaDon = new Scanner(System.in).nextFloat();
        return new Customer(tenCongTy, giaTriHoaDon, hoTen, diaChi);
    }

    public void nhapDanhSach() {
        String c;
        int chon = 0;
        while (true) {
            System.out.print("Chon doi tuong nhap thong tin (1-Student, 2-Employee, 3-Customer): ");
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1: {
                    listPerSon.add(inputStudent());
                    break;
                }
                case 2: {
                    listPerSon.add(inputEmployee());
                    break;
                }
                case 3: {
                    listPerSon.add(inputCustomer());
                    break;
                }
                default: {
                    break;
                }
            }
            System.out.print("Ban co muon nhap nua khong (co-1/khong-0): ");
            c = new Scanner(System.in).nextLine();
            if (c.equalsIgnoreCase("0")) {
                break;
            }
        }
    }
    public void hienDanhSach(){
        for (int i = 0; i < listPerSon.size(); i++) {
            listPerSon.get(i).hienThongTin();           
        }
    }
    public void xoaNguoi(){
        System.out.print("Nhap ten nguoi can xoa: ");
        String hoTen = new Scanner(System.in).nextLine();
        for (int i = 0; i < listPerSon.size(); i++) {
            if (listPerSon.get(i).getHoTen().equalsIgnoreCase(hoTen)) {
                listPerSon.get(i).hienThongTin();  
                listPerSon.remove(i);
                          
            }            
        }
    }
    public void sapXepTheoHoTen(){
        for(int i=0;i<listPerSon.size()-1;i++){
            for(int j =i+1;j<listPerSon.size();j++){
                if(listPerSon.get(i).getHoTen().compareTo(listPerSon.get(j).getHoTen())>0) {
                    Person tam = new Person();
                    tam = listPerSon.get(i);
                    listPerSon.set(i, listPerSon.get(j));
                    listPerSon.set(j, tam);
                }
            }
        }
        for (int i = 0; i < listPerSon.size(); i++) {
            listPerSon.get(i).hienThongTin();           
        }
    }
}
