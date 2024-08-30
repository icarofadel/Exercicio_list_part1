package Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.Pessoa;

public class CadastroPessoa {

    private static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        criarPessoa();
        separarPorSexo();
    }

    private static void criarPessoa() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome e o sexo da pessoa (M/F) separados por espaço (ou digite 'sair' para terminar):");

        while (true) {
            String input = s.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            String[] dados = input.split(" ");
            if (dados.length == 2) {
                String nome = dados[0];
                String sexo = dados[1].toUpperCase();

                if (sexo.equals("M") || sexo.equals("F")) {
                    pessoas.add(new Pessoa(nome, sexo));
                } else {
                    System.out.println("Sexo inválido! Use 'M' para masculino ou 'F' para feminino.");
                }
            } else {
                System.out.println("Entrada inválida! Digite o nome e o sexo separados por espaço.");
            }
        }

        System.out.println("*** Pessoas cadastradas ***");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    private static void separarPorSexo() {
        List<Pessoa> masculinas = new ArrayList<>();
        List<Pessoa> femininas = new ArrayList<>();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo().equals("M")) {
                masculinas.add(pessoa);
            } else if (pessoa.getSexo().equals("F")) {
                femininas.add(pessoa);
            }
        }

        System.out.println("*** Pessoas do sexo Masculino ***");
        for (Pessoa pessoa : masculinas) {
            System.out.println(pessoa.getNome());
        }

        System.out.println("*** Pessoas do sexo Feminino ***");
        for (Pessoa pessoa : femininas) {
            System.out.println(pessoa.getNome());
        }
    }
}
