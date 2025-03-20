// Classe Calculadora
class Calculadora {
    private double numero1;
    private double numero2;

    // Construtor
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Métodos das operações
    public double somar() {
        return numero1 + numero2;
    }

    public double subtrair() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return numero1 / numero2;
    }

    // Getters e Setters
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}

// Classe Principal com o método main
public class Main {
    public static void main(String[] args) {
        // Criando uma instância da calculadora com dois números
        Calculadora calc = new Calculadora(10.5, 5.2);

        // Testando as operações
        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Multiplicação: " + calc.multiplicar());
        System.out.println("Divisão: " + calc.dividir());

        // Alterando valores usando setters
        calc.setNumero1(20.0);
        calc.setNumero2(4.0);

        System.out.println("\nNovos cálculos:");
        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Multiplicação: " + calc.multiplicar());
        System.out.println("Divisão: " + calc.dividir());
    }
}