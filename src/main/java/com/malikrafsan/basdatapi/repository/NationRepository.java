package com.malikrafsan.basdatapi.repository;

import com.malikrafsan.basdatapi.entity.Nation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface NationRepository extends CrudRepository<Nation, String> {
    Iterable<Nation> findByContinentId(@Param("continent_id") String continent_id);
}
