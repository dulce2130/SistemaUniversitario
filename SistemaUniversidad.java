import java.util.ArrayList;
import java.util.List;

public class SistemaUniversidad {
    List<Universidad> universidadCampus;

    public SistemaUniversidad(){ //Constructor
        this.universidadCampus = new ArrayList<>();
    }

    public void registrarUniversidad(String clave, String nombre, String direccion, int telefono){
        Universidad nuevaUniversidad = new Universidad(clave, nombre, direccion, telefono);
        universidadCampus.add(nuevaUniversidad);
        System.out.println("Nueva Universidad registrada con exito");
    }

    public void mostrarUniversidades(){
        System.out.println("Universidades: ");
        for (Universidad universidad: universidadCampus){
            System.out.println(universidad.showDetalles());
        }
    }
    public void registrarFacultad(String clave, String nombre, String direccion, int telefono, int numFacultad){
        Facultad nuevaFacultad= new Facultad(clave, nombre, direccion, telefono, numFacultad);
        universidadCampus.add(nuevaFacultad);
        System.out.println("Nueva Facultad registrada con exito");
    }

    public void verFacultades(){
        System.out.println("Facultad: ");
        for (Universidad universidad: universidadCampus){
            if (universidad instanceof Facultad){
                Facultad facultad = (Facultad) universidad;
                System.out.println("Facultad: " + facultad.showDetalles());
                facultad.ofrecerCarreras();
            }
        }
    }

    public List<Universidad> getUniversidadCampus() {
        return universidadCampus;
    }

    public void setUniversidadCampus(List<Universidad> universidadCampus) {
        this.universidadCampus = universidadCampus;
    }
}
