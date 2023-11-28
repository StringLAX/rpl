package daftarmatakuliah.springHibernate.dao;

import daftarmatakuliah.springHibernate.model.Matakuliahbaru;
import java.util.List;

public interface DaftarMatakuliahDAO {
    public void save(Matakuliahbaru matkul);
    public void update(Matakuliahbaru matkul);
    public void delete(Matakuliahbaru matkul);
    
    public Matakuliahbaru getMatkul(String kodeMatkul);
    public List<Matakuliahbaru> getMatkul1();
}
