package com.equifax.msbranchesjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equifax.msbranchesjwt.models.Branch;


@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
    Branch findByLatitudeAndLongitude(String latitude, String longitude);
}