public class SuperCalculadora {
    int valor1, valor2, total;

    public SuperCalculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int somar() {
        total = valor1 + valor2;
        return total;
    }

    public int subtrair() {
        total = valor1 - valor2;
        return total;
    }

    public int multiplicar() {
        total = valor1 * valor2;
        return total;
    }

    public int dividir() {
        total = valor1 / valor2;
        return total;
    }
}