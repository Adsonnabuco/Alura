package br.com.alura.screenmatch.exericio;

public class ContaCorrente extends ContaBancaria{

    public double cobrarTarifaMensal(double tarifa){
        double saldo = getSaldo() - tarifa;
        return saldo;
    }
}
