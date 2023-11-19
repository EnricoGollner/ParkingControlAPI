package dev.enricogollner.parkincontrol.repositories;

import dev.enricogollner.parkincontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository  // Não precisamos anotar, pois o JpaRepository já traz o conhecimento de que é um, porém pode ser bom para deixar visível.
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
}
