package com.malikrafsan.basdatapi.dto;

import lombok.Getter;
import lombok.Setter;

public class NationContinentDto {
    @Getter
    @Setter
    private String continent_id;

    @Getter
    @Setter
    private String continent;

    @Getter
    @Setter
    private String nation_id;

    @Getter
    @Setter
    private String nation;

    public NationContinentDto(String continent_id, String continent, String nation_id, String nation) {
        this.continent_id = continent_id;
        this.continent = continent;
        this.nation_id = nation_id;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "ContinentNationDto{" +
                "continent_id='" + continent_id + '\'' +
                ", continent='" + continent + '\'' +
                ", nation_id='" + nation_id + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
