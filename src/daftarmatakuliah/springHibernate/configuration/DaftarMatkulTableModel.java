package daftarmatakuliah.springHibernate.configuration;

import daftarmatakuliah.springHibernate.model.Matakuliahbaru;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DaftarMatkulTableModel extends AbstractTableModel {
    private List<Matakuliahbaru> mkbaru = new ArrayList<>();
    private final String HEADER[] = {"kdmk", "namamk", "namadosen"};
    
    public DaftarMatkulTableModel(List<Matakuliahbaru> mkbaru) {
	this.mkbaru = mkbaru;
    }
    
    @Override
    public int getRowCount() {
        return mkbaru.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
	return HEADER[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Matakuliahbaru mkbaru2 = mkbaru.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return mkbaru2.getKodeMatkul();
            case 1:
                return mkbaru2.getNamaMatkul();
            case 2:
                return mkbaru2.getNamaDosen();
        default:
            return null;
	}
    }
}
