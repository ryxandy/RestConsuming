package com.ryxandy.restconsuming.pokeApiResourcers;


public class Pokemon {
    private int id;
    private String nome;
    private String tipo;
    private String fraqueza;
    private boolean lendario;

    public Pokemon(int id, String nome, String tipo, String fraqueza, boolean lendario) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.fraqueza = fraqueza;
        this.lendario = lendario;
    }

    public Pokemon() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    public boolean isLendario() {
        return lendario;
    }

    public void setLendario(boolean lendario) {
        this.lendario = lendario;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fraqueza='" + fraqueza + '\'' +
                ", lendario=" + lendario +
                '}';
    }
}
