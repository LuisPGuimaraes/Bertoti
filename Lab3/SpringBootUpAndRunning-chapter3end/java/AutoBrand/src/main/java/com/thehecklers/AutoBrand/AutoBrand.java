package com.thehecklers.AutoBrand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class AutoBrand {

	public static void main(String[] args)
	{
		SpringApplication.run(AutoBrand.class, args);
	}

}

@RestController
@RequestMapping("/brands")
class RestApiDemoController {
	private List<CarBrand> carBrands = new ArrayList<>();

	public RestApiDemoController() {
		carBrands.addAll(List.of(
				new CarBrand("General Motors","Estados Unidos","GM"),
				new CarBrand("Volkswagen","Alemanha","VW"),
				new CarBrand("Aston Martin","Reino Unido","AM"),
				new CarBrand("Rolls Royce","Reino Unido","RR"),
				new CarBrand("Maserati","Italia","MT")));
	}

	@GetMapping
	Iterable<CarBrand> getBrand() {
		return carBrands;
	}

	@GetMapping("/{id}")
	Optional<CarBrand> getBrandById()

	@PostMapping
	CarBrand postBrand(@RequestBody CarBrand carBrands) {
		carBrands.add(carBrands);
		return carBrands;
	}

	@DeleteMapping("/{id}")
	void deleteBrand(@PathVariable String id) {
		carBrands.removeIf(c -> c.getId().equals(id));
	}
}

class Coffee {
	private final String id;
	private String name;

	public Coffee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Coffee(String name) {
		this(UUID.randomUUID().toString(), name);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}