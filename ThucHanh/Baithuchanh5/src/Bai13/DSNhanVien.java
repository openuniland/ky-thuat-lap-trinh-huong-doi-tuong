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
import java.util.ArrayList;

public class DSNhanVien {
    ArrayList<CanBo> ds = new ArrayList<CanBo>();
    CanBo cb;
    public void nhapDs(int chon){
        int kt=0;
        switch (chon) {
        case 1:
            //System.out.println("Nhap chuyen vien:");
            cb = new CanBo();
            cb.nhap();
            ds.add(cb);
            break;
        case 2:
            //System.out.println("Nhap giang vien:");
            cb = new GiangVien();
            cb.nhap();
            ds.add(cb);
            break;
        case 3:
            //System.out.println("Nhap quan ly:");
            cb = new QuanLy();
            cb.nhap();
            ds.add(cb);
            break;
        case 4:
            this.xuatDs();
            break;

        default:
            break;
        }
    }

    public void xuatDs(){
        for (CanBo canBo : ds) {
                canBo.xuat();
        }
    }
}
