package com.github.SarahTumenas.citiesapi.countries.entities.repositories;

import com.github.SarahTumenas.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
