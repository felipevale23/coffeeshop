<<<<<<< HEAD:teste/Produto.java
package teste;
=======
package teste.estoque;
>>>>>>> 08bb840fbaccb48907876a80a0afb7d33cb92bce:teste/estoque/Produto.java

import java.util.UUID;

public class Produto extends Estoque {

    Produto() {

        super();
        this.id = super.id;
        this.disponivel = true;
        super.disponivel = this.disponivel;

    }

    public void cadastrarProduto(UUID id, String nome, double preco, String categoria) {

        if (id == this.id && super.isDisponivel()) {

            this.nome = nome;
            super.nome = this.nome;
            this.preco = preco;
            super.preco = this.preco;
            this.categoria = categoria;
            super.categoria = this.categoria;

            this.disponivel = false;
            super.disponivel = this.disponivel;

        } else {

            super.setError("Não é possível cadastrar o produto de Id: " + id);

        }

    }

    @Override
    public UUID getId() {

        return this.id;

    }

    @Override
    public String imprimir() {

        return "Id: " + this.getId() + "\nNome: " + this.getNome() + "\nPreço: R$" + this.getPreco() + "\nCategoria: "
                + this.getCategoria() + "\nQuantidade: " + this.getQuantidade();

    }

}