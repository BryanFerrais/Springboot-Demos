package ferrais.bryan.Demo_Cars.Controller;

/**
 *
 * @author Bryan Ferrais
 * @since 05/04/2020
 * @version DEMO 1.0
 *
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ferrais.bryan.Demo_Cars.Model.CarsList;

import java.util.ArrayList;
public class ObjCars {

    @GetMapping("/nome")
    public ArrayList<CarsList> getNome(){

        CarsList L = new CarsList();
        L.setNome("Lancer Evolution");//mitsubishi
        CarsList L1 = new CarsList();
        L1.setNome("Mustang");//Ford
        CarsList L2 = new CarsList();
        L2.setNome("Charger");//Dodge

        ArrayList<CarsList> lista = new ArrayList<>();
        lista.add(L);
        lista.add(L1);
        lista.add(L2);
        return lista;

    }
    @GetMapping("/marca")
    public ArrayList<CarsList> getMarca(){

        CarsList L = new CarsList();
        L.setMarca("Mitsubishi");
        CarsList L1 = new CarsList();
        L1.setMarca("Ford");
        CarsList L2 = new CarsList();
        L2.setMarca("Dodge");

        ArrayList<CarsList> lista1 = new ArrayList<>();
        lista1.add(L);
        lista1.add(L1);
        lista1.add(L2);
        return lista1;

    }
    @GetMapping("/Cor")
    public ArrayList<CarsList> getCor(){

        CarsList L = new CarsList();
        L.setCor("Azul");
        CarsList L1 = new CarsList();
        L1.setCor("Preto");
        CarsList L2 = new CarsList();
        L2.setCor("Verde");

        ArrayList<CarsList> lista2 = new ArrayList<>();
        lista2.add(L);
        lista2.add(L1);
        lista2.add(L2);
        return lista2;

    }
    @GetMapping("/Preço")
    public ArrayList<CarsList> getValor(){

        CarsList L = new CarsList();
        L.setValor(38.500);
        CarsList L1 = new CarsList();
        L.setValor(32.200);
        CarsList L2 = new CarsList();
        L2.setValor(35.400);

        ArrayList<CarsList> lista3 = new ArrayList<>();
        lista3.add(L);
        lista3.add(L1);
        lista3.add(L2);
        return lista3;

    }
}
