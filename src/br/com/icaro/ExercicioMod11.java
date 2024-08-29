package br.com.icaro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioMod11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> listaNomes = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes para adicionar à lista (ou digite 'sair' para terminar):");

        while (true) {
            String nome = s.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            listaNomes.add(nome);
        }

        Collections.sort(listaNomes);

        System.out.println("Nomes ordenados em ordem alfabética:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}