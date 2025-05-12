

public class CuentaCorriente extends CuentaAbstracta {

    // Constructor que llama al de la clase padre
    public CuentaCorriente(String nombre, int id, float balance, String mail) {
        super(nombre, id,balance, mail);
    }

   

        //Metodo para el retiro de cuenta corriente
        @Override
        public void retirar(float balance){
            if(getBalance()>= -50000){
                    if ((getBalance()-balance) > -50000) {
                        setBalance(getBalance()-balance);//Actualiza el balance luego del retiro en el objeto con el metodo setBalance
                        System.out.println("Retiro Exitoso");
                    } else {
                        System.out.println("El monto es muy grande, ingrese un monto menor");
                    }
            }else{
                System.out.println("retiro no realizado");
            }
        }


        @Override
        public void depositar(float montoIngreso) {
            balance += montoIngreso;
        }

}
