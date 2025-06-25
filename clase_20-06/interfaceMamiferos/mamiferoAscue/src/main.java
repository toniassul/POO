import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException  {

        System.out.println("");

        System.out.println("___________________________________________________");
        Mamifero mamifero = new Mamifero();
        mamifero.amamantarCrias();
        
        System.out.println("___________________________________________________");
        Ballena ballena = new Ballena();
        ballena.amamantarCrias();
        
        System.out.println("___________________________________________________");
        Ornitorrinco ornitorrinco = new Ornitorrinco();
        ornitorrinco.amamantarCrias();
        ornitorrinco.ponerHuevos();

        System.out.println("___________________________________________________");
        System.out.println("Alumno: George Anthony Ascue Sulca");
        System.out.println("___________________________________________________");
        System.in.read();
    }
}
