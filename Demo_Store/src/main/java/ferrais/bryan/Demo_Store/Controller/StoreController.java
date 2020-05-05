package ferrais.bryan.Demo_Store.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ferrais.bryan.Demo_Store.Model.StoreObj;
import java.util.ArrayList;

@RestController
public class StoreController {

    @GetMapping("/Produtos")
    public ArrayList<StoreObj> getProduto() {
        StoreObj l = new StoreObj();
        l.setProduto("Teclado");
        StoreObj l1 = new StoreObj();
        l1.setProduto("Monitor");
        StoreObj l2 = new StoreObj();
        l2.setProduto("Mouse");

        ArrayList<StoreObj> lista1 = new ArrayList<>();
        lista1.add(l);
        lista1.add(l1);
        lista1.add(l2);
        return lista1;
    }
    @GetMapping("/Preços")
    public ArrayList<StoreObj> getPreco() {
        StoreObj l = new StoreObj();
        l.setPreco(40.00);
        StoreObj l1 = new StoreObj();
        l1.setPreco(125.40);
        StoreObj l2 = new StoreObj();
        l2.setPreco(12.00);

        ArrayList<StoreObj> lista2 = new ArrayList<>();
        lista2.add(l);
        lista2.add(l1);
        lista2.add(l2);
        return lista2;
    }
    @GetMapping("/Estoque")
    public ArrayList<StoreObj> getEstoque() {
        StoreObj l = new StoreObj();
        l.setEstoque(80);
        StoreObj l1 = new StoreObj();
        l1.setEstoque(40);
        StoreObj l2 = new StoreObj();
        l2.setEstoque(120);

        ArrayList<StoreObj> lista3 = new ArrayList<>();
        lista3.add(l);
        lista3.add(l1);
        lista3.add(l2);
        return lista3;
    }

}
