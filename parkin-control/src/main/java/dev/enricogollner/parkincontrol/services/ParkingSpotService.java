package dev.enricogollner.parkincontrol.services;

import dev.enricogollner.parkincontrol.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    @Autowired  // Estamos dizendo ao Spring que em determinados momentos, ele terá que injetar uma dependência de ParkingSpotRepository dentro de ParkingSpotService
    ParkingSpotRepository parkingSpotRepository;

}
