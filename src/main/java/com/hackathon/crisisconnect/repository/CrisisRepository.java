package com.hackathon.crisisconnect.repository;

import com.hackathon.crisisconnect.model.CrisisRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrisisRepository extends JpaRepository<CrisisRequest, Long> {
    // This empty interface gives us 50+ database commands (save, find, delete) for
    // free!
}