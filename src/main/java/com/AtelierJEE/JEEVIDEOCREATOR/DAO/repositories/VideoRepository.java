package com.AtelierJEE.JEEVIDEOCREATOR.DAO.repositories;

import com.AtelierJEE.JEEVIDEOCREATOR.DAO.entities.Creator;
import com.AtelierJEE.JEEVIDEOCREATOR.DAO.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VideoRepository extends JpaRepository<Video, Long> {
    public Optional<Video> findByCreator(Creator creator);
}
