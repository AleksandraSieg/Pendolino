package pl.madison;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.madison.dao.OsobowyDao;
import pl.madison.dao.PendolinoDao;
import pl.madison.dao.PociagDao;
import pl.madison.domain.Pendolino;

@SpringBootApplication
public class PendolinoApplication implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(PendolinoApplication.class, args);
    }

    @Autowired
    private OsobowyDao osobowyRespository;
    @Autowired
    private PendolinoDao pendolinoRespository;
    @Autowired
    private PociagDao pociagRespository;

    public void run(String... strings) throws Exception {
        Pendolino pendolino1 = new Pendolino();
        Pendolino pendolino2 = new Pendolino();
        Pendolino pendolino3 = new Pendolino();
        Pendolino pendolino4 = new Pendolino();

        pendolino1.setCzyWars(true);
        pendolino1.setIloscMiejscSiedzacych(40);
        pendolino1.setCenaBiletu(50);
        pendolinoRespository.save(pendolino1);
        pendolino2.setCzyWars(false);
        pendolino2.setIloscMiejscSiedzacych(50);
        pendolino2.setCenaBiletu(75);
        pendolinoRespository.save(pendolino2);
        pendolino3.setCzyWars(true);
        pendolino3.setIloscMiejscSiedzacych(100);
        pendolino3.setCenaBiletu(60);
        pendolinoRespository.save(pendolino3);
        pendolino4.setCzyWars(true);
        pendolino4.setIloscMiejscSiedzacych(90);
        pendolino4.setCenaBiletu(100);

    }
}
