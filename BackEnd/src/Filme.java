import java.util.Scanner;

public class Filme extends Midia {
    private int duracao;

    public Filme() {
    }

    public Filme(String titulo, String status, int nota, int duracao) {
        super(titulo, status, nota);
        this.duracao = duracao;
        setPrivacidade();
    }

    public Filme(String titulo, String status, int nota, boolean privacidade, int duracao) {
        super(titulo, status, nota, privacidade);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "{\nTitulo: " + getTitulo() + "\nStatus: " + getStatus() + "\nPrivacidade: " + isPrivacidade() + "\nNota: " + getNota() + "\nDuração: " + getDuracao() + "\n},\n";
    }

    public void montarFilme() {
        Scanner leInfoFilme = new Scanner(System.in);

        try {
            System.out.println("== Adicionar filme ==");
            System.out.print("Digite o título do filme: ");
            setTitulo(leInfoFilme.nextLine());

            boolean assistido = setStatus();

            if(!assistido){
                System.out.print("Deseja manter a avaliação pública?\n(1) Sim\n(2) Não \n>>> Escolha: ");
                setPrivacidade(leInfoFilme.nextInt() == 1);

                System.out.print("Digite a nota do filme (insira um valor de 0 a 100): ");
                setNota(leInfoFilme.nextInt());
            }

            System.out.print("Digite a duração do filme (Min): ");
            setDuracao(leInfoFilme.nextInt());
        } catch (Exception e) {
            System.out.println("Erro na entrada de dados: " + e.getMessage());
        }
        // } finally {
        //     leInfoFilme.close();
        // }
    }
}
