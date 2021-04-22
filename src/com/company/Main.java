package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static <listaAlunos> void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<String>();

        System.out.println("Cadastre 25 alunos: ");

        // Criando o objeto Aluno e inserindo em uma lista
        for(int i = 0; i<25; i++){
            Aluno aluno = new Aluno();
            String nomeAluno = sc.next();
            aluno.setNome(nomeAluno);

            lista.add(aluno.getNome());
        }

        // Caso eu queira inserir mais 5 alunos
        System.out.println("Você deseja cadastrar mais cinco alunos? Digite (sim) ou (não): ");
        String condicao = sc.next();

        if(condicao.equals("sim")) {
            System.out.println("Insira os nomes dos 5 alunos a mais: ");
            for(int i = 0; i<5; i++){
                Aluno aluno = new Aluno();
                String nomeAluno = sc.next();
                aluno.setNome(nomeAluno);

                lista.add(aluno.getNome());
            }
        }

        // Percorrendo a lista
        for(String i : lista){
            System.out.println(i);
        }

    }
}

