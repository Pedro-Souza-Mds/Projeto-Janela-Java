// Autor: Pedro Souza    https://github.com/Pedro-Souza-Mds 

package Controle;

import java.util.ArrayList;
import Modelo.Fornecedor;
import Modelo.FornecedorDAO;
import Modelo.Produto;
import Modelo.ProdutoDAO;

public class ControleProduto {

    public void inserir(String desc, String vlu, int ifo) {
        try {
            FornecedorDAO fdao = new FornecedorDAO();
            Fornecedor f = fdao.getPorId(ifo);
            ProdutoDAO dao = new ProdutoDAO();
            Produto pro = new Produto(desc, vlu, f);
            dao.insere(pro);
        } catch (Exception e) { System.err.println("Erro de Inserir Controle prod " + e.getMessage());
        }
    }

    public void alterar(int i, String desc, String vlu, int ifo) {
        try {
            FornecedorDAO fdao = new FornecedorDAO();
            Fornecedor f = fdao.getPorId(ifo);
            Produto pro = new Produto(i, desc, vlu, f);
            ProdutoDAO dao = new ProdutoDAO();
            dao.altera(pro);
        } catch (Exception e) {
        }
    }

    public void excluir(int i) {
        try {
            Produto pro = new Produto();
            pro.setId(i);
            ProdutoDAO dao = new ProdutoDAO();
            dao.exclui(pro);
        } catch (Exception e) {
        }
    }

    public Produto getPorId(int i) {
        Produto pro = null;
        try {
            ProdutoDAO dao = new ProdutoDAO();
            pro = dao.getPorId(i);
            return pro;
        } catch (Exception e) {
        }
        return pro;
    }

    public ArrayList getAll() {
        ArrayList lista = new ArrayList();
        try {
            ProdutoDAO dao = new ProdutoDAO();
            lista = dao.getAll();
        } catch (Exception e) {
        }
        return lista;
    }
    
    public ArrayList getPorFornecedor(int idFor) {
        ArrayList lista = new ArrayList();
        try {
            ProdutoDAO dao = new ProdutoDAO();
            lista = dao.getPorFornecedor(idFor);
        } catch (Exception e) {
        }
        return lista;
    }
}
