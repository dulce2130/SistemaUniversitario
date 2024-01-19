import java.util.Scanner;

public class Menu {
    private SistemaUniversidad sistema;
    private Scanner scanner;

    public Menu(SistemaUniversidad sistema){
        this.sistema = sistema;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("----- Menú ------" +
                    "\n1. Ver Universidades." +
                    "\n2. Registrar Universidad." +
                    "\n3. Ver Actividades de la Universidad." +
                    "\n4. Ver Facultad." +
                    "\n5. Registrar Facultad." +
                    "\n6. Ver mis actividades." +
                    "\n7. Salir." +
                    "\n\n Elige una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea después de la entrada de números

            switch (opcion) {
                case 1:
                    verUniversidades();
                    break;
                case 2:
                    registrarUniversidad();
                    break;
                case 3:
                    verActividades();
                    break;
                case 4:
                    verFacultades();
                    break;
                case 5:
                    registrarFacultad();
                    break;
                case 6:
                    verMisActividades();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número entre el 1 y 7.");
            }
            System.out.println("-------------------------------------------------------------");
            System.out.print("1. Regresar al menú principal\n2. Salir\nSeleccione una opción: ");
            int opcionMenu = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea después de la entrada de números

            if (opcionMenu == 2) {
                System.out.println("Saliendo del programa...");
                System.exit(0);
            }
        } while (opcion != 7);
    }


        private void verUniversidades(){
            System.out.println("----------------------------");
            sistema.mostrarUniversidades();
        }
        private void registrarUniversidad() {
            System.out.println("----------Registro de Universidad-----------");
            System.out.print("Ingrese la clave: ");
            String clave = scanner.nextLine();
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la direccion: ");
            String direccion = scanner.nextLine();
            System.out.print("Ingrese el telefono: ");
            int telefono = scanner.nextInt();
            scanner.nextLine();

            sistema.registrarUniversidad(clave, nombre, direccion, telefono);

            System.out.print("¿Desea agregar actividades a la universidad recién registrada? (Sí/No): ");
            String respuesta = scanner.nextLine().toLowerCase();
            if (respuesta.equals("si")) {
                agregarActividadesAlaUniversidad(clave);
            }
        }

    private void agregarActividadesAlaUniversidad(String claveUni) {
        Universidad universidad = null;

        for (Universidad u : sistema.getUniversidadCampus()) {
            if (u.getClave().equals(claveUni)) {
                universidad = u;
                break;
            }
        }


        if (universidad != null) {
            System.out.println("|-----------Agregar Actividad---------------|");
            System.out.print("Nombre de la actividad: ");
            String nombreActividad = scanner.nextLine();
            System.out.print("Descripción de la actividad: ");
            String descripcionActividad = scanner.nextLine();

            universidad.agregarActividad(nombreActividad, descripcionActividad);
            System.out.println("Actividad agregada la universidad con clave  " + claveUni + " con éxito.");
        } else {
            System.out.println("Hotel no encontrado.");
        }

    }

    private void verActividades(){
        System.out.println("----------- Actividades de Universidades -----------");

        for (Universidad universidad : sistema.getUniversidadCampus()) {
            System.out.println("Universidad: " + universidad.getNombre() + "\nClave: " + universidad.getClave());

            if (!universidad.getActividades().isEmpty()) {
                for (Actividad actividad : universidad.getActividades()) {
                    System.out.println("Actividad: " + actividad.getNombre() + "\nDescripción: " + actividad.getDescripcion());
                }
            } else {
                // Si el hotel no tiene actividades, imprimir un mensaje indicando esto
                System.out.println("Esta Universidad no cuenta con actividades.");
            }
        }
    }
    public void verFacultades(){
        System.out.println("-------------");
        sistema.verFacultades();
    }

    private void registrarFacultad(){
        System.out.println("----------Registro de Facultad-----------");
        System.out.print("Ingrese la clave: ");
        String clave = scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la direccion: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el telefono: ");
        int telefono = scanner.nextInt();
        System.out.print("Ingrese el numero de Facultad: ");
        int numFacultad = scanner.nextInt();
        scanner.nextLine();

        sistema.registrarFacultad(clave, nombre, direccion, telefono, numFacultad);

        System.out.print("¿Desea agregar actividades a la facultad recién registrada? (Sí/No): ");
        String respuesta = scanner.nextLine().toLowerCase();
        if (respuesta.equals("si")) {
            agregarActividadesAlaUniversidad(clave);
        }
    }

    private void verMisActividades(){
        System.out.println("----------- Mis Actividades -----------");
        for (Universidad universidad : sistema.getUniversidadCampus()) {
            System.out.println("Universidad: " + universidad.getNombre());
            if (!universidad.getActividades().isEmpty()) {
                for (Actividad actividad : universidad.getActividades()) {
                    System.out.println("Actividad: " + actividad.getNombre() + "\nDescripción: " + actividad.getDescripcion());
                }
            } else {
                System.out.println("Esta Universidad no cuenta con actividades.");
            }
        }
    }
}
