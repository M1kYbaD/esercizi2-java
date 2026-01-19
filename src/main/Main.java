package main;

import java.lang.reflect.Method;
import java.math.BigInteger;

import methods.*;

public class Main {

	public static void main(String[] args) {

		String s1 = "anna";

		int[] arrayInt1 = { 7, 14, 3, 22, 18, 11, 9, 16 };
		String[] arrayStr1 = { "cielo", "cortigiani", "strada", "mare", "villaggi", "montano" };
		int[][] matrInt1 = { { 5, 7, 3 }, { 8, 4, 6 }, { 3, 8, 5 } };
		String[][] matrStr1 = { { "gatto", "candela", "ape" }, { "sentiero", "luna", "limone" },
				{ "eco", "diamante", "vento" } };
		String[][] matrStr2 = { { "ciao", "mondo", "ciao", "sole" }, { "pioggia", "ciao", "luna", "stella" },
				{ "mare", "vento", "ciao", "neve" }, { "terra", "fuoco", "acqua", "ciao" } };
		int[][] matrBase = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		int[][] matrEsponente = { { 3, 3, 3 }, { 3, 3, 3 }, { 3, 3, 3 } };

		// Methods.stampArrInt(arrayInt1);
		Methods.stampArrStr(arrayStr1);
		// Methods.stampMatrInt(matrInt1);
		// Methods.stampMatrStr(matrStr1);
		// Methods.stampMatrStr(matrStr2);
		// Methods.stampMatrInt(matrBase);
		// Methods.stampMatrInt(matrEsponente);

		// Methods.arrayIntCresc(arrayInt1);
		// Methods.arrayIntDecr(arrayInt1);
		Methods.arrayStringLungCresc(arrayStr1);
		// Methods.arrayStringLungDecr(arrayStr1);
		// System.out.println("La stringa 's' è palindroma: " +
		// Methods.verStringIsPalindroma(s1));
		// Methods.verStrIntUguali(matrStr1, matrInt1);
		// Methods.matrIntPotenze(matrBase, matrEsponente);
		// System.out.println("Occorrenze 'ciao': " +
		// Methods.numOccorStrInMatr(matrStr2, "ciao"));

	}

}
