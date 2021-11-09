
package it.unisa.prova;

/**
 *
 * @author foggia
 */
public class Main {
    public static void main(String args[]) {
        salute("Fisciano");
        System.out.println("Hola mundo");
        System.out.println("Salve mondo");
        salute("universe");
        salute("metaverse");
    }
    
    public static void salute(String whom) {
        System.out.println("Hello, "+whom);
    }
}
