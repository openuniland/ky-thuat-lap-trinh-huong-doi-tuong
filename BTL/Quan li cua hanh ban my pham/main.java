/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplonlamlai;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String []arg) throws IOException, FileNotFoundException, ClassNotFoundException{
        dshoadon hd1 = new dshoadon();
        ArrayList<hoadon> list = new ArrayList();
        hd1.nhapdshd();
        hd1.hiendshd();
        hd1.them();
//        hd1.sua();
//        hd1.xoa();
//        hd1.sapxep();
//        hd1.ghifile();
//        list = hd1.docfile();
//        hd1.hiendshd(list);
    }
    
}
