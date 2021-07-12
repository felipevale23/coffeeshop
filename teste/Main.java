package teste;

public class Main{

    public static void main(String[] args){

        int n = 10;

        Produto[] produto = new Produto[n];

        for (int i=0; i<n; i++) {

            produto[i] = new Produto();

        }

        produto[0].cadastrarProduto(produto[0].getId(), "Expresso", 2.50, "bebidas");
        System.out.println(produto[0].Imprimir());
        System.out.println("Erro:" + produto[0].getError());
        produto[0].setError("");

        produto[0].cadastrarProduto(produto[0].getId(), "Expresso", 2.50, "bebidas");
        System.out.println("Erro: " + produto[0].getError());
        produto[0].setError("");


    }
    
}
