package strategy;

public class Funcionario {

    private float salario;

    public float getSalario() {
        return salario;
    }

    public void adicionarBonus(float salario, float bonus) {
        CalculadoraSalario calculadora = new CalculadoraSalario(salario, bonus);
        this.salario = calculadora.calcular(new RegraBonus());
    }

    public void aplicarDesconto(float salario, float desconto) {
        CalculadoraSalario calculadora = new CalculadoraSalario(salario, desconto);
        this.salario = calculadora.calcular(new RegraDesconto());
    }

    public void parcelarSalario(float salario, float parcelas) {
        CalculadoraSalario calculadora = new CalculadoraSalario(salario, parcelas);
        this.salario = calculadora.calcular(new RegraParcelamento());
    }

    public void aplicarReajuste(float salario, float indice) {
        CalculadoraSalario calculadora = new CalculadoraSalario(salario, indice);
        this.salario = calculadora.calcular(new RegraReajuste());
    }

    public void calcularMediaSalarios(float salario1, float salario2) {
        CalculadoraSalario calculadora = new CalculadoraSalario(salario1, salario2);
        this.salario = calculadora.calcular(new RegraMedia());
    }

}
