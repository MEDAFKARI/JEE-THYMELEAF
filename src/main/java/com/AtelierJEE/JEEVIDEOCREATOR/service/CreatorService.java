package com.AtelierJEE.JEEVIDEOCREATOR.service;

import com.AtelierJEE.JEEVIDEOCREATOR.DAO.entities.Creator;
import org.springframework.data.domain.Page;

import java.util.Collection;
import java.util.Optional;

public interface CreatorService {
    public Creator AddCreator(Creator creator);

    public Creator findCreator(String email);
    public Optional<Creator> findCreator(Creator creator);
    public Creator DeleteCreator(Long Id);
    public Creator ModifyCreator(Creator creator);
    public Collection<Creator> getAllCreators();

    Page<Creator> findCreatorByUsername(String name, int page, int size);
}
