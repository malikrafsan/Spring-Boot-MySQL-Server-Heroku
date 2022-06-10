package com.malikrafsan.basdatapi.dto;

import lombok.Getter;
import lombok.Setter;

public class TeamNationContinentDto {
    @Getter
    @Setter
    private String team_id;

    @Getter
    @Setter
    private String team;

    @Getter
    @Setter
    private String nation_id;

    @Getter
    @Setter
    private Integer world_ranking;

    @Getter
    @Setter
    private Integer continent_ranking;

    @Getter
    @Setter
    private Integer nation_ranking;

    @Getter
    @Setter
    private String nation;

    @Getter
    @Setter
    private String continent;

    public TeamNationContinentDto(String team_id, String team, String nation_id, Integer world_ranking, Integer continent_ranking, Integer nation_ranking, String nation, String continent) {
        this.team_id = team_id;
        this.team = team;
        this.nation_id = nation_id;
        this.world_ranking = world_ranking;
        this.continent_ranking = continent_ranking;
        this.nation_ranking = nation_ranking;
        this.nation = nation;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "TeamNationContinentDto{" +
                "team_id='" + team_id + '\'' +
                ", team='" + team + '\'' +
                ", nation_id='" + nation_id + '\'' +
                ", world_ranking=" + world_ranking +
                ", continent_ranking=" + continent_ranking +
                ", nation_ranking=" + nation_ranking +
                ", nation='" + nation + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }
}
