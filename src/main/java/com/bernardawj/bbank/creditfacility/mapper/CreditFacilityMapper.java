package com.bernardawj.bbank.creditfacility.mapper;

import com.bernardawj.bbank.applicant.mapper.ApplicantMapper;
import com.bernardawj.bbank.base.mapper.BaseMapper;
import com.bernardawj.bbank.creditfacility.domain.CreditFacility;
import com.bernardawj.bbank.creditfacility.dto.CreditFacilityDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", uses = { ApplicantMapper.class })
public interface CreditFacilityMapper extends BaseMapper<CreditFacility, CreditFacilityDTO> {

}
