package pl.sdacademy.simple.service;

import java.util.ArrayList;
import java.util.List;

import pl.sdacademy.simple.model.CarDto;
import pl.sdacademy.simple.model.CarParameter;
import pl.sdacademy.simple.repository.CarRepository;

public class CarServiceImpl implements CarService {

	private final CarRepository carRepository;

	public CarServiceImpl(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	@Override
	public List<CarDto> getCars(CarParameter carParameter) {
		List<CarDto> result = new ArrayList<>();
		return result;
	}
}
