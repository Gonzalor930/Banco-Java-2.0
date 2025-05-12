public abstract class CuentaAbstracta implements InterfacesBanco {
    protected int id;
    protected String nombre;
    protected float balance;
    protected String mail;

    public CuentaAbstracta(String nombre, int id, float balance, String mail) {
        this.nombre = nombre;
        this.id = id;
        this.balance = balance;
        this.mail = mail;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getNombre() {
        return nombre;
    }

    public void consultarSaldo() {
        System.out.println("Usuario: " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Balance: " + balance);
    }

    public Integer getId() {
        return id;
    }
}
