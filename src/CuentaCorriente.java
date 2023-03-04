public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(int agencia, int numero){
        super(agencia, numero); //Llamamos al constructor por defecto
    }

    @Override   //usar esa wea, para sobreescribir
    public boolean saca(double valor) { //sobreescribiendo
        double comision = 0.2;
        return super.saca(valor + comision);
    }
}
