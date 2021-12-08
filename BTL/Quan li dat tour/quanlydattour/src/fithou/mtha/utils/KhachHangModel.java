/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fithou.mtha.utils;

import fithou.mtha.dto.KhachHang;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author FITHOU
 */
public class KhachHangModel extends AbstractListModel implements ComboBoxModel{
    ArrayList<KhachHang> lsKhachHang;
    KhachHang kh = null;

    public KhachHangModel(ArrayList<KhachHang> lskh) {
        super();
        lsKhachHang = lskh;
    }
 

    @Override
    public int getSize() {
        return lsKhachHang.size();
    }

    @Override
    public Object getElementAt(int i) {
        return lsKhachHang.get(i);
    }

    @Override
    public void setSelectedItem(Object o) {
       kh =(KhachHang) o;
    }

    @Override
    public Object getSelectedItem() {
        return kh;
    }
    
    
    
}
