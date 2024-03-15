package br.com.factorycar.factory;

public class SemContratoFactory extends Factory{

    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new GolCar("Verde musgo", "Cheio");
        } else {
            return new PalioCar("Azul", "Cheio");

        }
    }
}
