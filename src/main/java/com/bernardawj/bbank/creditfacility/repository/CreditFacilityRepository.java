package com.bernardawj.bbank.creditfacility.repository;

import com.bernardawj.bbank.creditfacility.domain.CreditFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditFacilityRepository extends JpaRepository<CreditFacility, Long> {
}
