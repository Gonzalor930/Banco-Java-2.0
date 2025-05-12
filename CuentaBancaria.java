public class CuentaBancaria extends CuentaAbstracta{//implementa el uso de Interfaces para generalizar el comportamiento de las distintas cuentas

    private int id;
    private String nombre;
    private float balance;
    private String mail;

        public CuentaBancaria(String nombre, int id, float balance, String mail) {
            super(nombre, id, balance, mail);
        }
    
        public void depositar(float montoIngreso) {
            if (montoIngreso <= 0) {
                new IllegalArgumentException("no puede ingresar montos nulos o negativos");
            }
            balance += montoIngreso;
        }
    
        public void retirar(float montoRetiro) {
            if (montoRetiro <= balance) {
                balance -= montoRetiro;
                System.out.println("Retiro exitoso");
            } else {
                System.out.println("Fondos insuficientes, los fondos de su cuenta son "+ getBalance());
            }
        }
    }


    