package pl.sdacademy.simple.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import pl.sdacademy.simple.data.CarAttributeEntity;
import pl.sdacademy.simple.data.CarEntity;
import pl.sdacademy.simple.repository.CarRepository;

public class TestCarRepository implements CarRepository {
	private static final List<CarEntity> CARS = initCars();

	private static List<CarEntity> initCars() {
		CarAttributeEntity attributeEntity = new CarAttributeEntity();
		attributeEntity.setAttribute("petrol");
		CarAttributeEntity attributeEntity2 = new CarAttributeEntity();
		attributeEntity2.setAttribute("metalic");

		List<CarEntity> cars = new ArrayList<>();
		CarEntity carEntity = new CarEntity();
		carEntity.setId(1);
		carEntity.setProducer("Opel");
		carEntity.setModel("Corsa");
		carEntity.setColour("red");
		carEntity.setPrice(BigDecimal.valueOf(10.5));
		carEntity.setAutomatic(Byte.parseByte("1"));
		carEntity.setAttributes(Set.of(attributeEntity, attributeEntity2));
		cars.add(carEntity);

		carEntity = new CarEntity();
		carEntity.setId(2);
		carEntity.setProducer("Opel");
		carEntity.setModel("Astra");
		carEntity.setColour("blue");
		carEntity.setPrice(BigDecimal.valueOf(12.5));
		carEntity.setAutomatic(Byte.parseByte("0"));
		carEntity.setAttributes(Set.of(attributeEntity));
		cars.add(carEntity);

		carEntity = new CarEntity();
		carEntity.setId(3);
		carEntity.setProducer("Toyota");
		carEntity.setModel("Yaris");
		carEntity.setColour("Red");
		carEntity.setPrice(BigDecimal.valueOf(9.75));
		carEntity.setAutomatic(Byte.parseByte("1"));
		carEntity.setAttributes(Set.of(attributeEntity, attributeEntity2));
		cars.add(carEntity);


		return cars;
	}

	List<CarEntity> getCars(){
		return CARS;
	}
}
