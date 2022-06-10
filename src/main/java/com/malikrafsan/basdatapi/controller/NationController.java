package com.malikrafsan.basdatapi.controller;

import com.malikrafsan.basdatapi.dto.NationDto;
import com.malikrafsan.basdatapi.dto.TeamDto;
import com.malikrafsan.basdatapi.entity.Continent;
import com.malikrafsan.basdatapi.entity.Nation;
import com.malikrafsan.basdatapi.repository.NationRepository;
import com.malikrafsan.basdatapi.service.ContinentService;
import com.malikrafsan.basdatapi.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping(path="/nation")
public class NationController {
    @Autowired
    private NationService nationService;
    @Autowired
    private ContinentService continentService;

    @GetMapping
    public @ResponseBody
    List<NationDto> getNation(@RequestParam(value="continent", defaultValue="") String continent, @RequestParam(value="with_team", defaultValue="true") boolean withTeam) {
        List<Nation> actualList;

        if (continent.isEmpty()) {
            actualList = nationService.getAllNation();
        } else {
            actualList = nationService.getNationByContinent(continent);
        }

        return actualList.stream()
                .map(nation -> new NationDto(nation.getNation_id(), nation.getNation(), nation.getContinent_id()))
                .collect(Collectors.toList());
    }
}
