package DynamicEnum;

public interface EnumElement <T,P> {
    // Devolve o nome do enum. 
    public default String name() {
        return "";
    };

    /**
     * Os elementos incluídos no Enum deben dispoñer dun método doWith.
     * Este método levará a cabo a funcionalidade do elemento.
     * @param args
     * @return
     */
    public T doWith(P args); // Invoca a acción asociada ao enum
}
