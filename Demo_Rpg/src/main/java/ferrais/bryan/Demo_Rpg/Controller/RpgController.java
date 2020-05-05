package ferrais.bryan.Demo_Rpg.Controller;

/**
 *
 * @author Bryan Ferrais
 * @since 05/05/2020
 * @version DEMO 1.0
 *
 */
import ferrais.bryan.Demo_Rpg.Model.RpgObj;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RpgController {

    @GetMapping("/classe")
    public ArrayList<RpgObj> getNome(){
        RpgObj l = new RpgObj();
        l.setNome("Warrior");
        RpgObj l1 = new RpgObj();
        l1.setNome("Mage");
        RpgObj l2 = new RpgObj();
        l2.setNome("Cleric");

        ArrayList<RpgObj> lista1 = new ArrayList<>();
        lista1.add(l);
        lista1.add(l1);
        lista1.add(l2);
        return lista1;

    }
    @GetMapping("/abilidade")
    public ArrayList<RpgObj> getAbilidade(){
        RpgObj l = new RpgObj();
        l.setAbilidade("Weapon Attack");
        RpgObj l1 = new RpgObj();
        l1.setAbilidade("Magic Attack");
        RpgObj l2 = new RpgObj();
        l2.setAbilidade("Healing Spell");

        ArrayList<RpgObj> lista2 = new ArrayList<>();
        lista2.add(l);
        lista2.add(l1);
        lista2.add(l2);
        return lista2;

    }
    @GetMapping("/HP")
    public ArrayList<RpgObj> getHp(){
        RpgObj l = new RpgObj();
        l.setHp(300);
        RpgObj l1 = new RpgObj();
        l1.setHp(120);
        RpgObj l2 = new RpgObj();
        l2.setHp(240);

        ArrayList<RpgObj> lista3 = new ArrayList<>();
        lista3.add(l);
        lista3.add(l1);
        lista3.add(l2);
        return lista3;

    }
    @GetMapping("/MP")
    public ArrayList<RpgObj> getMp(){
        RpgObj l = new RpgObj();
        l.setMp(50);
        RpgObj l1 = new RpgObj();
        l1.setMp(300);
        RpgObj l2 = new RpgObj();
        l2.setMp(200);

        ArrayList<RpgObj> lista4 = new ArrayList<>();
        lista4.add(l);
        lista4.add(l1);
        lista4.add(l2);
        return lista4;

    }



}
