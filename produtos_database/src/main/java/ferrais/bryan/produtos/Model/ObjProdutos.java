package ferrais.bryan.produtos.Model;
import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor

public class ObjProdutos {

        @Getter @Setter
        private String nome;
        @Getter @Setter
        private String fornecedor;
        @Getter @Setter
        private double preco;
        @Getter @Setter
        private int estoque;


}
