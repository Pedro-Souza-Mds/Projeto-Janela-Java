// Autor: Pedro Souza    https://github.com/Pedro-Souza-Mds 

package Modelo;

public class Produto {
    private int id;
    private String desc;
    private String vlu;
    private Fornecedor forn;
    
    public Produto() {
    }
    
    public Produto(int id, String desc, String vlu, Fornecedor forn) {
        this.id = id;
        this.desc = desc;
        this.vlu = vlu;
        this.forn = forn;
    }

    public Produto(String desc, String vlu, Fornecedor forn) {
        this.desc = desc;
        this.vlu = vlu;
        this.forn = forn;
    }
    
    public Fornecedor getFornecedor() {
        return forn;
    }

    public void setFornecedor(Fornecedor forn) {
        this.forn = forn;
    }
   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDescricao() {
        return desc;
    }

    public void setDescricao(String desc) {
        this.desc = desc;
    }

    public String getValorUnit() {
        return vlu;
    }

    public void setValorUnit(String vlu) {
        this.vlu = vlu;
    }

    
}
