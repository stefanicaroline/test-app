package org.example;

public class InverterString {

    public static void main(String[] args) {
        // Solicitar ao usuário que insira uma string usando JOptionPane
        String input = "123456";
        System.out.println("************* START *************");
        System.out.println("A string não invertida é: " + input);
        // Chamar a função para inverter a string e armazenar o resultado
        String invertedString = inverterString(input);
        // Exibir a string invertida usando JOptionPane
        System.out.println("A string invertida é: " + invertedString);
        System.out.println("************** END **************");
    }

    // Função para inverter a string
    public static String inverterString(String str) {
        // Inicializar uma string vazia para armazenar o resultado
        String inverted = "";
        // Percorrer a string de trás para frente e adicionar cada caractere à string invertida
        for (int i = str.length() - 1; i >= 0; i--) {
            inverted += str.charAt(i);
        }
        // Retornar a string invertida
        return inverted;
    }
}