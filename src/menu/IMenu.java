package menu;

import utilidades.Inputs;

/**
 * @author xavi
 */
public class IMenu {
    private final String title;
    private final OptionElement[] options;
    
    public IMenu(String title,Class<? extends OptionElement> menu) {
        this.title=title;
        this.options=menu.getEnumConstants();
        if (this.options==null) throw new IllegalArgumentException("Is nota a Enum"); 
    }
    
    public void run() {
        boolean end=false;
        OptionElement <OptionElement> choosed;
        int op;
        
        do {
            System.out.println(title);
            for(OptionElement opm: options) {
                System.out.println(opm.getTitle());
            }
            try {
                op=Inputs.getInt("Elixe Opcion: ", 1, options.length);
                System.out.println();
                choosed=options[op-1];  System.out.println("---->"+choosed);
                end=choosed.exec(choosed);
                System.out.println();
            } catch (Exception ex) {
                System.out.println("ERRO: "+ex.getMessage());
            }
        } while(!end);
    }
}
