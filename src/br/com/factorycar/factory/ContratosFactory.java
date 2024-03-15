package br.com.factorycar.factory;

public class ContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new CorollaCar("Prata", "Cheio");
        } else {
            return new HrvCar("Preto", "Cheio");
        }

    }
}
