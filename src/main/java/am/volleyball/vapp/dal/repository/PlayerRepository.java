package am.volleyball.vapp.dal.repository;

import am.volleyball.vapp.dal.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
