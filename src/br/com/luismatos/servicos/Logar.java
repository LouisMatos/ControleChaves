package br.com.luismatos.servicos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.luismatos.dao.service.UsuarioService;
import br.com.luismatos.model.Usuario;
import br.com.luismatos.telas.principal.Principal;


public class Logar {

	private UsuarioService service = new UsuarioService();
	
	public void entrarNoSistema(JFrame panel, JTextField txtLogin, JPasswordField txtSenha){
		Usuario usuario = new Usuario();
		Usuario user = new Usuario();
		
		usuario.setEmail(txtLogin.getText());
		usuario.setSenha(txtSenha.getText());
		
	
		user = service.existeUsuario(usuario);
		if(user != null){
			panel.setVisible(false);
                        Principal principal = new Principal();
                        principal.setVisible(true);
                        
		}else{
			 JOptionPane.showMessageDialog(panel, "Usuário e/ou senha incorreto(s), tente novamente!", "Error", JOptionPane.ERROR_MESSAGE);
			 txtSenha.setText("");
		}
	}
}
