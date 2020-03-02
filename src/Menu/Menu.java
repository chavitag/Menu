/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import DynamicEnum.DynamicEnum;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xavi
 */
public class Menu <E extends OptionElement> extends DynamicEnum <OptionElement,Class <? extends OptionElement>> {
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
                System.out.println(opm.getTitle());
            }
            try {
                op=Utils.getInt("Elixe Opcion: ", 1, options.size())-1;
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
