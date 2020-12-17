package Modelo;

public class Usuario {

    private String usuario;
    private String contra;

    public Usuario() {
    }

    public Usuario(String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getUsuario() {

        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contra;
    }

    public void setContrasena(String contra) {
        this.contra = contra;
    }



}
