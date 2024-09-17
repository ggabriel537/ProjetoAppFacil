package br.unigran.entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "itens", length = 99999)
    private String itens;
    @OneToMany
    @JoinColumn(name = "itens_id")
    private List<Item> itens_ped;

    @Column(name = "data_ped")
    @Temporal(TemporalType.DATE)
    private Date data_ped;
    private int mesa;

    public List<Item> getItens_ped() {
        return itens_ped;
    }

    public void setItens_ped(List<Item> itens_ped) {
        this.itens_ped = itens_ped;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public Date getData_ped() {
        return data_ped;
    }

    public void setData_ped(Date data_ped) {
        this.data_ped = data_ped;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    @Column(name = "valortotal")
    private double valortotal;
}
