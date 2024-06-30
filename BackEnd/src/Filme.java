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
        return "{ Titulo: " + getTitulo() + "\nStatus: " + getStatus() + "\nPrivacidade: " + isPrivacidade() + "\nNota: " + getNota() + "\nDuração: " + getDuracao() + "},\n";
    }
    
}
