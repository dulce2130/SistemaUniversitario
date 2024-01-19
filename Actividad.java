public class Actividad {
    private String nombre;
    private String descripcion;

    public Actividad(String nombre, String descipcion){
        this.nombre = nombre;
        this.descripcion = descipcion;
    }

    public String mostrarDetalles(){
        return "Actividad: " + nombre  + "\nDescripcion: " + descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
