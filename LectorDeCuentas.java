import java.util.Scanner;

public class LectorDeCuentas {

    private Scanner scanner;

    public LectorDeCuentas() {
        scanner = new Scanner(System.in);
    }

    public void cargarCuentas(Banco banco) {
        while (true) {
            System.out.println("\n--- CARGA DE NUEVA CUENTA ---");

            int id = leerEnteroConConfirmacion("ID del cliente (0 para salir): ");
            if (id == 0) {
                System.out.println("Carga finalizada.");
                break;
            }

            String nombre = leerTextoConConfirmacion("Nombre del cliente: ");
            float balance = leerFloatConConfirmacion("Balance inicial: ");
            String email = leerTextoConConfirmacion("Correo electrónico: ");

            System.out.println("Seleccione el tipo de cuenta:");
            System.out.println("1. Cuenta Común");
            System.out.println("2. Cuenta Corriente");
            System.out.println("3. Cuenta Ahorro");

            int tipo = leerOpcionConConfirmacion("Ingrese su opción (1-3): ", 1, 3);

            CuentaAbstracta cuenta;

            switch (tipo) {
                case 1:
                    cuenta = new CuentaBancaria(nombre, id, balance, email);
                    break;
                case 2:
                    cuenta = new CuentaCorriente(nombre, id, balance, email);
                    break;
                case 3:
                    cuenta = new CuentaAhorro(nombre, id, balance, email);
                    break;
                default:
                    System.out.println("Tipo no válido. Se saltea esta cuenta.");
                    continue;
            }

            banco.agregarCuenta(cuenta);
            System.out.println("✅ Cuenta creada y agregada exitosamente.");
        }
    }

    private int leerEnteroConConfirmacion(String mensaje) {
        int valor;
        while (true) {
            System.out.print(mensaje);
            valor = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer
            System.out.println("Ingresado: " + valor);
            if (confirmar()) return valor;
        }
    }

    private float leerFloatConConfirmacion(String mensaje) {
        float valor;
        while (true) {
            System.out.print(mensaje);
            valor = scanner.nextFloat();
            scanner.nextLine(); // limpiar buffer
            System.out.println("Ingresado: " + valor);
            if (confirmar()) return valor;
        }
    }

    private String leerTextoConConfirmacion(String mensaje) {
        String texto;
        while (true) {
            System.out.print(mensaje);
            texto = scanner.nextLine();
            System.out.println("Ingresado: " + texto);
            if (confirmar()) return texto;
        }
    }

    private int leerOpcionConConfirmacion(String mensaje, int min, int max) {
        int opcion;
        while (true) {
            System.out.print(mensaje);
            opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion >= min && opcion <= max) {
                System.out.println("Opción seleccionada: " + opcion);
                if (confirmar()) return opcion;
            } else {
                System.out.println("⚠ Opción fuera de rango.");
            }
        }
    }

    private boolean confirmar() {
        System.out.print("¿Es correcto? (1: sí, 2: no): ");
        int confirmacion = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer
        return confirmacion == 1;
    }
}
