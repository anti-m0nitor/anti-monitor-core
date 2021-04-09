package com.antimonitor.core.repository;

import com.antimonitor.core.model.Establishment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EstablishmentRepository extends CrudRepository<Establishment, UUID> {
}