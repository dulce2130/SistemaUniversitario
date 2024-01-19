public class Facultad extends Universidad{

    private int numFacultad;
    public Facultad(String clave, String nombre, String direccion, int telefono, int numFacultad){
        super(clave, nombre, direccion, telefono);
        this.numFacultad = numFacultad;
    }

    public void setNumFacultad(int numFacultad) {
        this.numFacultad = numFacultad;
    }

    public int getNumFacultad() {
        return numFacultad;
    }

    @Override
    public void ofrecerCarreras(){
        System.out.println("Campus: " + getNombre());
        System.out.println("Carreras: " +
                "\n1. Ingenieria Industrial" +
                "\n2. Ingenieria Bioquimica" +
                "\n3. Ingenieria Civil");
    }


}
