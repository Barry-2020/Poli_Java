public class Gerente extends Funcionario { //Hereda atributos de funcionario
    private String clave;
    public void setClave(String clave){
        this.clave = clave;
    }
    public boolean iniciarSesion(String clave){
        return clave == "AluraCursosOnline";
    }

    //SOBREESCRITURA DE METODO
    public double getBonificacion(){
//        return super.getSalario() + (super.getSalario() * 0.1); //Llama a un metodo de la clase superior
        System.out.println("EJECUTANDO DESDE GERENTE");
        return super.getSalario() + this.getSalario() * 0.05;
    }
}
