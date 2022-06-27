// Autor: Pedro Souza    https://github.com/Pedro-Souza-Mds 

package Modelo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;

public class FornecedorDAO {

    public void insere(Fornecedor forn) throws Exception {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = con.prepareStatement("insert into Fornecedores (nome,fone) values (?,?)");
        stmt.setString(1, forn.getNome());
        stmt.setString(2, forn.getFone());

        stmt.executeUpdate();
        stmt.close();
        con.close();
    }

    public void exclui(Fornecedor forn) throws Exception {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = con.prepareStatement("delete from Fornecedores where id = ?");
        stmt.setInt(1, forn.getId());
        stmt.executeUpdate();
        stmt.close();
        con.close();
    }

    public void altera(Fornecedor forn) throws Exception {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = con.prepareStatement("update Fornecedores set nome = ?, fone = ? where id = ?");
        stmt.setString(1, forn.getNome());
        stmt.setString(2, forn.getFone());
        stmt.setInt(3, forn.getId());

        stmt.executeUpdate();
        stmt.close();
        con.close();
    }

    public ArrayList getAll() throws Exception {
        ArrayList lista = new ArrayList();
        Connection con = Conexao.getConexao();
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Fornecedores";
        st = con.createStatement();
        rs = st.executeQuery(sql);

        while (rs.next()) {
            int i = rs.getInt("id");
            String nome = rs.getString("nome");
            String fone = rs.getString("fone");
            Fornecedor forn = new Fornecedor(i, nome, fone);
            lista.add(forn);
        }
        rs.close();
        st.close();
        con.close();
        return lista;
    }

    public Fornecedor getPorId(int id) throws Exception {
        Fornecedor forn = null;
        Connection con = Conexao.getConexao();
        ResultSet rs = null;
        String sql = "SELECT * FROM Fornecedores where id = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if (rs.next()) {
            int i = rs.getInt("id");
            String nome = rs.getString("nome");
            String fone = rs.getString("fone");
            forn = new Fornecedor(i, nome, fone);
        }
        rs.close();
        stmt.close();
        con.close();
        return forn;
    }

}
