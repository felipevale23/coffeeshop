package teste;

import java.util.UUID;

public class Produto extends Estoque{

    Produto(){

        super();
        this.id = super.id;
        this.disponivel = true;
        super.disponivel = this.disponivel;
  
    }

    public void cadastrarProduto(UUID id, String nome, double preco, String categoria){
        
        if(id == this.id && super.isDisponivel()){

            this.nome = nome;
            super.nome = this.nome;
            this.preco = preco;
            super.preco = this.preco;
            this.categoria = categoria;
            super.categoria = this.categoria;
            
            this.disponivel = false;
            super.disponivel = this.disponivel;

        } else {

            super.setError("Não é possível cadastrar o produto de iD: "+ id);

        }


    }

    public UUID getId(){

        return this.id;

    }

    public String Imprimir(){

        return "Id: "+this.getId()+"\nNome: "+getNome()+"\nPreço: R$"+getPreco()+"\nCategoria: "+getCategoria()+"\nQuantidade: "+getQuantidade();

    }


}