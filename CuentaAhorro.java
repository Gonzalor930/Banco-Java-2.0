

public class CuentaAhorro extends CuentaBancaria {
    
    public CuentaAhorro (String nombre, int id, float balance, String mail) {
        super(nombre, id,balance, mail);
    }

    public void aplicarInteres(float tasa){
         float suma =getBalance()*tasa;
         setBalance(getBalance()+suma);
    }
}
