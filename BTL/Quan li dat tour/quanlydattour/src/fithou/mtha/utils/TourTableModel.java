/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fithou.mtha.utils;

import fithou.mtha.dto.Tour;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author FITHOU
 */
public class TourTableModel extends AbstractTableModel{
    ArrayList<Tour> lsTour;

    String[] colNams ={"Ma Tour", "Thong tin Tour", "Don Gia"};
    public TourTableModel(ArrayList<Tour> t){
        lsTour = t;
    }
    @Override
    public int getRowCount() {
        return lsTour.size();
    }

    @Override
    public int getColumnCount() {
       return colNams.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int colIndex) {
        Tour tour = (Tour) lsTour.get(rowIndex);
        switch(colIndex){
            case 0: return tour.getMaTour();
            case 1: return tour.getThongTinTour();
            case 2: return tour.getDonGia();
            default:return null;
        }
    }

    @Override
    public String getColumnName(int i) {
        return colNams[i]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
