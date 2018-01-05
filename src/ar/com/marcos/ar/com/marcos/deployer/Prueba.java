package ar.com.marcos.ar.com.marcos.deployer;

/**
 * Created by Marcos.Ladino on 12/18/2017.
 */
public class Prueba {

    public Prueba(){
        System.out.println("Without arguments");
    }

    public Prueba(int a){
        this();
        System.out.println("With arguments");
    }

    public static void main (String... args){
        new Prueba(3);
    }
}
