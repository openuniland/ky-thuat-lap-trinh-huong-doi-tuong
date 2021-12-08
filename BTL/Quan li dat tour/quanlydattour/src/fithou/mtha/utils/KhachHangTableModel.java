/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fithou.mtha.utils;

import fithou.mtha.dto.KhachHang;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author FITHOU
 */
public class KhachHangTableModel extends AbstractTableModel{
    ArrayList<KhachHang> lskh;
    String[] columnNames  ={"Ma KH"," Ho Ten", "Noi Sinh"};;
    public KhachHangTableModel(ArrayList<KhachHang> kh){
        super();
        lskh = kh;       
    }
    @Override
    public int getRowCount() {
        return lskh.size();
    }

    @Override
    public int getColumnCount() {
       return columnNames.length;
    }
    
    @Override
    public String getColumnName(int index){
        return columnNames[index];
    }

    @Override
    public Object getValueAt(int row, int column) {
        KhachHang kh = lskh.get(row);
        switch(column){
            case 0: return kh.getMaKH();
            case 1: return kh.getHoTen();
            case 2: return kh.getnSinh();
            default:return null;
        }
    }
    
    
}
