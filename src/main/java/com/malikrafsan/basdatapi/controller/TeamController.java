package com.malikrafsan.basdatapi.controller;

import com.malikrafsan.basdatapi.entity.Continent;
import com.malikrafsan.basdatapi.entity.Nation;
import com.malikrafsan.basdatapi.entity.Team;
import com.malikrafsan.basdatapi.repository.TeamRepository;
import com.malikrafsan.basdatapi.service.ContinentService;
import com.malikrafsan.basdatapi.service.NationService;
import com.malikrafsan.basdatapi.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import static java.util.stream.Collectors.toList;

@Controller
@RequestMapping(path="/team")
public class TeamController {
    @Autowired
    private TeamService teamService;
    @Autowired
    private NationService nationService;
    @Autowired
    private ContinentService continentService;

    @GetMapping
    public @ResponseBody
    List<Team> getTeam(@RequestParam(value="continent", defaultValue="") String continent, @RequestParam(value="nation", defaultValue="") String nation) {
//        return teamService.getAllTeam();
        List<Team> actualList;

        if (continent.isEmpty() && nation.isEmpty()) {
            actualList = StreamSupport
                    .stream(teamService.getAllTeam().spliterator(), false).collect(Collectors.toList());
        } else if (continent.isEmpty()) {
            Optional<Nation> n = nationService.getNationByName(nation);

            if (n.isPresent()) {
                actualList = StreamSupport
                        .stream(teamService.getAllTeam().spliterator(), false).collect(Collectors.toList());
                actualList = actualList.stream().filter(team -> team.getNation_id().equals(n.get().getNation_id())).collect(Collectors.toList());
            } else {
                actualList = new ArrayList<>();
            }
        } else if (nation.isEmpty()) {
            List<Nation> nations = nationService.getNationByContinent(continent);
            Set<String> nationIds = nations.stream().map(Nation::getNation_id).collect(Collectors.toSet());
            actualList = StreamSupport
                    .stream(teamService.getAllTeam().spliterator(), false).collect(Collectors.toList());
            actualList = actualList.stream().filter(team -> nationIds.contains(team.getNation_id())).collect(Collectors.toList());
        } else {
            Optional<Continent> c = continentService.getContinentByName(continent);
            Optional<Nation> n = nationService.getNationByName(nation);

            if (c.isPresent() && n.isPresent() && c.get().getContinent_id().equals(n.get().getContinent_id())) {
                actualList = StreamSupport
                        .stream(teamService.getAllTeam().spliterator(), false).collect(Collectors.toList());
                actualList = actualList.stream().filter(team -> team.getNation_id().equals(n.get().getNation_id())).collect(Collectors.toList());
            } else {
                actualList = new ArrayList<>();
            }
        }

        return actualList;
    }

}
