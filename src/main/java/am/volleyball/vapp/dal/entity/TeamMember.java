package am.volleyball.vapp.dal.entity;

import am.volleyball.vapp.enumeration.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "teamMembers")
@Getter
@Setter
@NoArgsConstructor
public class TeamMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "role")
    private String role;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "joinDate")
    private Date joinDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "leaveDate")
    private Date leaveDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @OneToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private Team team;
}
