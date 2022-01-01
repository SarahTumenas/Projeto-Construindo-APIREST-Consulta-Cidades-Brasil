package com.github.SarahTumenas.citiesapi.staties.entities.repositories;


import com.github.SarahTumenas.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}