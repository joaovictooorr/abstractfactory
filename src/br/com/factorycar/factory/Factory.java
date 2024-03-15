package br.com.factorycar.factory;

public abstract class Factory {

    public Car create(String requestedGrade){
        Car car = retrieveCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car){
        car.corNivelVeiculo();
        return car;
    }

    abstract Car retrieveCar(String requestedGrade);

}
