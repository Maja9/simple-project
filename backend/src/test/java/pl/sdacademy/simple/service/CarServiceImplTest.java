package pl.sdacademy.simple.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import pl.sdacademy.simple.model.CarDto;
import pl.sdacademy.simple.model.CarParameter;

class CarServiceImplTest {
	private static TestCarRepository carRepository = new TestCarRepository();
	private CarServiceImpl sut;

	@BeforeEach
	void setUp() {
		sut = new CarServiceImpl(carRepository);
	}

	@Test
	void shouldReturnAllCars() {
		List<CarDto> result = sut.getCars(CarParameter.builder().build());

		assertThat(result).hasSize(0);
	}
}
