package Ejercicio_8;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        int pri = 0;
        int nopri = 0;
        for (int i = 2; i <= num; i++) {
        	int ultprimo = 2;
            while (ultprimo < i && i % ultprimo != 0) {
            	ultprimo++;
            }
            if (ultprimo == i) {
                pri++;
            }
            else {
            	nopri++;
            }
        }
        System.out.println("Hay " + pri + " números primos y " + nopri + " numeros no primos."); 
    }
}
