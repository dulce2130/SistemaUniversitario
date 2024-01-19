import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String clave;
    private String nombre;
    private String direccion;
    private int telefono;
    private  List<Actividad> actividades;

    public Universidad(String clave, String nombre, String direccion, int telefono){ //Metodo Constructor
        this.clave = clave;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.actividades = new ArrayList<>();
    }

    public void agregarActividad(String nombre, String descripcion){
        Actividad nuevaActividad = new Actividad(nombre, descripcion);
        actividades.add(nuevaActividad);
        System.out.println("Actividad agregada con exito");
    }

    public void mostrarActividades(){
        System.out.println("Actividades de la Universidad " + this.nombre + ": \n");
        for (Actividad actividad: actividades){
            System.out.println(actividad.mostrarDetalles());
        }
    }
    public String showDetalles(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nClave: " + clave);
        sb.append("\nNombre: " + nombre);
        sb.append("\nDireccion: " + direccion);
        sb.append("\nTelefono: " + telefono);

        return  sb.toString();
    }

    public void ofrecerCarreras(){
        System.out.println("Universidad: " + getNombre());
        System.out.println("Carreas:" +
                "\n1. Ingeniería Electrónica." +
                "\n2. Ingeniería Electromecánica." +
                "\n3. Ingeniería en Sistemas Computacional");
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }
}
