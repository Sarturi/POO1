public class Gerente extends Funcionario {
    public Gerente(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        // Incrementa o salário em 5% para gerentes
        return super.calcularSalario() * 1.05;
    }
}
