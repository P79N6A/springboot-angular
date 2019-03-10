package io.nirozjung.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.nirozjung.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
