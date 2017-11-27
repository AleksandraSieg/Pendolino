package pl.madison.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.madison.dao.OsobowyDao;
import pl.madison.dao.PendolinoDao;
import pl.madison.dao.PociagDao;
import pl.madison.domain.Pendolino;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private OsobowyDao osobowyRespository;
    @Autowired
    private PendolinoDao pendolinoRespository;
    @Autowired
    private PociagDao pociagRespository;

    @RequestMapping(value = "/wyswietl", method = RequestMethod.GET)
    public String wyswietl(){
        String pendolino = "";

        for (Pendolino pendolino1 : pendolinoRespository.findAll()) {
            pendolino = pendolino + pendolino1;
        }

        return pendolino;
    }

    @RequestMapping(value = "/sredniaCenaBiletow", method = RequestMethod.GET)
    public String srednia(){
        String sredniaCena = "";
        double suma = 0;

        List<Pendolino> nowaLista = new ArrayList<Pendolino>();

        for (Pendolino pendolino : pendolinoRespository.findAll()) {
            suma = suma + pendolino.getCenaBiletu();
        }

        double srednia = suma/pendolinoRespository.count();

        for (Pendolino pendolino : pendolinoRespository.findAll()) {
            if(pendolino.getCenaBiletu()>srednia){
                nowaLista.add(pendolino);
            }
        }

        return sredniaCena + "srednia cena to: " +srednia + " srodki lokomocji, których cena biletu jest wyzsza od sredniej"
                + nowaLista;
    }
}
