package daftarmatakuliah.springHibernate.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import daftarmatakuliah.springHibernate.model.Matakuliahbaru;
import daftarmatakuliah.springHibernate.dao.DaftarMatakuliahDAO;

@Service("DaftarMatakuliahService")
@Transactional(readOnly = true)

public class DaftarMatakuliahServiceImpl implements DaftarMatakuliahService {

    @Autowired
    private DaftarMatakuliahDAO DaftarMatakuliahDAO;
    
    @Transactional
    @Override
    public void save(Matakuliahbaru matkul) {
        DaftarMatakuliahDAO.save(matkul);
    }
    
    @Transactional
    @Override
    public void update(Matakuliahbaru matkul) {
        DaftarMatakuliahDAO.update(matkul);
    }

    @Transactional
    @Override
    public void delete(Matakuliahbaru matkul) {
        DaftarMatakuliahDAO.delete(matkul);
    }

    @Override
    public Matakuliahbaru getMatkul(String kodeMatkul) {
        return DaftarMatakuliahDAO.getMatkul(kodeMatkul);
    }

    @Override
    public List<Matakuliahbaru> getMatkul1() {
        return DaftarMatakuliahDAO.getMatkul1();
    }
}
