import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Filme filme = new Filme();
    EscreveArquivo gravador = new EscreveArquivo();
    int escolha = 0;
    Scanner leEscolha = new Scanner(System.in);

    do {

      System.out.println(
          "=== Menu ===\n(1) Adicionar Filme\n(2) Salvar Filme no arquivo\n(3) Mostrar Filmes Salvos\n(0) Fechar o Programa\n>>>Escolha:");
      escolha = leEscolha.nextInt();

      if (escolha > 0 || escolha < 4) {
        switch (escolha) {
          case 1:
            filme.montarFilme();
            break;
          case 2:
            gravador.gravaNoArq(filme);
            break;
          case 3:
            CarregaDados();
            break;
        }

      } else {
        System.out.println("Digite um valor valido! ");
      }

    } while (escolha != 0);

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
