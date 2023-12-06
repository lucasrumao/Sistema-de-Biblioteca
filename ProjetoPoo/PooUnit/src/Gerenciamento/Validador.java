package Gerenciamento;

import java.util.List;

import Entidades.Livro;
import Entidades.Usuario;

public class Validador {
	
	public boolean validarUsuario(List<Usuario> usuarios, int id){
		for(int i=0; i<=usuarios.size(); i++) {
			if(usuarios.get(i).getId() == id) {
				return true;
			}return false;
		}return false;
	}
	
	public boolean validarLivro(List<Livro> livros, int id){
		for(int i=0; i<=livros.size(); i++) {
			if(livros.get(i).getId() == id) {
				return true;
			}return false;
		}return false;
	}
}
