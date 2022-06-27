// Autor: Pedro Souza    https://github.com/Pedro-Souza-Mds 

package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    public boolean login(Usuario u) {
        boolean resp = false;
        try {
            Connection con = Conexao.getConexao();
            ResultSet rs = null;
            String sql = "SELECT * FROM usuarios where nome = ? and senha = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSenha());
            rs = stmt.executeQuery();

            if (rs.next()) {
                resp = true;
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
        }

        return resp;

    }
}
