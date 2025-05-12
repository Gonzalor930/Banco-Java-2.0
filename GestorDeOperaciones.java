public class GestorDeOperaciones {
    
        public void depositar(CuentaAbstracta cuenta, float monto) {
            if (monto <= 0) {
                throw new IllegalArgumentException("El monto debe ser mayor a cero");
            }
            cuenta.depositar(monto);
        }
    
        public void retirar(CuentaAbstracta cuenta, float monto) {
            if (monto <= 0) {
                throw new IllegalArgumentException("El monto debe ser mayor a cero");
            }
            cuenta.retirar(monto);
        }
    
        public void mostrarInfo(CuentaAbstracta cuenta) {
            cuenta.consultarSaldo();
        }
    }
