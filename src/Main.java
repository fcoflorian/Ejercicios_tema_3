public class Main {
    public static void main(String[] args) {
        suma(634,655,64);

        Coche miCoche = new Coche();
        miCoche.AumnetarPuerta();
        miCoche.AumnetarPuerta();

        System.out.println("Numero de puerta del coche es: " + miCoche.numeroDePuerta);

    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println("La sumatorio de las 3 variables a+b+c es: " + resultado);

    }

}
//Segunda parte:
class Coche{
    public int numeroDePuerta = 0;

    public void AumnetarPuerta(){
        this.numeroDePuerta ++;
    }
}