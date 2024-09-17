package br.unigran.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Column(name = "valor")
    private double valor;

    @Column(name = "quantidade")
    private int quantidade;
}
