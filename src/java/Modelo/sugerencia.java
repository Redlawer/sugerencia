package Modelo;

public class sugerencia {
    public int idsugerencia;
    public int idpersona;
    public int idarea;
    public int idrol;
    public String sugerencia;
    public String estado;

    public sugerencia(int idsugerencia, int idpersona, int idarea, int idrol, String sugerencia, String estado) {
        this.idsugerencia = idsugerencia;
        this.idpersona = idpersona;
        this.idarea = idarea;
        this.idrol = idrol;
        this.sugerencia = sugerencia;
        this.estado = estado;
    }

    public int getIdsugerencia() {
        return idsugerencia;
    }

    public void setIdsugerencia(int idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
