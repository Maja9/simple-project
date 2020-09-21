package pl.sdacademy.simple.service;

import java.util.List;

import pl.sdacademy.simple.model.CarDto;
import pl.sdacademy.simple.model.CarParameter;

public interface CarService {

	List<CarDto> getCars(CarParameter carParameter);
}
