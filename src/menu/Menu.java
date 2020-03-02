package menu;

import dynamicenum.DynamicEnum;
import utilidades.Inputs;
import java.util.List;

/**
 *
 * O Menú almacena elementos de enum OptionElement, e permite engadir todos os 
 * elementos de enums (Class) que sexan OptionElement.
 * 
 * Un Menú é un DynamicEnum que almacena elementos OptionElement, e é capaz de
 * cargar constantes enum OptionElement.
 * 
 * OptionElement implementa EnumElement, logo cumple os requisitos do Generic
 * indicado en DynamicEnum. No DynamicEnum  E será OptionElement e T será
 * calqueira clase que implemente o interface OptionElement
 */
public class Menu extends DynamicEnum <OptionElement,Class <? extends OptionElement>> {
    private String title; // Título do Menu
    
    /**
     * Constructor a partir do título do menú
     * @param title Título do menú
     */
    public Menu(String title) {
        this.title=title;
    }
    
    /**
     * Constructor a partir do título do menú e das opcións.
     * @param title Título do Menú
     * @param options  Class que define as opcións
     */
    public Menu(String title,Class <? extends OptionElement> options) {
        this.title=title;
        addElements(options);
    }
    
    /**
     * Pon o título
     * @param title Título 
     */
    public void setTitle(String title) {
        this.title=title;
    }
    
    /**
     * Pon as opcións no menú eliminando as anteriores. Se define por utilizar
     * un nome "mais apropiado", se podería utilizar directamente setElements
     * @param options - Class de calqueira enu que implemente OptionElement
     */
    public void setOptions(Class <? extends OptionElement> options) {
        setElements(options);
    }
    
    /**
     * Engade opcións menú despois das xa existentes.
     * @param options - Class de calqueira enu que implemente OptionElement
     */
    public void addOptions(Class <? extends OptionElement> options) {
        addElements(options);
    }
    
    /**
     * Visualiza o menú e permite elexir a opción. Se encarga de chamar ao 
     * método doOption do elemento elexido do enum.
     * 
     * TODO (cambios no futuro): Se poderia buscar un sistema de elección de opción que non fora
     * sempre un número, indicando no parámetro como queremos elexir (número ou
     * unha letra dun conxunto...);. Unha idea, sería incorporar unha chave os
     * elementos do menú que poda ser de calqueira tipo, e segundo o tipo da chave
     * se solicitaría ou número, ou letra ou texto.... axudándose de "Generics"...
     */
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
