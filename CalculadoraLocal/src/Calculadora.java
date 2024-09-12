public class Calculadora {

    public double Somar(double num1, double num2)
    {
        return num1 + num2;
    }

    public double Subtrair(double num1, double num2)
    {
        return num1 - num2;
    }

    public double Multiplicar(double num1, double num2)
    {
        return num1 * num2;
    }

    public double Dividir(double num1, double num2)
    {
        return num1 / num2;
    }

    public double Elevado(double num1, double num2)
    {
        double result = 1;
        for(int i = 0; i < num2; i++)
        {
            result *= num1;
        }
        return result;
    }

    public double Raiz(double num1, double num2)
    {
        return Elevado(num1, Dividir(1, num2));
    }

    public double Modulo(double num1, double num2)
    {
        return num1 % num2;
    }

    public boolean Maior(double num1, double num2)
    {
        return num1 > num2;
    }

    public boolean Menor(double num1, double num2)
    {
        return num1 < num2;
    }

    public boolean Igual(double num1, double num2)
    {
        return num1 == num2;
    }

    public boolean Diferente(double num1, double num2)
    {
        return num1 != num2;
    }

    public double Minimo(double num1, double num2)
    {
        if(Maior(num1, num2))
        {
            return num2;
        }
        return num1;
    }

    public double Maximo(double num1, double num2)
    {
        if(Maior(num1, num2))
        {
            return num1;
        }
        return num2;
    }

    public double JurosSimples(double cap, double taxa, int tempo)
    {
        return Multiplicar(Multiplicar(cap, taxa),tempo);
    }
    
    public double JurosComposto(double cap, double taxa, int tempo)
    {
        return Multiplicar(cap, Elevado(Somar(1, taxa),tempo));
    }

    public double TaxaJuros(double cap, double juros, int tempo)
    {
        return Dividir(juros, Multiplicar(cap, tempo));
    }

    public double ValorParcela(double cap, double taxa, int tempo)
    {
        return Dividir(Multiplicar(cap, JurosComposto(taxa, taxa, tempo)),Subtrair(Elevado(Somar(1, taxa),tempo),1));
    }

    public double Amortizacao(double cap, double tempo)
    {
        return Dividir(cap, tempo);
    }
}
