package daftarmatakuliah.springHibernate.dao;

import daftarmatakuliah.springHibernate.model.Matakuliahbaru;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DaftarMatakuliahDAOImpl implements DaftarMatakuliahDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void save(Matakuliahbaru matkul) {
        sessionFactory.getCurrentSession().save(matkul);
    }

    @Override
    public void update(Matakuliahbaru matkul) {
        sessionFactory.getCurrentSession().update(matkul);
    }

    @Override
    public void delete(Matakuliahbaru matkul) {
        sessionFactory.getCurrentSession().delete(matkul);
    }

    @Override
    public Matakuliahbaru getMatkul(String kodeMatkul) {
        return (Matakuliahbaru) sessionFactory.getCurrentSession().get(Matakuliahbaru.class, kodeMatkul);
    }

    @Override
    public List<Matakuliahbaru> getMatkul1() {
        return sessionFactory.getCurrentSession().createCriteria(Matakuliahbaru.class).list();
    }
}