/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import DynamicEnum.DynamicEnum;
import Utilidades.Inputs;
import java.util.List;

/**
 *
 * O Menú almacena elementos de enum OptionElement, e permite engadir todos os 
 * elementos de enums (Class) que sexan OptionElement
 */
public class Menu extends DynamicEnum <OptionElement,Class <? extends OptionElement>> {
    private final String title;
    
    public Menu(String title,Class <? extends OptionElement> options) {
        this.title=title;
        addTypes(options);
    }
    
    public void run() {
        List <OptionElement> options=this.getEnums();
        boolean end=false;
        OptionElement choosed;
        int op;
        
        do {
            System.out.println(title);
            for(OptionElement opm: options) {
                System.out.println(opm.name());
            }
            try {
                op=Inputs.getInt("Elixe Opcion: ", 1, options.size())-1;
                System.out.println();
                choosed=options.get(op);
                end=choosed.doOption(choosed);
                System.out.println();
            } catch (Exception ex) {
                System.out.println("ERRO: "+ex.getMessage());
            }
        } while(!end);
    }
}
