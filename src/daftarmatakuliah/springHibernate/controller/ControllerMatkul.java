package daftarmatakuliah.springHibernate.controller;

import daftarmatakuliah.app;
import daftarmatakuliah.springHibernate.model.Matakuliahbaru;
import java.util.List;
import daftarmatakuliah.springHibernate.view.ViewMatakuliah;
import daftarmatakuliah.springHibernate.configuration.DaftarMatkulTableModel;
import javax.swing.JOptionPane;

public class ControllerMatkul {
    private final ViewMatakuliah matkulView;
    private DaftarMatkulTableModel daftarMatkulTableModel;
    private List<Matakuliahbaru> matkul1;
    
    public ControllerMatkul(ViewMatakuliah matkulView){
        this.matkulView = matkulView;
    }
    
    public void tampilData() {
	matkul1 = app.getDaftarMatakuliahService().getMatkul1();
        daftarMatkulTableModel = new DaftarMatkulTableModel(matkul1);
        this.matkulView.getTable().setModel(daftarMatkulTableModel);
    }
    
    public void show(){
        int index = this.matkulView.getTable().getSelectedRow();
	this.matkulView.getKodeMatkul().setText(String.valueOf(
	this.matkulView.getTable().getValueAt(index, 0)));
        this.matkulView.getNamaMatkul().setText(String.valueOf(
	this.matkulView.getTable().getValueAt(index, 1)));
        this.matkulView.getNamaDosen().setText(String.valueOf(
	this.matkulView.getTable().getValueAt(index, 2)));
    }
    
    public void clear(){
        this.matkulView.getKodeMatkul().setText("");
        this.matkulView.getNamaMatkul().setText("");
        this.matkulView.getNamaDosen().setText("");
    }
    
    public void saveMatkul(){
        Matakuliahbaru matkul = new Matakuliahbaru();
        matkul.setKodeMatkul(this.matkulView.getKodeMatkul().getText());
        matkul.setNamaMatkul(this.matkulView.getNamaMatkul().getText());
        matkul.setNamaDosen(this.matkulView.getNamaDosen().getText());
        app.getDaftarMatakuliahService().save(matkul);
        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "Info",
        JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updateMatkul(){
        Matakuliahbaru matkul = new Matakuliahbaru();
	matkul.setKodeMatkul(this.matkulView.getKodeMatkul().getText());
	matkul.setNamaMatkul(this.matkulView.getNamaMatkul().getText());
	matkul.setNamaDosen(this.matkulView.getNamaDosen().getText());
	app.getDaftarMatakuliahService().update(matkul);
	JOptionPane.showMessageDialog(null, "Data Berhasil di Edit", "Info",
	JOptionPane.INFORMATION_MESSAGE);
	clear();
	tampilData();
    }
    
    public void deleteMatkul(){
        if(this.matkulView.getKodeMatkul().getText() == null){
            JOptionPane.showMessageDialog(null, "Matakuliah belum dipilih", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            Matakuliahbaru matkul = new Matakuliahbaru();
            matkul.setKodeMatkul(this.matkulView.getKodeMatkul().getText());
            int pilih = JOptionPane.showConfirmDialog(null,"Apakah data ingin dihapus ?", "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(pilih == JOptionPane.YES_OPTION){
                app.getDaftarMatakuliahService().delete(matkul);
                JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus", "Info",JOptionPane.INFORMATION_MESSAGE);
                clear();
                tampilData();
            }
        }
    }

    
//    public void InsertData(String namaMatkul, String kodeMatkul, String namaDosen){
//        Matakuliahbaru mkb = new Matakuliahbaru(namaMatkul, kodeMatkul, namaDosen);
//        ArrayData.add(mkb);
//    }
//    
//    public boolean deleteData(int index) {
//        if (index >= 0 && index < ArrayData.size()) {
//            ArrayData.remove(index);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean updateData(int index, String namaMatkul, String kodeMatkul, String namaDosen) {
//        if (index >= 0 && index < ArrayData.size()) {
//            Matakuliahbaru mkb = ArrayData.get(index);
//            mkb.setNamaMatkul(namaMatkul);
//            mkb.setKodeMatkul(kodeMatkul);
//            mkb.setNamaDosen(namaDosen);
//            return true;
//        }
//        return false;
//    }
//    
//    public DefaultTableModel showData(){
//        String[] kolom = { "Kode Mata Kuliah", "Nama Mata Kuliah", "Nama Dosen Mata Kuliah"};
//        Object[][] objData = new Object[ArrayData.size()][3];
//        int i = 0;
//        
//        for(Matakuliahbaru n : ArrayData){
//            String[] arrData = {n.getNamaMatkul(), n.getKodeMatkul(), n.getNamaDosen()};
//            objData[i] = arrData;
//            i++;
//        }
//        
//        tablelist = new DefaultTableModel(objData, kolom){
//            public boolean inCellEditTable(int rowIndex, int colIndex){
//                return false;
//            }
//        };
//        
//        return tablelist;
//    }

}
