import java.util.Scanner;
import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Nausicaa","Assistido", 90,true, 160);
        EscreveArquivo gravador = new EscreveArquivo();
        gravador.gravaNoArq(filme);


         



    }
}
