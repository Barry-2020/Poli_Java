public class Contador extends Funcionario{

    @Override
    public double getBonificacion() { //Utiliza la clase mas especifica
        System.out.println("EJECUTANDO DESDE CONTADOR");
        return 200;
    }
    //abstract obliga a implementar los metodos abstractos
}
