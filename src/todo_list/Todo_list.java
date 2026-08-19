/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todo_list;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Todo_list {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tarefas = new String[10];
        boolean[] concluidas = new boolean[10];

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("=========Lista de Tarefas==========");
            System.out.println("Adicionar Tarefa: 1 ");
            System.out.println("Listar Tarefa: 2 ");
            System.out.println("Concluir Tarefa: 3 ");
            System.out.println("Excluir Tarefa: 4 ");
            System.out.println("Sair: 5 ");

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    int posicaoLivre = -1;

                    for (int i = 0; i < tarefas.length; i++) {
                        if (tarefas[i] == null) {
                            posicaoLivre = i;
                            break;
                        }
                    }
                    if (posicaoLivre == -1) {
                        System.out.println("A lista de tarefas está cheia!");
                    } else {
                        System.out.println("Digite a tarefa: ");
                        tarefas[posicaoLivre] = scanner.nextLine();
                        concluidas[posicaoLivre] = false;
                        System.out.println("Tarefa adicionada com sucesso!");
                    }
                    break;

                case 2:
                    boolean listaVazia = true;

                    for (int i = 0; i < tarefas.length; i++) {
                        if (tarefas[i] != null) {
                            listaVazia = false;
                            break;
                        }
                    }
                    if (listaVazia) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("=========Minhas Tarefas==========");
                        for (int i = 0; i < tarefas.length; i++) {
                            if (tarefas[i] != null) {
                                if (concluidas[i]) {
                                    System.out.println((i + 1) + " - [X] " + tarefas[i]);
                                } else {
                                    System.out.println((i + 1) + " - [ ] " + tarefas[i]);
                                }
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o número da tarefa que deseja concluir: ");
                    int numeroConcluir = scanner.nextInt();
                    scanner.nextLine();

                    int indiceConcluir = numeroConcluir - 1;

                    if (indiceConcluir < 0 || indiceConcluir >= tarefas.length || tarefas[indiceConcluir] == null) {
                        System.out.println("Tarefa inválida!");
                    } else {
                        concluidas[indiceConcluir] = true;
                        System.out.println("Tarefa concluída com sucesso!");
                    }
                    break;

                case 4:
                    System.out.println("Digite o número da tarefa que deseja excluir: ");
                    int numeroExcluir = scanner.nextInt();
                    scanner.nextLine();

                    int indiceExcluir = numeroExcluir - 1;

                    if (indiceExcluir < 0 || indiceExcluir >= tarefas.length || tarefas[indiceExcluir] == null) {
                        System.out.println("Tarefa inválida!");
                    } else {
                        tarefas[indiceExcluir] = null;
                        concluidas[indiceExcluir] = false;
                        System.out.println("Tarefa excluída com sucesso!");
                    }
                    break;

                case 5:
                    System.out.println("Programa encerrado. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        }

        scanner.close();
    }
}