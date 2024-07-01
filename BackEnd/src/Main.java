import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Nausicaa", "Assistido", 90, true, 160);
        EscreveArquivo gravador = new EscreveArquivo();
        int escolha = 0;
        Scanner leEscolha = new Scanner(System.in);

        do {
            System.out.println("=== Menu ===\n(1) Adicionar Filme\n(2) Salvar Filme no arquivo\n(3) Mostrar Filmes Salvos\n(4) Sair do Programa");
            System.out.print("Escolha uma opção: ");

            if (leEscolha.hasNextInt()) {
                escolha = leEscolha.nextInt();
                leEscolha.nextLine(); 

                switch (escolha) {
                    case 1:
                        filme.montarFilme();
                        break;
                    case 2:
                        gravador.gravaNoArq(filme);
                        break;
                    case 3:
                        System.out.println("Mostrando filmes salvos...");
                        break;
                    case 4:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        if (escolha != 0) {
                            System.out.println("Digite um valor válido!");
                        }
                        break;
                }
            } else {
                System.out.println("Digite um valor válido!");
                leEscolha.nextLine(); 
            }
        } while (escolha != 4 && leEscolha.hasNextLine()); 

        leEscolha.close(); 
    }
}
