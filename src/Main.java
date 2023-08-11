import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Ejercicio # 1
        System.out.println("Ejercicio # 1 (Crear y mostrar matriz)");
        System.out.println("Por favor ingrese la cantidad de filas de la matriz");
        int filas = sc.nextInt();
        System.out.println("Por favor ingrese la cantidad de columnas de la matriz");
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];

        llenarMatriz(matriz, filas, columnas);
        mostrarMatriz(matriz, filas, columnas);
        System.out.println("-------------------");
        //Ejercicio # 2
        System.out.println("Ejercicio # 2 (Suma de 2 columnas y resultado en la tercera)");
        System.out.println("Por favor ingrese la cantidad de filas de la matriz");
        filas = sc.nextInt();
        columnas = 3;
        int[][] matrizSuma = new int[filas][columnas];

        llenarMatriz(matrizSuma, filas, (columnas - 1));
        mostrarMatrizSuma(matrizSuma, filas);

        System.out.println("-------------------");
        //Ejercicio # 3
        System.out.println("Ejercicio # 3 (Pasar elementos de una matriz a un arreglo )");
        System.out.println("Por favor ingrese la cantidad de filas de la matriz");
        filas = sc.nextInt();
        System.out.println("Por favor ingrese la cantidad de columnas de la matriz");
        columnas = sc.nextInt();
        matriz = new int[filas][columnas];

        llenarMatriz(matriz, filas, columnas);
        System.out.println("Así quedó la matriz");
        mostrarMatriz(matriz, filas, columnas);
        System.out.println("Así quedó el arreglo");
        convertirMatrizEnArreglo(matriz, filas, columnas);

        System.out.println("-------------------");
        //Ejercicio # 4
        System.out.println("Ejercicio # 4 (Tabla del 1 al 9)");
        System.out.println("Por favor ingrese la cantidad de filas de la matriz");
        filas = 10;
        columnas = 10;
        matriz = new int[filas][columnas];

        calcularTablas(matriz, filas, columnas);
        mostrarMatriz(matriz, filas, columnas);

    }

    //Metodo para llenar la matriz con números aleatorios entre 1 y 9
    private static void llenarMatriz(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * 9 + 1);
            }
        }
    }

    //Metodo para mostrar los valores de la matriz
    private static void mostrarMatriz(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > 9){
                    System.out.print(matriz[i][j] + "  ");
                } else {
                    System.out.print(matriz[i][j] + "   ");
                }

            }
            System.out.println(" ");
        }
    }

    //Metodo para mostrar una matriz de 3 columnas de forma C1 + C2 = C3
    private static void mostrarMatrizSuma(int[][] matrizSuma, int filas) {
        for (int i = 0; i < filas; i++) {
            matrizSuma[i][2] = matrizSuma[i][0] + matrizSuma[i][1];
            System.out.print(matrizSuma[i][0] + " + " + matrizSuma[i][1] + " = " + matrizSuma[i][2]);
            System.out.println(" ");
        }
    }

    //Metodo para copiar los valores de una matriz a un arreglo unidimensional y mostrarlo
    private static void convertirMatrizEnArreglo(int [][] matriz, int filas, int columnas){
        int tamanoArreglo = filas * columnas;
        int [] arreglo = new int[tamanoArreglo];
        int posicionArreglo = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                arreglo[posicionArreglo] = matriz[i][j];
                System.out.print(arreglo[posicionArreglo] + "   ");
                posicionArreglo += 1;
            }
        }
        System.out.println(" ");
    }

    //Metodo para calcular las tablas del 1 al 9 en una matriz
    private static void calcularTablas(int [][] matriz, int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0){
                    matriz[i][j] = j;
                } else if (j == 0){
                    matriz[i][j] = i;
                } else {
                    matriz[i][j] = i * j;
                }
            }
        }
    }

}