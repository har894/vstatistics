package am.volleyball.vapp.ws.controller;

import am.volleyball.vapp.service.TeamMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team/teamMember")
public class TeamMemberController {

    @Autowired
    TeamMemberService teamMemberService;
}
