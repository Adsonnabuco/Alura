package br.com.alura.screenmatch.exericio;

public class ContaBancaria {

    private double valor;
    private double saldo;


    public double getValor() {
        return valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void depositar(double valor){
        this.saldo = saldo + valor;
    }
    public void sacar(double valor){
        if (valor <= saldo){
            this.saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public void consultarSaldo(){
        System.out.println("Seu saldo é: "+ this.saldo);
    }

}
