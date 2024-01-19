//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SistemaUniversidad sistema = new SistemaUniversidad();
        Menu menu = new Menu(sistema);

        menu.mostrarMenu();
    }
}