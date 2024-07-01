import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivo {

    public void gravaNoArq(Filme info) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("BancoDeDados.txt", true);
            fw.write(info.toString());
            fw.write("\n");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        } //finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.err.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        // }
    }
}
