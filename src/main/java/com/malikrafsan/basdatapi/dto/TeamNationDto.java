package com.malikrafsan.basdatapi.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class TeamNationDto {
    @Getter
    @Setter
    private String nation_id;

    @Getter
    @Setter
    private String nation;

    @Getter
    @Setter
    private String continent_id;

    @Getter
    @Setter
    private List<TeamDto> teams;

    public TeamNationDto(String nation_id, String nation, String continent_id, List<TeamDto> teams) {
        this.nation_id = nation_id;
        this.nation = nation;
        this.continent_id = continent_id;
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "TeamNationDto{" +
                "nation_id='" + nation_id + '\'' +
                ", nation='" + nation + '\'' +
                ", continent_id='" + continent_id + '\'' +
                ", teams=" + teams +
                '}';
    }
}
