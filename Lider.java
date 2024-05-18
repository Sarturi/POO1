public class Lider extends Funcionario {
    public Lider(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        // Incrementa o salário em 2% para líderes
        return super.calcularSalario() * 1.02;
    }
}
