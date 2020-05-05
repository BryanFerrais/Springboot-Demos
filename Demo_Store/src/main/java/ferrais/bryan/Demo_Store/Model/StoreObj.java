package ferrais.bryan.Demo_Store.Model;
import lombok.*;

/**
 *
 * @author Bryan Ferrais
 * @since 05/05/2020
 * @version DEMO 1.0
 *
 */

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StoreObj {

    @Getter @Setter
    private String produto;
    @Getter @Setter
    private double preco;
    @Getter @Setter
    private int estoque;

}
