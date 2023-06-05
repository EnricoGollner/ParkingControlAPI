package dev.enricogollner.parkincontrol.controllers;

import dev.enricogollner.parkincontrol.repositories.ParkingSpotRepository;
import dev.enricogollner.parkincontrol.services.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)  // Permitir que seja acessado de qualquer fonte
@RequestMapping("/parking-spot")  // Definindo a URI a nível de classe.
public class ParkingSpotController {

    @Autowired
    ParkingSpotService parkingSpotService;  // Criando ponto de injeção do Service

    // Implementando os métodos CRUD:
    

}
