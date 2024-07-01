import java.util.Scanner;
public class Filme extends Midia{
    int duracao;

    public Filme(){

    }

    public Filme(String titulo, String status, int nota, int duracao){
        super(titulo, status, nota);
        setDuracao(duracao);
        setPrivacidade();
    }

    public Filme(String titulo, String status, int nota, boolean privado, int duracao){
        super(titulo, status, nota, privado);
        setDuracao(duracao);
    }
    
    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "{\nTitulo: " + getTitulo() + "\nStatus: " + getStatus() + "\nPrivacidade: " + isPrivacidade() + "\nNota: " + getNota() + "\nDuracao: " + getDuracao() + "\n},\n";
    }
    
    public void montarFilme(){

        Scanner leInfoFilme = new Scanner(System.in);

        System.out.println("== Adcionar filme ==");
        System.out.print("Digite o titulo do filme: ");
        setTitulo(leInfoFilme.nextLine());

        setStatus();

        System.out.print("Deseja manter a avaliação pública?\n(1) Sim\n(2) Não \n>>> Escolha: ");
        setPrivacidade((leInfoFilme.nextInt() == 1) ? true : false);

        System.out.print("Digite a nota do filme(insira um valor de 0 a 100): ");
        setNota(leInfoFilme.nextInt());

        System.out.print("Digite a duração do filme(Min): ");
        setDuracao(leInfoFilme.nextInt());
    }
}
