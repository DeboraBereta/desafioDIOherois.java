import java.util.Random;
import java.util.Scanner;

public class desafioDIOHerois {

    // Função que calcula o nível com base nas vitórias e derrotas
    public static String calcularRank(int vitorias, int derrotas) {
        int saldoVitoriasDerrotas = vitorias - derrotas;
        String nivel;

        // Lógica para determinar o nível com base nas vitórias
        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias >= 11 && vitorias <= 20) {
            nivel = "Bronze"; 
        } else if (vitorias >= 21 && vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        // Exibe no console a mensagem com o saldo e o nível
        System.out.println("O Herói tem saldo de " + saldoVitoriasDerrotas + " está no nível de " + nivel);

        // Retorna a mensagem
        return "O Herói tem saldo de " + saldoVitoriasDerrotas + " está no nível de " + nivel;
    }

    // Método principal para executar o programa
    public static void main(String[] args) {
        // Cria objetos para gerar números aleatórios e ler do teclado
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Gera dados aleatórios para as vitórias e derrotas
        int quantidadeVitorias = random.nextInt(101);  // Gera um número entre 0 e 100
        int quantidadeDerrotas = random.nextInt(101);  // Gera um número entre 0 e 100

        // Exibe no console as quantidades geradas aleatoriamente
        System.out.println("Quantidade de vitórias: " + quantidadeVitorias);
        System.out.println("Quantidade de derrotas: " + quantidadeDerrotas);

        // Chama a função para calcular o nível com base nas quantidades geradas
        calcularRank(quantidadeVitorias, quantidadeDerrotas);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
