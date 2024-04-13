package projet.BalleDeTennis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projet.BalleDeTennis.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {


}
