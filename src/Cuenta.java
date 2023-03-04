public abstract class Cuenta{
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total = 0; //static = variable de clase, como si fuera global

    public Cuenta(int agencia, int numero){
        if (agencia <= 0){
            System.out.println("No esta permitido");
            this.agencia = 1;
        }else{
            this.agencia = agencia;
        }
        this.numero = numero;
        total++;
        System.out.println("Se van creando: "+total+" cuentas.");
    }

//    public Cuenta(){
//        this(1); //Re-llamamos al constructor con validaciones, pasando el parametro requerido.
//    }

//    public void depositar(double monto){ //void no retorna valor
//        this.saldo += monto;
//    }
    public abstract void depositar(double monto); //metodo abstracto, uso obligatorio en sus hijos

    public boolean retirar(double monto){ //retorna bool
        if (this.saldo <= monto){
//            System.out.println("Saldo insuficiente");
            return false;
        }
        this.saldo -= monto;
//        System.out.println("Retiro exitoso");
        return true;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean transferir(double monto, Cuenta cuenta){
        if (this.saldo <= monto){
            return false;
        }
//        cuenta.saldo += monto;
        this.saca(monto);
        cuenta.depositar(monto);
//        this.saldo -= monto;
        return true;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int nuevaAgencia){
        if (nuevaAgencia > 0){
            this.agencia = nuevaAgencia;
        }
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return Cuenta.total;
    }
}
