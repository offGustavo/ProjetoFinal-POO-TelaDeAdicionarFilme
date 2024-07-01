import java.io.*;
// import java.nio.*;
// import java.nio.file.*;

public class EscreveArquivo {

    public void gravaNoArq(Filme info) {

        try {

            FileWriter fw = new FileWriter("BancoDeDados.txt", true);
            fw.write(info.toString());

            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// try {
// // Criação do arquivo
// InfoFilme filme = new InfoFilme();
// Scanner leia = new Scanner(System.in);

// System.out.print("Titulo");
// filme.setTitulo(leia.nextLine());

// System.out.print("Status");
// filme.setStatus(leia.nextLine());

// System.out.print("Nota");
// filme.setNota(leia.nextByte());

// System.out.print("Privacidade");
// filme.setPrivacidade(leia.nextBoolean());

// // FileWriter arquivo = new FileWriter(filme.getTitulo() + ".txt");
// FileWriter arquivo = new FileWriter("BancoDeDados.txt");
// PrintWriter gravador = new PrintWriter(arquivo);
// // Escrevendo os dados no arquivo
// gravador.println(filme.toString());

// // Fechando o arquivo
// gravador.close();
// System.out.println("Dados gravados com sucesso!");
// } catch (IOException e) {
// System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
// }  atch (IOException e) {
        //     System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
        // }