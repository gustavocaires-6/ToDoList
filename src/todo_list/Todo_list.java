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
        boolean continuar = true;

        while (continuar) {
            System.out.println("=== LISTA DE TAREFAS ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Excluir tarefa");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    // chamar método/lógica de adicionar tarefa
                    break;
                case 2:
                    // chamar método/lógica de listar tarefas
                    break;
                case 3:
                    // chamar método/lógica de concluir tarefa
                    break;
                case 4:
                    // chamar método/lógica de excluir tarefa
                    break;
                case 5:
                    System.out.println("Programa encerrado. Até mais!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        }

        scanner.close();
    }
}

