package daftarmatakuliah;

import daftarmatakuliah.springHibernate.service.DaftarMatakuliahService;
import daftarmatakuliah.springHibernate.view.ViewMatakuliah;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    private static ApplicationContext applicationContext;
    
    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("spring-configuration.xml");
        new ViewMatakuliah().setVisible(true);
    }
    
    public static DaftarMatakuliahService getDaftarMatakuliahService(){
        return (DaftarMatakuliahService) applicationContext.getBean("DaftarMatakuliahService");
    }
}
