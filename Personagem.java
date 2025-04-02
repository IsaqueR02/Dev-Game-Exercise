public class Personagem {
    private String nome;
    private int vida;
    private int forca;

    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void atacar() {
        System.out.println(nome + " realizou um ataque básico!");
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }

    @Override
    public String toString() {
        return "Personagem{" +
               "nome='" + nome + '\'' +
               ", vida=" + vida +
               ", forca=" + forca +
               '}';
    }
}