package com.bernardawj.bbank.applicant.mapper;

import com.bernardawj.bbank.applicant.domain.Applicant;
import com.bernardawj.bbank.applicant.dto.ApplicantDTO;
import com.bernardawj.bbank.base.mapper.BaseMapper;
import com.bernardawj.bbank.creditfacility.mapper.CreditFacilityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", uses = { CreditFacilityMapper.class })
@Named("applicantMapper")
public interface ApplicantMapper extends BaseMapper<Applicant, ApplicantDTO> {

}
