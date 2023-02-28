public class Main {
    class Persona {
        int edad;
        int telefono;
        String nombre;
    }

    class Cliente extends Persona {
        double credito;
    }

    class Trabajador extends Persona {
        double salario;
    }

    public static void main(String[] args) {
        Main main = new Main();

        Cliente cliente = main.new Cliente();
        cliente.edad = 21;
        cliente.telefono = 123456789;
        cliente.nombre = "Daniel";
        cliente.credito = 1000.0;

        System.out.println("Cliente:");
        System.out.println("El nombre del cliente es: " + cliente.nombre);
        System.out.println("Su Edad es: " + cliente.edad);
        System.out.println("Su Teléfono es: " + cliente.telefono);
        System.out.println("Tiene un credito de: " + cliente.credito);

        Trabajador trabajador = main.new Trabajador();
        trabajador.edad = 22;
        trabajador.telefono = 111122223;
        trabajador.nombre = "Juan";
        trabajador.salario = 2000;

        System.out.println("Trabajador:");
        System.out.println("El nombre del Trabajador es: " + trabajador.nombre);
        System.out.println("Su Edades: " + trabajador.edad);
        System.out.println("Su Teléfono es: " + trabajador.telefono);
        System.out.println("Tiene un Salario de: " + trabajador.salario);
    }
}



