package com.malikrafsan.basdatapi.dto;

import lombok.Getter;
import lombok.Setter;

public class ContinentDto {
    @Getter
    @Setter
    private String continent_id;

    @Getter
    @Setter
    private String continent;

    public ContinentDto(String continent_id, String continent) {
        this.continent_id = continent_id;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "ContinentDto{" +
                "continent_id='" + continent_id + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }
}
