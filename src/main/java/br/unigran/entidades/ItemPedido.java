package br.unigran.entidades;

import java.util.List;

public class ItemPedido {
    private Item item;
    private List<Adicional> adicionais;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Adicional> getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(List<Adicional> adicionais) {
        this.adicionais = adicionais;
    }

    @Override
    public String toString()
    {
        String retorno = this.item.getNome()+"\n";
        for(Adicional a : adicionais)
        {
            retorno += "  - "+a.getNome();
        }
        return retorno;
    }
}
