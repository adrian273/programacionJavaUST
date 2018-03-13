package jenum;

/**
 *
 * @author 
 * Adrian Verdugo
 * Catalina Nuñez
 * 
 * @descripcion
 * Un ENUM sirve para restringir la seleccion de valores previamente definidos
 * Ejemplo de un emum con constructor.
 */
public enum Fruit {
    
    MANZANA("Rojo", "1500"),
    PERA("Amarillo", "1500"),
    NARANJA("Naranja", "1500");
    
    private final String color;
    private final String precio;
    
    Fruit(String c, String p) {
        color = c;
        precio = p;
    }
    
    // color de la fruta
    public String getcolor() {
        return color;
    }
    
    // precio total de la fruta
    public String getPrecio() {
        return precio;
    }
}
