package com.malikrafsan.basdatapi.controller;

import com.malikrafsan.basdatapi.entity.Nation;
import com.malikrafsan.basdatapi.repository.NationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/nation")
public class NationController {
    @Autowired
    private NationRepository nationRepository;

    @GetMapping
    public @ResponseBody
    Iterable<Nation> getNation(@RequestParam(value="continent", defaultValue="") String continent) {
//        if (continent.isEmpty()) {
//            return nationRepository.findAll();
//        } else {
//            return nationRepository.findByContinent(continent);
//        }
        return nationRepository.findAll();
    }
}
