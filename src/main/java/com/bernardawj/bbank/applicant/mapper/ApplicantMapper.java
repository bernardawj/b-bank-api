package com.bernardawj.bbank.applicant.mapper;

import com.bernardawj.bbank.applicant.domain.Applicant;
import com.bernardawj.bbank.applicant.dto.ApplicantDTO;
import com.bernardawj.bbank.base.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ApplicantMapper extends BaseMapper<Applicant, ApplicantDTO> {
}
