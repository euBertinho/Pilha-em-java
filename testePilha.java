public class testePilha {

    public static void main(String[] args) {
        int[] tamanhos = {10, 100, 1000, 10000, 100000, 1000000}; // Quantidade
        long inicio, fim;

        System.out.println("Estratégia de duplicação da capacidade:");

        for (int tamanho : tamanhos) {
            PilhaArray pp = new PilhaArray(1, 0); // duplicação
            inicio = System.currentTimeMillis();

            for (int f = 0; f < tamanho; f++) {
                pp.push(f);
            }

            fim = System.currentTimeMillis();
            System.out.println("Tempo para inserir " + tamanho + " elementos: " + (fim - inicio) + " ms");
        }

        System.out.println("\nEstratégia de crescimento constante da capacidade:");

        for (int tamanho : tamanhos) {
            PilhaArray pp = new PilhaArray(1, 1000);
            inicio = System.currentTimeMillis();

            for (int f = 0; f < tamanho; f++) {
                pp.push(f);
            }

            fim = System.currentTimeMillis();
            System.out.println("Tempo para inserir " + tamanho + " elementos: " + (fim - inicio) + " ms");
        }
	}
}
   
