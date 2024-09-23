import model.Sayajin;
import model.SayajinLendario;

public class Main {
    public static void main(String[] args) {
        SayajinLendario broly = new SayajinLendario("Broly");
        System.out.println("---Broly:---");
        broly.transformar();
        broly.transformar();
        broly.transformar();

        Sayajin goku = new Sayajin("Goku");
        System.out.println("---Goku:---");
        goku.transformar();
        goku.transformar();
        goku.transformar();
    }
}