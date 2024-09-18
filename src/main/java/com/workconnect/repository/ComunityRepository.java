package com.workconnect.repository;

import com.workconnect.model.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ComunityRepository extends JpaRepository<Community, Integer> {

    //Consulta derivada
    List<Community> findCommunityByName(String name);

    //JPQL == Java Persistence Query Language
    @Query("SELECT c FROM Community c WHERE c.isPrivate=?1")
    List<Community> findAllByIsPrivate(boolean isPrivate);
}
