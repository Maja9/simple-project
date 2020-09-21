package pl.sdacademy.simple.model;

import java.math.BigDecimal;
import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class CarDto {
	private final long id;
	private final String producer;
	private final String model;
	private final String colour;
	private final BigDecimal price;
	private final boolean automatic;
	private final Set<String> attributes;
}
