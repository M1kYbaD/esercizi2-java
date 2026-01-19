package methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Methods {

	// STAMPA array 'int'
	public static void stampArrInt(int[] arrayInt) {
		System.out.print("int[" + arrayInt.length + "] -> ");
		System.out.print("{");
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.print(arrayInt[i]);
			if (i < arrayInt.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	// STAMPA array 'String'
	public static void stampArrStr(String[] arraySt) {
		System.out.print("String[" + arraySt.length + "] -> ");
		System.out.print("{");
		for (int i = 0; i < arraySt.length; i++) {
			System.out.print(arraySt[i]);
			if (i < arraySt.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");

	}

	// STAMPA matrice 'int'
	public static void stampMatrInt(int[][] matriceInt) {
		System.out.println("_______________________________________________________________________________________");
		System.out.println("Matrice 'Int' || Dimensione: " + matriceInt.length + " x " + matriceInt[0].length);
		System.out.println();

		for (int row = 0; row < matriceInt.length; row++) {
			for (int col = 0; col < matriceInt[row].length; col++) {
				System.out.print(matriceInt[row][col]);
				if (col < matriceInt[row].length - 1) {
					System.out.print(" | "); // separatore tra elementi
				} else {
					System.out.print(" "); // spazio finale prima della chiusura
				}
			}
			System.out.println();
		}
		System.out.println("_______________________________________________________________________________________");
		System.out.println();
	}

	// STAMPA matrice 'String'
	public static void stampMatrStr(String[][] matriceStr) {
		System.out.println("_______________________________________________________________________________________");
		System.out.println("Matrice 'String' || Dimensione: " + matriceStr.length + " x " + matriceStr[0].length);
		System.out.println();

		for (int row = 0; row < matriceStr.length; row++) {
			for (int col = 0; col < matriceStr[row].length; col++) {
				System.out.print(matriceStr[row][col]);
				if (col < matriceStr[row].length - 1) {
					System.out.print(" | "); // separatore tra elementi
				} else {
					System.out.print(" "); // spazio finale prima della chiusura
				}
			}
			System.out.println();
		}

		System.out.println("_______________________________________________________________________________________");
		System.out.println();
	}

	// ESERCIZIO 1 - Array 'int' in ordine CRESCENTE
	public static void arrayIntCresc(int[] arrayInt) {
		for (int i = 0; i < arrayInt.length - 1; i++) {
			for (int j = i + 1; j < arrayInt.length; j++) {
				if (arrayInt[i] > arrayInt[j]) {
					// Scambio manuale
					int temp = arrayInt[i];
					arrayInt[i] = arrayInt[j];
					arrayInt[j] = temp;
				}
			}
		}
		System.out.print("int[" + arrayInt.length + "] 'Crescente' -> ");
		System.out.print("{");
		for (int i2 = 0; i2 < arrayInt.length; i2++) {
			System.out.print(arrayInt[i2]);
			if (i2 < arrayInt.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	// ESERCIZIO 1.1 - Array 'int' in ordine DECRESCENTE
	public static void arrayIntDecr(int[] arrayInt) {
		for (int i = 0; i < arrayInt.length - 1; i++) {
			for (int j = i + 1; j < arrayInt.length; j++) {
				if (arrayInt[i] < arrayInt[j]) {
					// Scambio manuale
					int temp = arrayInt[i];
					arrayInt[i] = arrayInt[j];
					arrayInt[j] = temp;
				}
			}
		}
		System.out.print("int[" + arrayInt.length + "] 'Decrescente' -> ");
		System.out.print("{");
		for (int i2 = 0; i2 < arrayInt.length; i2++) {
			System.out.print(arrayInt[i2]);
			if (i2 < arrayInt.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	// ESERCIZIO 2 - Array 'String' in ordine per LUNGHEZZA CRESCENTE
	public static void arrayStringLungCresc(String[] arrayString) {
		// String min_Str = "";
		// for (int i = 1; i < arrayString.length; i++) {
		// if (arrayString[i].length() < arrayString[i - 1].length()) {
		// min_Str = arrayString[i];
		// }
		// }
		// System.out.println("Stringa più piccola: " + min_Str);
		Arrays.sort(arrayString, (a, b) -> a.length() - b.length());
		System.out.println("ordine crescente: " + (Arrays.toString(arrayString)));

	}

	// ESERCIZIO 2.1 - Array 'String' in ordine per LUNGHEZZA DECRESCENTE
	public static void arrayStringLungDecr(String[] arrayString) {
		Arrays.(arrayString, (a, b) -> a.length() + b.length());
		System.out.println("ordine decrescente: " + (Arrays.toString(arrayString)));

	}

	// ESERCIZIO 3 - VERIFICA se una String 's' è PALINDROMA
	public static boolean verStringIsPalindroma(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;

		}
		return true;

	}

	// ESERCIZIO 4 - Date due matrici ('String' e 'int'), restituire una matrice
	// 'boolean'
	// che VERIFICA se la LUNGHEZZA della stringa è UGUALE al valore intero:
	// (es. if ("ciao" == 4) allora true; else false;)
	public static boolean[][] verStrIntUguali(String[][] matrStr, int[][] matrInt) {
		boolean[][] matrBool = new boolean[matrStr.length][matrStr[0].length];

		for (int row = 0; row < matrBool.length; row++) {
			for (int col = 0; col < matrBool[row].length; col++) {
				if (matrStr[row][col].length() == matrInt[row][col]) {
					matrBool[row][col] = true;
				} else {
					matrBool[row][col] = false;
				}
			}
		}
		System.out.println("_______________________________________________________________________________________");
		System.out.println("Matrice 'Booleana' || Dimensione: " + matrBool.length + " x " + matrBool[0].length);
		System.out.println();

		for (int row = 0; row < matrBool.length; row++) {
			for (int col = 0; col < matrBool[row].length; col++) {
				System.out.print(matrBool[row][col]);
				if (col < matrBool[row].length - 1) {
					System.out.print(" | "); // separatore tra elementi
				} else {
					System.out.print(" "); // spazio finale prima della chiusura
				}
			}
			System.out.println();
		}

		System.out.println("_______________________________________________________________________________________");
		System.out.println();

		return matrBool;

	}

	// ESERCIZIO 5 - Date due matrici int 'matrBase' e 'matrEsponente' di uguali
	// dimensioni, restituisca una nuova matrice 'matrPotenza' in cui ogni elemento
	// è
	// il risultato della POTENZA tra gli elementi corrispondenti delle due matrici
	public static int[][] matrIntPotenze(int[][] matrBase, int[][] matrEsponente) {
		int[][] matrPotenza = new int[matrBase.length][matrBase[0].length];

		for (int row = 0; row < matrPotenza.length; row++) {
			for (int col = 0; col < matrPotenza[row].length; col++) {
				matrPotenza[row][col] = (int) Math.pow(matrBase[row][col], matrEsponente[row][col]);
			}
		}

		System.out.println("_______________________________________________________________________________________");
		System.out.println("MatrPotenza 'matriceBase' & 'matriceEsponente' || Dimensione: " + matrPotenza.length
				+ " x " + matrPotenza[0].length);
		System.out.println();

		for (int row = 0; row < matrPotenza.length; row++) {
			for (int col = 0; col < matrPotenza[row].length; col++) {
				System.out.print(matrPotenza[row][col]);
				if (col < matrPotenza[row].length - 1) {
					System.out.print(" | ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("_______________________________________________________________________________________");
		System.out.println();

		return matrPotenza;
	}

	// ESERCIZIO 6 - Data una matrice 'String' e una stringa 's',
	// restituire le occorrenze di 's' nella matrice
	public static int numOccorStrInMatr(String[][] matrStr, String s) {
		int occS = 0;
		for (int row = 0; row < matrStr.length; row++) {
			for (int col = 0; col < matrStr[row].length; col++) {
				if (matrStr[row][col].equals(s)) {
					occS++;
				}
			}
		}
		return occS;

	}

}
