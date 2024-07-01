import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
                        CarregaDados();
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


  public static void CarregaDados() {

    try {
      List<String> informacoes = lerArquivo("BancoDeDados.txt");
      String[] arrayInformacoes = informacoes.toArray(new String[0]);

      // Exibindo as informações separadas em um array
      for (String info : arrayInformacoes) {
        System.out.println(info);
      }
    } catch (IOException e) {
      System.err.println("Erro ao ler o arquivo: " + e.getMessage());
    }
  }

  public static List<String> lerArquivo(String nomeArquivo) throws IOException {
    List<String> linhas = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
      String linha;
      while ((linha = br.readLine()) != null) {
        linhas.add(linha);
      }
    }
    return linhas;
  }
}

