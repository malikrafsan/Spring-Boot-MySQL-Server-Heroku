package com.malikrafsan.basdatapi.dto;

import lombok.Getter;
import lombok.Setter;

public class NationDto {
    @Getter
    @Setter
    private String nation_id;

    @Getter
    @Setter
    private String nation;

    @Getter
    @Setter
    private String continent_id;

    public NationDto(String nation_id, String nation, String continent_id) {
        this.nation_id = nation_id;
        this.nation = nation;
        this.continent_id = continent_id;
    }

    @Override
    public String toString() {
        return "NationDto{" +
                "nation_id='" + nation_id + '\'' +
                ", nation='" + nation + '\'' +
                ", continent_id='" + continent_id + '\'' +
                '}';
    }
}
