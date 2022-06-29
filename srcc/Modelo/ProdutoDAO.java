// Autor: Pedro Souza    https://github.com/Pedro-Souza-Mds 

package Modelo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProdutoDAO {

    public void insere(Produto pro) throws Exception {
        try {
            
       Connection con = Conexao.getConexao();
       PreparedStatement stmt = con.prepareStatement("insert into Produtos (descricao,valor_Produto, idFornecedor)values (?,?,?)");
        stmt.setString(1, pro.getDescricao());
        stmt.setString(2, pro.getValorUnit());
        stmt.setInt(3, pro.getFornecedor().getId());
        ResultSet rs = stmt.executeQuery();

        stmt.executeUpdate();
        stmt.close();
        con.close();
         } catch (SQLException ex) { System.err.println(ex.getMessage() + "Erro de Inserir produtodao ");
         Logger.getLogger(classeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void exclui(Produto pro) throws Exception {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = con.prepareStatement("DELETE from Produtos WHERE id = ?;");
        stmt.setInt(1, pro.getId());
        stmt.executeUpdate();
        stmt.close();
        con.close();
    }

    public void altera(Produto pro) throws Exception {
        try {
            
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = con.prepareStatement("UPDATE Produtos SET descricao = ?, valor_produto = ?, idFornecedor = ?  WHERE id = ?;");
        stmt.setString(1, pro.getDescricao());
        stmt.setString(2, pro.getValorUnit());
        stmt.setInt(3, pro.getFornecedor().getId());
        stmt.setInt(4, pro.getId());

        stmt.executeUpdate();
        stmt.close();
        con.close();
        }
         catch (SQLException ex) { System.err.println(ex.getMessage() + "Erro de Alterar produtodao ");
         Logger.getLogger(classeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList getAll() throws Exception {
        ArrayList lista = new ArrayList();
        Connection con = Conexao.getConexao();
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Produtos ";
        st = con.createStatement();
        rs = st.executeQuery(sql);

        while (rs.next()) {
            int id = rs.getInt("id");
            String desc = rs.getString("descricao");
            String vlu = rs.getString("valor_produto");
            int idForn = rs.getInt("idFornecedor");
            FornecedorDAO fdao = new FornecedorDAO();
            Fornecedor forn = fdao.getPorId(idForn);
            Produto pro = new Produto(id, desc, vlu, forn);
            lista.add(pro);
        }
        rs.close();
        st.close();
        con.close();
        return lista;
    }
    
    public ArrayList getPorFornecedor(int fkForn) throws Exception {
        ArrayList lista = new ArrayList();
        Connection pro = Conexao.getConexao();
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Produtos where idFornecedor=" + fkForn;
        st = pro.createStatement();
        rs = st.executeQuery(sql);

        while (rs.next()) {
            int i = rs.getInt("id");
            String desc = rs.getString("descricao");
            String vlu = rs.getString("valor_produto");
            int idForn = rs.getInt("idFornecedor");
            FornecedorDAO fdao = new FornecedorDAO();
            Fornecedor forn = fdao.getPorId(idForn);
            Produto prod = new Produto(i, desc, vlu, forn);
            lista.add(prod);
        }
        rs.close();
        st.close();
        pro.close();
        return lista;
    }

    public Produto getPorId(int id) throws Exception {
        Produto pro = null;
        Connection con = Conexao.getConexao();
        ResultSet rs = null;
        String sql = "SELECT * FROM Produtos where id = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if (rs.next()) {
            int i = rs.getInt("id");
            String desc = rs.getString("Descricao");
            String vlu = rs.getString("valor_produto");
            int idForn = rs.getInt("idFornecedor");
            FornecedorDAO fdao = new FornecedorDAO();
            Fornecedor forn = fdao.getPorId(idForn);
            pro = new Produto(i, desc, vlu, forn);
        }
        rs.close();
        stmt.close();
        con.close();
        return pro;
    }

    private static class classeUI {

        public classeUI() {
        }
    }

}