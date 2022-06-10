package com.malikrafsan.basdatapi.controller;

import com.malikrafsan.basdatapi.entity.Team;
import com.malikrafsan.basdatapi.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/team")
public class TeamController {
    @Autowired
    private TeamRepository teamRepository;

    @GetMapping
    public @ResponseBody
    Iterable<Team> getAllTeam() {
        return teamRepository.findAll();
    }
}
