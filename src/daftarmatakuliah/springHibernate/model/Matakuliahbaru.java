package daftarmatakuliah.springHibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matkul")

public class Matakuliahbaru {
    
    @Id
    @Column(name = "namamk", length = 255)
    private String namaMatkul;
    
    @Column(name = "kdmk", length = 255)
    private String kodeMatkul;
    
    @Column(name = "namadosen", length = 255)
    private String namaDosen;
   
    public String getNamaMatkul(){
        return namaMatkul;
    }
    
    public String getKodeMatkul(){
        return kodeMatkul;
    }
    
    public String getNamaDosen(){
        return namaDosen;
    }
    
    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
}