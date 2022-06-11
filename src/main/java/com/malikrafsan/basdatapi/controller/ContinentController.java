package com.malikrafsan.basdatapi.controller;

import com.malikrafsan.basdatapi.entity.Continent;
import com.malikrafsan.basdatapi.repository.ContinentRepository;
import com.malikrafsan.basdatapi.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import static java.util.stream.Collectors.toList;

@Controller
@RequestMapping(path="/continent")
public class ContinentController {
    @Autowired
    private ContinentService continentService;

    @GetMapping
    public @ResponseBody Iterable<Continent> getAllContinent() {
        return continentService.getAllContinent();
    }
}
