public class App {
	public static void main(String[] args) throws Exception {
		long v_inicio = System.currentTimeMillis();
		Calculadora v_calculadora = new Calculadora();
		int x = 10, y = 5;
		double z = 0.2;
		System.out.println(x + " + " + y + " = " + v_calculadora.Somar(x, y));
		System.out.println(x + " - " + y + " = " + v_calculadora.Subtrair(x, y));
		System.out.println(x + " * " + y + " = " + v_calculadora.Multiplicar(x, y));
		System.out.println(x + " / " + y + " = " + v_calculadora.Dividir(x, y));
		System.out.println(x + " ** " + y + " = " + v_calculadora.Elevado(x, y));
		System.out.println(x + " √ " + y + " = " + v_calculadora.Raiz(x, y));
		System.out.println(x + " % " + y + " = " + v_calculadora.Modulo(x, y));
		System.out.println(x + " > " + y + " = " + v_calculadora.Maior(x, y));
		System.out.println(x + " < " + y + " = " + v_calculadora.Menor(x, y));
		System.out.println(x + " == " + y + " = " + v_calculadora.Igual(x, y));
		System.out.println(x + " != " + y + " = " + v_calculadora.Diferente(x, y));
		System.out.println("Minimo entre:" + x + ", " + y + " = " + v_calculadora.Minimo(x, y));
		System.out.println("Maximo entre:" + x + ", " + y + " = " + v_calculadora.Maximo(x, y));
		System.out.println(
				"Juros simples entre:" + x + ", " + z + ", " + y + " = " + v_calculadora.JurosSimples(x, z, y));
		System.out.println(
				"Juros composto entre:" + x + ", " + z + ", " + y + " = " + v_calculadora.JurosComposto(x, z, y));
		System.out.println("Taxa de juros entre:" + x + ", " + z + ", " + y + " = " + v_calculadora.TaxaJuros(x, z, y));
		System.out.println(
				"Valor da parcela entre:" + x + ", " + z + ", " + y + " = " + v_calculadora.ValorParcela(x, z, y));
		System.out.println("Amortizacao entre:" + x + ", " + y + " = " + v_calculadora.Amortizacao(x, y));
		long v_final = System.currentTimeMillis();
		long v_duracao = v_final - v_inicio;
		System.out.println("Tempo de execução: " + v_duracao + " milisegundos");
	}
}
