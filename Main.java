import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        LectorDeCuentas lector = new LectorDeCuentas();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Crear nueva cuenta");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Mostrar todas las cuentas");
            System.out.println("6. Eliminar cuenta");
            System.out.println("7. Salir");
            System.out.print("Ingrese su opción: ");

            // Usamos nextInt() para leer el número de opción
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer (consumir el salto de línea)

            switch (opcion) {
                case 1:
                    lector.cargarCuentas(banco);
                    break;
                case 2:
                    System.out.print("Ingrese ID de la cuenta: ");
                    int idDep = scanner.nextInt();
                    System.out.print("Ingrese monto a depositar: ");
                    float montoDep = scanner.nextFloat();
                    scanner.nextLine(); // Limpiar el buffer
                    CuentaAbstracta cDep = banco.obtenerCuenta(idDep);
                    if (cDep != null) {
                        cDep.depositar(montoDep);
                    } else {
                        System.out.println("⚠ Cuenta no encontrada.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese ID de la cuenta: ");
                    int idRet = scanner.nextInt();
                    System.out.print("Ingrese monto a retirar: ");
                    float montoRet = scanner.nextFloat();
                    scanner.nextLine(); // Limpiar el buffer
                    CuentaAbstracta cRet = banco.obtenerCuenta(idRet);
                    if (cRet != null) {
                        cRet.retirar(montoRet);
                    } else {
                        System.out.println("⚠ Cuenta no encontrada.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese ID de la cuenta: ");
                    int idCon = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    CuentaAbstracta cCon = banco.obtenerCuenta(idCon);
                    if (cCon != null) {
                        cCon.consultarSaldo();
                    } else {
                        System.out.println("⚠ Cuenta no encontrada.");
                    }
                    break;
                case 5:
                    banco.mostrarTodasLasCuentas();
                    break;
                case 6:
                    System.out.print("Ingrese ID de la cuenta a eliminar: ");
                    int idDel = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    banco.eliminarCuenta(idDel);
                    System.out.println("Cuenta eliminada (si existía).");
                    break;
                case 7:
                    salir = true;
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("⚠ Opción inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
