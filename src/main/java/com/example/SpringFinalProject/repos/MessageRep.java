package com.example.SpringFinalProject.repos;

import com.example.SpringFinalProject.models.AdvertModel;
import org.springframework.data.repository.CrudRepository;

public interface MessageRep extends CrudRepository<AdvertModel,Long> {
}
