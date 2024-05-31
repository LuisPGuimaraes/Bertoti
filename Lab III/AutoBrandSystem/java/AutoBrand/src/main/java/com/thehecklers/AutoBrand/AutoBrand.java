package com.thehecklers.AutoBrand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AutoBrand {

	public static void main(String[] args) {
		SpringApplication.run(AutoBrand.class, args);
	}

}

@RestController
@RequestMapping("/brands")
class RestApiDemoController {
	private List<CarBrand> carBrands = new ArrayList<>();

	public RestApiDemoController() {
		carBrands.addAll(List.of(
				new CarBrand("General Motors", "Estados Unidos", "GM"),
				new CarBrand("Volkswagen", "Alemanha", "VW"),
				new CarBrand("Aston Martin", "Reino Unido", "AM"),
				new CarBrand("Rolls Royce", "Reino Unido", "RR"),
				new CarBrand("Maserati", "Italia", "MT")));
	}

	@GetMapping
	Iterable<CarBrand> getBrand() {
		return carBrands;
	}

	@GetMapping("/{abbreviation}")
	List<CarBrand> getAbbreviation(@PathVariable String abbreviation){
		List<CarBrand> result = new ArrayList<>();
		for (CarBrand carBrand : carBrands) {
			if (carBrand.getAbbreviation().equalsIgnoreCase(abbreviation)) {
				result.add(carBrand);
			}
		}
		return result;
	}

	@PostMapping
	CarBrand postBrand(@RequestBody CarBrand carBrand) {
		this.carBrands.add(carBrand);
		return carBrand;
	}

	@DeleteMapping("/{abbreviation}")
	void deleteBrand(@PathVariable String abbreviation) {
		this.carBrands.removeIf(c -> c.getAbbreviation().equalsIgnoreCase(abbreviation));
	}

	@PutMapping("/{abbreviation}")
	CarBrand putBrand(@PathVariable String abbreviation, @RequestBody CarBrand updatedCarBrand) {
		for (CarBrand carBrand : carBrands) {
			if (carBrand.getAbbreviation().equalsIgnoreCase(abbreviation)) {
				carBrand.setName(updatedCarBrand.getName());
				carBrand.setCountry(updatedCarBrand.getCountry());
				carBrand.setAbbreviation(updatedCarBrand.getAbbreviation());
				return carBrand;
			}
		}
		return null;
	}
}
