package org.example;

import javax.swing.JOptionPane;

public class FibonacciSequence {

    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean isInFibonacciSequence(int num) {
        // Inicializamos os dois primeiros números da sequência de Fibonacci
        int a = 0;
        int b = 1;

        // Iteramos pela sequência de Fibonacci até que o próximo número seja maior que o número informado
        while (b < num) {
            // Calculamos o próximo número da sequência
            int temp = b;
            b = a + b;
            a = temp;
        }

        // Se o número informado é igual ao número atual na sequência de Fibonacci, ele pertence à sequência
        return (num == b);
    }

    public static void main(String[] args) {
        // Solicitamos ao usuário que informe um número usando JOptionPane
        String input = JOptionPane.showInputDialog("Digite um número para verificar se pertence à sequência de Fibonacci:");

        try {
            // Convertendo a entrada do usuário para inteiro
            int num = Integer.parseInt(input);

            // Verificando se o número pertence à sequência de Fibonacci
            boolean isInSequence = isInFibonacciSequence(num);

            // Exibindo uma mensagem informando se o número pertence à sequência de Fibonacci ou não
            if (isInSequence) {
                JOptionPane.showMessageDialog(null, num + " pertence à sequência de Fibonacci.");
            } else {
                JOptionPane.showMessageDialog(null, num + " não pertence à sequência de Fibonacci.");
            }
        } catch (NumberFormatException e) {
            // Se o usuário não inserir um número válido, exibimos uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
        }
    }
}
