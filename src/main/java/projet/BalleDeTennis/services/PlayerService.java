package projet.BalleDeTennis.services;

import org.springframework.stereotype.Service;
import projet.BalleDeTennis.model.Player;
import projet.BalleDeTennis.repository.PlayerRepository;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public void savePlayer(Player player){
        playerRepository.save(player);
    }

    public Player getPlayerById(Long id){
        return playerRepository.getReferenceById(id);
    }

}
