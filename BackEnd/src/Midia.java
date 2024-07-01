import java.util.Scanner;

public class Midia {
    private String titulo, status;
    private int nota;
    private boolean privacidade;

    public Midia() {
    }

    public Midia(String titulo, String status, int nota, boolean privacidade) {
        this.titulo = titulo;
        this.status = status;
        this.nota = nota;
        this.privacidade = privacidade;
    }

    public Midia(String titulo, String status, int nota) {
        this.titulo = titulo;
        this.status = status;
        this.nota = nota;
        this.privacidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota >= 0 && nota <= 100) {
            this.nota = nota;
        } else {
            System.out.println("Valor Invalido! Insira um valor entre 0 e 100.");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatus() {
        Scanner leStatus = new Scanner(System.in);
        System.out.print("Escolha o status: \n(1) Assistido\n(2) Planejando Assistir\n(3) Abandonado\n>>> Escolha: ");
        int escolha = leStatus.nextInt();

        switch (escolha) {
            case 1:
                this.status = "Assistido";
                break;
            case 2:
                this.status = "Planejando Assistir";
                break;
            case 3:
                this.status = "Abandonado";
                break;
            default:
                System.out.println("Escolha inválida!");
                break;
        }
    }

    public boolean isPrivacidade() {
        return privacidade;
    }

    public void setPrivacidade() {
        Scanner lePriv = new Scanner(System.in);
        System.out.print("Deseja manter a avaliação pública?\n(1) Sim\n(2) Não \n>>> Escolha: ");
        int escolha = lePriv.nextInt();

        if (escolha == 1) {
            this.privacidade = true;
        } else if (escolha == 2) {
            this.privacidade = false;
        } else {
            System.out.println("Escolha inválida!");
        }
    }

    public void setPrivacidade(boolean privacidade) {
        this.privacidade = privacidade;
    }

    @Override
    public String toString() {
        return "{\nTitulo: " + getTitulo() + "\nStatus: " + getStatus() + "\nPrivacidade: " + isPrivacidade() + "\nNota: " + getNota() + "\n},\n";
    }
}
