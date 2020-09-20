package pl.sdacademy.simple.service;

import pl.sdacademy.simple.model.CarDto;
import pl.sdacademy.simple.model.CarParameter;

import java.util.List;

public interface CarService {
    List<CarDto> getCars(CarParameter carParameter);
}
