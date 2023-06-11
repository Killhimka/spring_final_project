package com.example.SpringFinalProject.repos;

import com.example.SpringFinalProject.models.AdvertModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertRep extends CrudRepository<AdvertModel,Long> {
}
