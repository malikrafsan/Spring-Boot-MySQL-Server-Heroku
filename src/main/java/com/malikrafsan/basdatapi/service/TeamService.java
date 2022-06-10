package com.malikrafsan.basdatapi.service;

import com.malikrafsan.basdatapi.entity.Team;
import com.malikrafsan.basdatapi.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public Iterable<Team> getAllTeam() {
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(String id) {
        return teamRepository.findById(id);
    }

    public Optional<Team> getTeamByName(String name) {
        List<Team> actualList = StreamSupport.stream(teamRepository.findAll().spliterator(), false).toList();

        return actualList.stream()
                .filter(team -> team.getTeam().equals(name))
                .findFirst();
    }
}
