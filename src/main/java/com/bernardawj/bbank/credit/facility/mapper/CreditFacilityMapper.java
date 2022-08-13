package com.bernardawj.bbank.credit.facility.mapper;

import com.bernardawj.bbank.applicant.mapper.ApplicantMapper;
import com.bernardawj.bbank.base.mapper.BaseMapper;
import com.bernardawj.bbank.credit.facility.domain.CreditFacility;
import com.bernardawj.bbank.credit.facility.dto.CreditFacilityDTO;
import com.bernardawj.bbank.credit.loan.mapper.LoanMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", uses = { ApplicantMapper.class, LoanMapper.class })
public interface CreditFacilityMapper extends BaseMapper<CreditFacility, CreditFacilityDTO> {

}
