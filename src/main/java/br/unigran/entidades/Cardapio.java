package br.unigran.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cardapio {
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

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome", length = 50)
    private String nome;
    @OneToMany
    @JoinColumn(name = "item_id")
    private List<Item> itens;

}
