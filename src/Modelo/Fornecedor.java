// Autor: Pedro Souza    https://github.com/Pedro-Souza-Mds 

package Modelo;

public class Fornecedor {
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String nome;
    private String fone;
    
    public Fornecedor(int id, String nome, String fone) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
    }
    
    public Fornecedor(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
}
