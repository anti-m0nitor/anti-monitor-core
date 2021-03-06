package com.antimonitor.core.repository;

import com.antimonitor.core.model.Establishment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstablishmentRepository extends CrudRepository<Establishment, String> {
}
