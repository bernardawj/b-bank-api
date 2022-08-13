package com.bernardawj.bbank.credit.facility.repository;

import com.bernardawj.bbank.credit.facility.domain.CreditFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditFacilityRepository extends JpaRepository<CreditFacility, Long> {
}
