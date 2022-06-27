// Autor: Pedro Souza    https://github.com/Pedro-Souza-Mds 

package Controle;

import Modelo.UsuarioDAO;
import Modelo.Usuario;

public class ControleLogin {
    
    public boolean login(String nome, String senha) {
        boolean resp;
        Usuario u = new Usuario(nome, senha);
        UsuarioDAO dao = new UsuarioDAO();
        resp = dao.login(u);
        return resp;
    } 
}
