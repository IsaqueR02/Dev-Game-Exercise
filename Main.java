public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Guerreiro e Mago
        Guerreiro guerreiro = new Guerreiro();
        Mago mago = new Mago();

        System.out.println("\n=== Atributos iniciais: ===\n");
        System.out.println(guerreiro);
        System.out.println(mago);
        System.out.println();

        System.out.println("\n=== Ataque: ===\n");
        guerreiro.atacar();
        mago.atacar();
        System.out.println();

        System.out.println("\n=== Skills: ===\n");
        guerreiro.usarEspada();
        mago.usarMagia();
        System.out.println();

        System.out.println("\n=== Simulação de Combate ===\n");
        guerreiro.receberDano(mago.getPoderMagico());
        mago.receberDano(guerreiro.getForca());
        System.out.println();

        System.out.println("\n=== Estado final dos personagens: ===\n");
        System.out.println("=== Estado Final dos Personagens ===");
        System.out.println(guerreiro);
        System.out.println(mago);
    }
}