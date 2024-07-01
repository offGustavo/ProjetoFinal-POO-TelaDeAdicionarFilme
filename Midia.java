import java.util.Scanner;


public class Midia {
    String titulo, status;
    int nota;
    boolean privacidade;

    public Midia() {

    }

    public Midia(String titulo, String status, int nota, boolean privado) {
        setTitulo(titulo);
        setNota(nota);
        setStatus(status);
        setPrivacidade(privacidade);
    }

    public Midia(String titulo, String status, int nota){
        setTitulo(titulo);
        setNota(nota);
        setStatus(status);
        setPrivacidade();
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

    public void setNota(int nota2) {
        // this.nota = nota;
        do {
            if (nota2 >= 0 && nota2 <= 100) {
                this.nota = nota2;
            } else {
                System.out.println("Valor Invalido!");
            }
        } while (nota2 <= 0 && nota2 >= 100);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * 
     */
    public void setStatus(){ 

            Scanner leStatus = new Scanner(System.in);
            String status = null;
            int escolha;

            System.out.print("Escolha o status: \n(1) Assistido\n(2)Planejando Assistir\n(3)Abandonado\n>>>Escolha: ");

            escolha = leStatus.nextInt();

            // Tinha um try e catch aqui
               
               switch (escolha) {
                case 1:
                    status = "Assistido";
                    break;
                case 2:
                    status = "Planejando Assistir";
                    break;
                case 3:
                    status = "Abandonado";
                    break;
               
               }

               leStatus.close();
        this.status = status;
    }

    public boolean isPrivacidade() {
        return privacidade;
    }

    public void setPrivacidade() {
        Scanner lePriv  = new Scanner(System.in);
        boolean privacidade = true;
        int escolha;

            do {
            System.out.print("Deseja manter a avaliação pública?\n(1) Sim\n(2) Não \n>>> Escolha: ");
            escolha = lePriv.nextInt();

            privacidade = (escolha == 1) ? true : false;
 
            } while (escolha > 2 || escolha < 1);

            lePriv.close();
        this.privacidade = privacidade;
    }

    public void setPrivacidade(boolean privacidade){
        this.privacidade = privacidade;
    }

    @Override
    public String toString() {
        return "{\nTitulo: " + getTitulo() + "\nStatus: " + getStatus() + "\nPrivacidade: " + isPrivacidade() + "\nNota: " + getNota() + "\n},\n";
    }
}
