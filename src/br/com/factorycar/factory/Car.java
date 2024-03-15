package br.com.factorycar.factory;

public abstract class Car {

    private String CorVeiculo;
    private String nivelDoTanque;

    public Car(String corVeiculo, String nivelDoTanque){
        this.CorVeiculo = corVeiculo;
        this.nivelDoTanque = nivelDoTanque;
    }

    public void corNivelVeiculo(){
        System.out.println("Modelo do carro: " + getClass().getSimpleName());
        System.out.println("Cor do veiculo: " + CorVeiculo);
        System.out.println("Nivel do tanque: " + nivelDoTanque);

    }


}
