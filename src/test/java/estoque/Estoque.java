package src.test.java.estoque;

import java.util.UUID;

public class Estoque {

    protected UUID id;
    protected String nome;
    protected double preco;
    protected String categoria;
    protected double quantidade;
    protected boolean disponivel;
    protected String error;

    Estoque() {

        this.id = this.getNewID();

    }

    public UUID getNewID() {

        return UUID.randomUUID();

    }

    public boolean isDisponivel() {

        return this.disponivel;

    }

    public void setError(String error) {

        this.error = error;

    }

    public String getError() {

        return this.error;
    }

    public String getDisponibilidade() {

        if (!this.isDisponivel()) {

            return "" + this.imprimir();

        } else {

            return "";

        }

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getNome() {

        return this.nome;

    }

    public void setPreco(double preco) {

        this.preco = preco;

    }

    public double getPreco() {

        return this.preco;

    }

    public void setCategoria(String categoria) {

        this.categoria = categoria;

    }

    public String getCategoria() {

        return this.categoria;

    }

    public void setQuantidade(double quantidade) {

        this.quantidade = quantidade;

    }

    public double getQuantidade() {

        return this.quantidade;

    }

    public UUID getId() {

        return this.id;

    }

    public String imprimir() {

        return "Id: " + this.getId() + "\nNome: " + this.getNome() + "\nPreço: R$" + this.getPreco() + "\nCategoria: "
                + this.getCategoria() + "\nQuantidade: " + this.getQuantidade();

    }

}
