public class Complejo {

    private double real, imaginario;

    public Complejo(double r, double i){

        this.real = r;
        this.imaginario = i;

    }

    public Complejo suma (Complejo a, Complejo b){
        return new Complejo( a.real + b.real, a.imaginario + b.imaginario);
    }

}
