package dynamicenum;

import java.util.ArrayList;
/**
 * Permite almacenar e recuperar Enum que implementen EnumElement
 * @param <E> Tipo de Enums a almacenar no ArrayList. Debe ser un enum que implemente EnumElement 
 */
public class DynamicEnum <E extends EnumElement> {
    protected final ArrayList <E> types=new ArrayList <>();
        
    public DynamicEnum() {  }
     
    /**
     * Engade os elementos do enum T ao final ArrayList types.
     * 
     * @param enumclass indica de qué clase queremos extraer os elementos. 
     * Esta clase debe ser unha un enum que implemente EnumElement
     * @return Array con todos os elementos en types
     */
    public ArrayList <E> addElements(Class <? extends E> enumclass) {
        /*  a clase java.lang.Class ten o método getEnumConstants() que devolve un 
            array cos elementos do enum, ou null si a clase non corresponde cun Enum
        
            A especificación Generics na cabeceira desta clase garantiza que os elementos
            no enum son de tipo EnumElement (O enum debe implementar o interface EnumElement)
        */
        E[] values=(E[])enumclass.getEnumConstants();
        if (values==null) throw new IllegalArgumentException("Is nota a Enum");        
        addElements(values);
        return types;
    }
    
    /**
     * Engade un EnumElement que non é realmente membro de un Enum, como membro
     * do DynamicEnum. 
     * 
     * Debería sobrepoñer o método getTitle e name()
     * @param element - EnumElement a engador
     * @return - Lista de todos os elementos
     */
    public ArrayList <E> addElement(E element) {
        types.add(element);
        return types;
    }
    
    /**
     * Engade os elementos do enum T ao ArrayList types eliminando os existentes.
     * 
     * @param enumclass indica de qué clase queremos extraer os elementos. 
     * Esta clase debe ser unha un enum que implemente EnumElement
     * @return Array con todos os elementos en types
     */
    public ArrayList <E> setElements(Class <? extends E> enumclass) {
        E[] values=(E[])enumclass.getEnumConstants();
        if (values==null) throw new IllegalArgumentException("Is nota a Enum");
        types.clear();
        addElements(values);
        return types;
    }
    
    /**
     * Permite obter todos os elementos almacenados en types.
     * @return Array con todos os elementos en types
     */
    public ArrayList <E> getEnums() {
        return types;
    }
    
    /**
     * Permite recuperar o elemento do Enum co nome indicado.
     * @param name Nome a localizar
     * @return A constante EnumElement que corresponde con nome. 
     * @throws IllegalArgumentException si o elemento non existe
     */
    public E get(String name) {
        for (E ty: types) {
            if (ty.name().equals(name)) return ty;
        }
        throw new IllegalArgumentException("Unknown Element "+name);
    }

    /**
     * Este método PRIVADO engade os EnumElements á Collection types.
     * Si xa existe un elemento co mesmo nome, non se engade.
     * @param values Array de EnumElement a engadir
     */
    private void addElements(E[] values) {
        for(E not: values) {
            try {
                for(E ot: types) {
                    if (not.name().equals(ot.name())) 
                        throw new IllegalArgumentException("Duplicate Element");
                } 
                types.add(not);
            } catch(IllegalArgumentException e) {} 
        }
    }
}
