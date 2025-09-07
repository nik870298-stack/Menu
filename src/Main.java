import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int opcion;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("--------------Elige una de las opciones-------------");
            System.out.println("1. Dos Dados");
            System.out.println("2. Tres Dados");
            System.out.println("3. Indice de Masa");
            System.out.println("4. Promedio de notas del estudiante");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.Salir del Menu");
            System.out.println("Ingrese una opcion:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    dados2();
                    break;
                case 2:
                    dados3();
                    break;
                case 3:
                    IndiceDeMasa();
                    break;
                case 4:
                    promedioNotas();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
    public static void dados2(){
        var i = 0 ;
        int d1, d2,sumad1 = 0, sumad2 = 0;
        for ( i = 0; i <= 20; i++) {
            Random Aleatorio = new Random();
            d1 = Aleatorio.nextInt((6 - 1) + 1) + 1;
            d2 = Aleatorio.nextInt((6 - 1) + 1) + 1;
            sumad1 += d1;
            sumad2 += d2;

        }
        System.out.println("La suma total del dado uno es:" +sumad1);
        System.out.println("La suma total del dado dos es:" +sumad2);
    }
    public static void dados3(){
        var i = 0;
        int D1, D2,D3, sumaD1 = 0, sumaD2 = 0, sumaD3 = 0;
        for ( i = 0; i <= 20; i++) {
            Random Aleatorio = new Random();
            D1 = Aleatorio.nextInt((6-1)+1)+1;
            D2 = Aleatorio.nextInt((6-1)+1)+1;
            D3 = Aleatorio.nextInt((6-1)+1)+1;
            sumaD1 += D1;
            sumaD2 += D2;
            sumaD3 += D3;

        }
        if (sumaD1>sumaD2 && sumaD2>sumaD3){
            System.out.println("El dado uno es el mayor numero con:" +sumaD1);
            System.out.println("El dado dos es el numero neutral con:" +sumaD2);
            System.out.println("El dado tres es el menor numero con:" +sumaD3);
        } else if (sumaD2>sumaD1 && sumaD1>sumaD3) {
            System.out.println("El dado dos es el mayor numero con:" +sumaD2);
            System.out.println("El dado uno es el numero neutral con:" +sumaD1);
            System.out.println("El dado tres es el menor numero con:" +sumaD3);
        } else if (sumaD3>sumaD1 && sumaD1>sumaD2) {
            System.out.println("El dado tres es el mayor numero con:" +sumaD3);
            System.out.println("El dado uno es el numero neutral con:" +sumaD1);
            System.out.println("El dado dos es el menor numero con:" +sumaD2);
        } else if (sumaD1>sumaD3 && sumaD3>sumaD2) {
            System.out.println("El dado uno es el mayor numero con" +sumaD1);
            System.out.println("El dado tres es el numero neutral con:" +sumaD3);
            System.out.println("El dado dos es el menor numero con:" +sumaD2);
        } else if (sumaD2>sumaD3 && sumaD3>sumaD1) {
            System.out.println("El dado dos es el mayor numero con:" +sumaD2);
            System.out.println("El dado tres es el numero neutral con:" +sumaD3);
            System.out.println("El dado uno es el menor numero con:" +sumaD1);
        } else if (sumaD3>sumaD2 && sumaD2>sumaD1){
            System.out.println("El dado tres es el mayor numero con:" +sumaD3);
            System.out.println("El dado dos es el numero neutral con:" +sumaD2);
            System.out.println("El dado uno es el menor numero con:" +sumaD1);
        } else if (sumaD1>=sumaD2 && sumaD2>= sumaD3){
            System.out.println("Hubo un empate entre los tres dados");
        } else if (sumaD1>=sumaD2){
            System.out.println("Hubo un empate entre el dado uno y dos, el tercer dado saco:" +sumaD3);
        } else if (sumaD2==sumaD3){
            System.out.println("Hubo un empate entre el dado dos y tres, el primer dado saco:" +sumaD1);
        } else {
            System.out.println("Hubo un empate entre el dado tres y uno, el segundo dado saco:" + sumaD2);
        }
    }
    public static String IndiceDeMasa(){
        Scanner teclado = new Scanner(System.in);
        double Peso;
        System.out.println("Digite su peso:");
        Peso = teclado.nextDouble();
        double Estatura;
        System.out.println("Digite su estatura:");
        Estatura = teclado.nextDouble();
        double IMC = (Peso/Math.pow(Estatura, 2));
        System.out.println("IMC" +IMC);
        if (IMC<18.5){
            System.out.println("Su péso es bajo");
        } else if (IMC>=18.5 && IMC<=24.9){
            System.out.println("Su peso es normal");
        }else if (IMC>=25 && IMC<=26.9){
            System.out.println("Tiene sobrepeso de grado uno");
        }else if (IMC>=27 && IMC<=29.9){
            System.out.println("Tiene sobrepeso de grado dos");
        }else if (IMC>=30 && IMC<=34.9){
            System.out.println("Tiene obesidad de tipo uno");
        }else if (IMC>=35 && IMC<=39.9){
            System.out.println("Tiene obesidad de tipo dos");
        }else if (IMC>=40 && IMC<=49.9){
            System.out.println("Tiene obesidad de tipo tres (Morbida)");
        }else if (IMC>50){
            System.out.println("Tiene obesidad de tipo cuatro (Extrema)");
        }
        return "Su IMC es ";
    }
    public static void promedioNotas(){
        Scanner n = new Scanner(System.in);
        System.out.println("Digite la cantidad de notas:");
        int numeroDeNotas = n.nextInt();
        double[] notas = new double[numeroDeNotas];
        double suma = 0;
        for (int i = 0; i < numeroDeNotas; i++){
            System.out.println("Digite la nota"+(i+1)+":");
            notas[i] = n.nextDouble();
            suma += notas[i];
        }
        double promedio = suma/numeroDeNotas;
        System.out.println("El promedio del estudiante es:" +promedio);
        if (promedio >= 3.0) {
            System.out.println("Estado: Aprobado ");
        } else {
            System.out.println("Estado: Reprobado ");
        }
    }
}