package com.malikrafsan.basdatapi.controller;

import com.malikrafsan.basdatapi.entity.Continent;
import com.malikrafsan.basdatapi.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/continent")
public class ContinentController {
    @Autowired
    private ContinentRepository continentRepository;

    @GetMapping
    public @ResponseBody Iterable<Continent> getAllContinent() {
        return continentRepository.findAll();
    }
}
