package daftarmatakuliah.springHibernate.service;

import daftarmatakuliah.springHibernate.model.Matakuliahbaru;
import java.util.List;

public interface DaftarMatakuliahService {
    public void save(Matakuliahbaru matkul);
    public void update(Matakuliahbaru matkul);
    public void delete(Matakuliahbaru matkul);
    
    public Matakuliahbaru getMatkul(String kodeMatkul);
    public List<Matakuliahbaru> getMatkul1();
}
