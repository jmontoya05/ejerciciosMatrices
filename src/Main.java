import java.util.Random;
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
        filas = 10;
        columnas = 10;
        matriz = new int[filas][columnas];

        calcularTablas(matriz, filas, columnas);
        mostrarMatriz(matriz, filas, columnas);

        //Ejercicio # 5
        System.out.println("Ejercicio # 5 (Temperatura cabina de pago)");
        filas = 5;
        columnas = 7;
        double[][] matrizTemp = new double[filas][columnas];

        llenarMatrizTemperatura(matrizTemp, filas, columnas);
        calcularTemperaturas(matrizTemp, filas, columnas);

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
                if (matriz[i][j] > 9) {
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
    private static void convertirMatrizEnArreglo(int[][] matriz, int filas, int columnas) {
        int tamanoArreglo = filas * columnas;
        int[] arreglo = new int[tamanoArreglo];
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
    private static void calcularTablas(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0) {
                    matriz[i][j] = j;
                } else if (j == 0) {
                    matriz[i][j] = i;
                } else {
                    matriz[i][j] = i * j;
                }
            }
        }
    }

    //Metodo que simula el mes de mayo y llena sus valores con temperaturas entre 7 y 38 grados
    private static void llenarMatrizTemperatura(double[][] matrizTemp, int filas, int columnas) {
        double randomValue, roundedValue;
        System.out.println("  Lun   --   Mar  --  Mie  --  Jue  --  Vie  --  Sab  --  Dom");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 4 && j > 2) {
                    matrizTemp[i][j] = 0;
                } else {
                    randomValue = 7.0 + (38.0 - 7.0) * Math.random();
                    roundedValue = Math.round(randomValue * 100.0) / 100.0;
                    matrizTemp[i][j] = roundedValue;
                }

                if (matrizTemp[i][j] - (int) matrizTemp[i][j] == 0) {
                    if (matrizTemp[i][j] < 10) {
                        System.out.print("| " + (int)matrizTemp[i][j] + "    |");
                    } else {
                        System.out.print("| " + (int)matrizTemp[i][j] + "   |");
                    }
                } else {
                    if (matrizTemp[i][j] < 10) {
                        System.out.print("| " + matrizTemp[i][j] + "  |");
                    } else {
                        System.out.print("| " + matrizTemp[i][j] + " |");
                    }
                }
            }
            System.out.println(" ");
        }
    }

    //Metodo para realizar los calculos de temperatura
    private static void calcularTemperaturas(double[][] matrizTemp, int filas, int columnas) {
        double tempMayor, tempMenor, sumaTemp, promedioTemp, tempMayorMes;
        int diaMayor = 0, diaMenor = 0, diaMayorMes = 0, semanaMayorMes = 0;
        tempMayorMes = matrizTemp[0][0];

        for (int i = 0; i < filas; i++) {
            tempMayor = 0;
            tempMenor = 40;
            sumaTemp = 0;
            for (int j = 0; j < columnas; j++) {
                if (i == 4) {
                    if (j < 3) {
                        if (matrizTemp[i][j] > tempMayor) {
                            tempMayor = matrizTemp[i][j];
                            diaMayor = j;
                        }
                        if (matrizTemp[i][j] < tempMenor) {
                            tempMenor = matrizTemp[i][j];
                            diaMenor = j;
                        }
                        sumaTemp += matrizTemp[i][j];
                        if (matrizTemp[i][j] > tempMayorMes) {
                            tempMayorMes = matrizTemp[i][j];
                            diaMayorMes = j;
                            semanaMayorMes = i;
                        }
                    }
                } else {
                    if (matrizTemp[i][j] > tempMayor) {
                        tempMayor = matrizTemp[i][j];
                        diaMayor = j;
                    }
                    if (matrizTemp[i][j] < tempMenor) {
                        tempMenor = matrizTemp[i][j];
                        diaMenor = j;
                    }
                    sumaTemp += matrizTemp[i][j];
                    if (matrizTemp[i][j] > tempMayorMes) {
                        tempMayorMes = matrizTemp[i][j];
                        diaMayorMes = j;
                        semanaMayorMes = i;
                    }
                }
            }

            if (i == 4) {
                promedioTemp = sumaTemp / 3;
            } else {
                promedioTemp = sumaTemp / columnas;
            }

            System.out.println("La temperatura mayor de la semana " + (i+1) + " fue de " + tempMayor + " registrada el día " + valida_dia(diaMayor));
            System.out.println("La temperatura menor de la semana " + (i+1) + " fue de " + tempMenor + " registrada el día " + valida_dia(diaMenor));
            System.out.println("El promedio de temperatura de la semana " + (i+1) + " fue de " + promedioTemp);
            System.out.println("------");
        }
        System.out.println("La temperatura más alta del mes fue de " + tempMayorMes + "  registrada el día " + valida_dia(diaMayorMes) + " de la semana " + (semanaMayorMes + 1) );
    }

    //Metodo para devolver el día de la semana de acuerdo al número
    private static String valida_dia(int dia) {
        switch (dia) {
            case 0:
                return "Lunes";
            case 1:
                return "Martes";

            case 2:
                return "Miércoles";
            case 3:
                return "Jueves";
            case 4:
                return "Viernes";
            case 5:
                return "Sábado";
            default:
                return "Domingo";
        }
    }

}