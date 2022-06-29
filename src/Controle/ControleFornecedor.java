// Autor: Pedro Souza    https://github.com/Pedro-Souza-Mds 

package Controle;

import Modelo.FornecedorDAO;
import Modelo.Fornecedor;
import java.util.ArrayList;

public class ControleFornecedor {

    public void inserir(String nome, String fone) {
        try {
            Fornecedor f = new Fornecedor(nome, fone);
            FornecedorDAO dao = new FornecedorDAO();
            dao.insere(f);
        } catch (Exception e) {
        }
    }

    public void alterar(int i, String nome, String fone) {
        try {
            Fornecedor f = new Fornecedor(i, nome, fone);
            FornecedorDAO dao = new FornecedorDAO();
            dao.altera(f);
        } catch (Exception e) {
        }
    }

    public void excluir(int i, String nome, String fone) {
        try {
            Fornecedor f = new Fornecedor(i, nome, fone);
            FornecedorDAO dao = new FornecedorDAO();
            dao.exclui(f);
        } catch (Exception e) {
        }
    }

    public Fornecedor getPorId(int i) {
        Fornecedor f = null;
        try {
            FornecedorDAO dao = new FornecedorDAO();
            f = dao.getPorId(i);
            return f;
        } catch (Exception e) {
        }
        return f;
    }

    public ArrayList getAll() {
        ArrayList lista = new ArrayList();
        try {
            FornecedorDAO dao = new FornecedorDAO();
            lista = dao.getAll();
        } catch (Exception e) {
        }
        return lista;
    }
}
