package excepciones;

public class NumeroNegativoExcepcion extends Exception{
    
    public NumeroNegativoExcepcion(){
        super("Numero negativo ingresado");
    }

    public NumeroNegativoExcepcion(String message){
        super(message);
    }

}
