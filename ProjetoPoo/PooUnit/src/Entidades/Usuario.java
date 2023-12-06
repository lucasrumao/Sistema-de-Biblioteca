package Entidades;

public class Usuario extends Pessoa {

    private boolean bloqueado;

    public Usuario(int id, String nome, String email, String endereco, String telefone, boolean bloqueado) {
        super(id, nome, email, endereco, telefone);
        this.bloqueado = bloqueado;
    }
    public boolean estaBloqueado() {
        return bloqueado;
    }
    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
    public void bloquearUsuario() {
            this.bloqueado = true;
        }
    public void desbloquearUsuario() {
            this.bloqueado = false;
    }

    
    
}
