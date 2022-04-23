public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.PonerPuerta();
        miCoche.PonerPuerta();

        System.out.println(miCoche.puertas);
    }
}

class Coche {
    public int puertas = 3;

    public void PonerPuerta() {
        this.puertas++;
    }
}