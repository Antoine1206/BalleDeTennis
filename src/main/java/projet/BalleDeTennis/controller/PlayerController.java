package projet.BalleDeTennis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projet.BalleDeTennis.model.Player;
import projet.BalleDeTennis.services.PlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerService playerService;  //Final => Après l'initialisation, l'objet n'est plus modifiable

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable Long id) {

        Player player = new Player(1L, "Novak", "Djokovic", 36);
        playerService.savePlayer(player);
        playerService.getPlayerById(1L);
        return player;
    }


}
