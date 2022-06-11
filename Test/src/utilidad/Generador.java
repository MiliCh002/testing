package utilidad;

/**
 * @author Luis Roberto Cruz
 * @version 1.2.1
 * 
 * La clase generador tiene la funcion de crear contraseñas de forma aleatoria en diferentes formatos
 * Siendo asi esta pueda crear contraseñas en formato numerico, alfabetico y alfanumerico utlizando
 * un ciclo en el que se genera una seed que sera utlizada como indice que indicara el caracter que 
 * sera concatenado a la contraseña, de esta forma el proceso se reiterara de manera predeterminada
 * en doce (12) dando así una cadena en la que su longitud sera dada por la cantidad de reiteraciones
 * en el ciclo. 
 * Para finalizar la clase contara con metodos en los que el usuario indicara la longitud de la cadena
 * siendo así esta ingresada por el parametro de entrada del metodo.
 * 
 * The generator class has the function of creating random passwords in different formats
 * Being so, it can create passwords in numeric, alphabetic and alphanumeric format using
 * a cycle in which a seed is generated that will be used as an index that will indicate the character that
 * will be concatenated to the password, in this way the process will be repeated by default
 * in twelve (12) thus giving a chain in which its length will be given by the number of repetitions
 * in the cycle.
 * To finish the class, it will have methods in which the user will indicate the length of the chain
 * Being so, it is entered by the input parameter of the method.
 */
public class Generador {

    /**
     * Genera una contraseña aleatoria numerica de tipo String 
     * @return pass               Contraseña numerica
     */
    public static String genNumberPassword(){
        String pass = "";
        String gen = "0123456789";
        int count = 0;

        while (count < 12) {
            int seed = (int) (Math.random() * 10 + 1);
            pass += gen.charAt(seed);
            count++;
        }
        
        return pass;
    }

    /**
     * 
     * @param longitud
     * @return
     */
    public static String genNumberPassword(int longitud){
        String pass = "";
        String gen = "0123456789";
        int count = 0;

        while (count < longitud) {
            int seed = (int) (Math.random() * 10 + 1);
            pass += gen.charAt(seed);
            count++;
        }
        
        return pass;
    }

    public static String genAlphafeticPassword(){
        String pass = "";
        String gen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 0;

        while (count < 12) {
            int seed = (int) (Math.random() * gen.length() + 1);
            pass += gen.charAt(seed);
            count++;
        }

        return pass;
    }

    public static String genAlphafeticPassword(int longitud){
        String pass = "";
        String gen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 0;

        while (count < longitud) {
            int seed = (int) (Math.random() * gen.length() + 1);
            pass += gen.charAt(seed);
            count++;
        }

        return pass;
    }

    public static String genAlphanumericPassword(){
        String pass = "";
        String gen = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 0;

        while (count < 12) {
            int seed = (int) (Math.random() * gen.length() + 1);
            pass += gen.charAt(seed);
            count++;
        }

        return pass;
    }

    public static String genAlphanumericPassword(int longitud){
        String pass = "";
        String gen = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 0;

        while (count < longitud) {
            int seed = (int) (Math.random() * gen.length() + 1);
            pass += gen.charAt(seed);
            count++;
        }

        return pass;
    }

}