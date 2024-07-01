// import java.io.*;
// import java.nio.*;
// import java.nio.file.*;

// class LeArquivo {

//     // Do Cris
//    	public String[] lerDoArquivo () {
// 		String linhas[] = new String[1000];
// 		int    controle = 0; 
// 		try {
// 			FileReader     fr = new FileReader     ("BancoDeDados.txt");
// 			BufferedReader br = new BufferedReader ( fr );
// 			while ( br.ready () ) {
// 				linhas[controle++] = br.readLine();
// 			}
// 			br.close();
// 			fr.close();
// 		} catch ( IOException ex ) {
// 			System.out.println("\n\tErro ao ler o arquivo!");
// 		}
// 		return linhas;
// 	}


//     	public static void carregarDados () {
// 		// Carrega Dados de Condidatos
// 		String linhasC[] = lerDoArquivo ( arqC );
// 		for ( int i = 0 ; i < linhasC.length ; i++ ) {
// 			if ( linhasC[i] != null ) {
// 				if ( qtdeCandidatos < maxCandidatos ) {
// 					String campos[] = linhasC[i].split ( separador );
// 					if ( campos[0].equals("Empregado") ) {
// 						candidatos[qtdeCandidatos] = new Empregado();
// 						candidatos[qtdeCandidatos].setNome  ( campos[1] );
// 						candidatos[qtdeCandidatos].setIdade ( Integer.parseInt ( campos[2] ) );
// 						( (Empregado) candidatos[qtdeCandidatos] ).setEmpresa ( campos[3] );
// 					} else {
// 						candidatos[qtdeCandidatos] = new Desempregado();
// 						candidatos[qtdeCandidatos].setNome  ( campos[1] );
// 						candidatos[qtdeCandidatos].setIdade ( Integer.parseInt ( campos[2] ) );
// 						( (Desempregado) candidatos[qtdeCandidatos] ).setMeses ( Integer.parseInt ( campos[3] ) );
// 					}
// 					qtdeCandidatos++;
// 				} else {
// 					System.out.print("\n\tErro! Quantidade maxima de cadastros atingida...\n");
// 				}
// 			}
// 		}
		
// }
// }


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorBancoDeDados {
    public static void main(String[] args) {
        String arquivo = "BancoDeDados.txt"; // Nome do arquivo

        try {
            List<String> informacoes = lerArquivo(arquivo);
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