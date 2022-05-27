package am.volleyball.vapp.dal.repository;

import am.volleyball.vapp.dal.entity.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamMemberRepository extends JpaRepository<TeamMember, Long> {
}
