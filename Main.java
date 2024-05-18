public class Main {
    public static void main(String[] args) {
        // ex1 O diagrama foi enviado pela entrega 
        
        Retangulo retangulo = new Retangulo(30, 10, "Retângulo");
        retangulo.desenhar();

        // ex2
        
        Funcionario funcionario1 = new Funcionario("Bitelo", 10.0, 160);
        Lider lider1 = new Lider("Thigas", 10.0, 160);
        Gerente gerente1 = new Gerente("Guilherme", 10.0, 160);

        System.out.println("Salário de João: " + funcionario1.calcularSalario());
        System.out.println("Salário de Maria (Líder): " + lider1.calcularSalario());
        System.out.println("Salário de Carlos (Gerente): " + gerente1.calcularSalario());
    }
}
