package ferrais.bryan.Demo_Cars.Model;

import lombok.*;
/**
 *
 * @author Bryan Ferrais
 * @since 05/04/2020
 * @version DEMO 1.0
 *
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CarsList {

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String marca;

    @Getter @Setter
    private String cor;

    @Getter @Setter
    private double valor;

}//class
