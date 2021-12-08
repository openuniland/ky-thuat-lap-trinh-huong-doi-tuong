/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TuLanhBLL {
    ArrayList<TuLanh> listTuLanh = new ArrayList<>();

    public void nhapDanhSach() {
        TuLanh tuLanh;
        while (true) {
            tuLanh = new TuLanh();
            tuLanh.nhap();
            listTuLanh.add(tuLanh);
            System.out.print("Ban co muon nhap nua khong (co=1/khong=0): ");
            String tl = new Scanner(System.in).nextLine();
            if (tl.equalsIgnoreCase("0")) {
                break;
            }
        }
    }

    public void hienDanhSach() {
        listTuLanh.stream().forEach((tuLanh) -> {
            tuLanh.hien();
        });
    }

    public void lietKeTheoHang() {
        System.out.print("Nhap hang san xuat: ");
        String hangSX = new Scanner(System.in).nextLine();
        for (TuLanh tuLanh : listTuLanh) {
            if (tuLanh.getHangSX().equalsIgnoreCase(hangSX)) {
                tuLanh.hien();
            }
        }
    }

    public void tongTienTuLanh() {
        float sum = 0;
        for (TuLanh tuLanh : listTuLanh) {
            sum += tuLanh.ThanhTien();
        }
        System.out.println("Tong tien cac tu lanh: " + sum);
    }

    public void tuLanhCoDungTichTren200() {
        System.out.println("Tu lanh co dung tich tren 200: ");
        for (TuLanh tuLanh : listTuLanh) {
            if (tuLanh.getDungTich() > 200) {
                tuLanh.hien();
            }
        }
    }

    public void sapXepTheoSoLuong() {
        Collections.sort(listTuLanh, (TuLanh tl1, TuLanh tl2) -> {
            if (tl1.getSoLuong() < tl2.getSoLuong()) {
                return 1;
            } else {
                if (tl1.getSoLuong() == tl2.getSoLuong()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        for (int i = 0; i < listTuLanh.size(); i++) {
            System.out.println("Tu lanh " + (i + 1));
            listTuLanh.get(i).hien();

        }
    }
}