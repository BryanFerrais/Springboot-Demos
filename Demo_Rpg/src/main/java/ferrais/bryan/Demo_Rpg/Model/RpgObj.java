package ferrais.bryan.Demo_Rpg.Model;

/**
 *
 * @author Bryan Ferrais
 * @since 05/05/2020
 * @version DEMO 1.0
 *
 */
import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RpgObj {

    @Getter @Setter
    private String nome;
    @Getter @Setter
    private String abilidade;
    @Getter @Setter
    private int hp;
    @Getter @Setter
    private int mp;


}
