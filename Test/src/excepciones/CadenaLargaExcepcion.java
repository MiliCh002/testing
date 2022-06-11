package excepciones;

public class CadenaLargaExcepcion extends Exception{
    
    public CadenaLargaExcepcion(){
        super("La cadena supero el limite establecido");
    }

    public CadenaLargaExcepcion(String message){
        super(message);
    }

}
