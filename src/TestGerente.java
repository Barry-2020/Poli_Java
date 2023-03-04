public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(6000);
        gerente.setClave("AluraCursosOnline");

        System.out.println("Bonifiacion: "+ gerente.getBonificacion());

        System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
    }
}
