package am.volleyball.vapp.dal.repository;

import am.volleyball.vapp.dal.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
