package projet.BalleDeTennis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projet.BalleDeTennis.services.PlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerService playerService;  //Final => Après l'initialisation, l'objet n'est plus modifiable

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


}
