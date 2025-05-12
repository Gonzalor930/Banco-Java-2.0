import java.util.*;

public class Banco {
    private Map<Integer, CuentaAbstracta> cuentas;

    public Banco(){
      cuentas = new HashMap<>();
    }     //Constructor del Banco

    public void agregarCuenta(CuentaAbstracta cuenta) {
        cuentas.put(cuenta.getId(), cuenta);
    }

    public CuentaAbstracta obtenerCuenta(int id) {
        return cuentas.get(id);
    }

    public void eliminarCuenta(int id) {
        cuentas.remove(id);
    }

    public void mostrarTodasLasCuentas() {
        for (CuentaAbstracta cuenta : cuentas.values()) {
            cuenta.consultarSaldo();
        }
    }
}
