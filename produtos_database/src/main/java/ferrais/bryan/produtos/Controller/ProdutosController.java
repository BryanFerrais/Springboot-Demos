package ferrais.bryan.produtos.Controller;
import ferrais.bryan.produtos.Model.ObjProdutos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProdutosController {

    @GetMapping("/")
    public ArrayList<ObjProdutos> getRefri(){

        ObjProdutos Obj = new ObjProdutos();
        Obj.setNome("Refrigerante");
        Obj.setFornecedor("Pepsi");
        Obj.setPreco(5.30);
        Obj.setEstoque(200);

        ArrayList<ObjProdutos> produtoadd = new ArrayList<>();
        produtoadd.add(Obj);
        return produtoadd;

    }

}
