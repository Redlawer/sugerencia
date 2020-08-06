package Modelo;

public class rol {
    public int idrol;
    public String nombre;
    public String estado;

    public rol(int idrol, String nombre, String estado) {
        this.idrol = idrol;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
