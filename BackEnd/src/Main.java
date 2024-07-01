import java.util.Scanner;
import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Nausicaa","Assistido", 90,true, 160);
        EscreveArquivo gravador = new EscreveArquivo();
        int escolha = 0;
        Scanner leEscolha = new Scanner(System.in);


        do {

            System.out.println("=== Menu ===\n(1) Adicionar Filme\n(2) Salvar Filme no arquivo\n(3) Mostrar Filmes Salvos");
            escolha = leEscolha.nextInt();

            if(escolha > 0 || escolha < 4){
                switch (escolha) {
                    case 1:
                        filme.montarFilme();
                        break;
                    case 2:
                        gravador.gravaNoArq(filme);
                        break;
                    case 3:

                    break;
                }

            }else{
                System.out.println("Digite um valor valido! ");
            }

        } while (escolha != 0);

         



    }
}
