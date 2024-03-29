package com.application.MobileLine.Repository;

import com.application.MobileLine.Entities.Fee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeeRepository extends JpaRepository<Fee, UUID> {
    List<Fee> findAll();

    Optional<Fee> findByTitle(String title);
}