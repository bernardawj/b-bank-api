package com.bernardawj.bbank.credit.loan.mapper;

import com.bernardawj.bbank.base.mapper.BaseMapper;
import com.bernardawj.bbank.credit.facility.mapper.CreditFacilityMapper;
import com.bernardawj.bbank.credit.loan.domain.Loan;
import com.bernardawj.bbank.credit.loan.dto.LoanDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", uses = { CreditFacilityMapper.class })
public interface LoanMapper extends BaseMapper<Loan, LoanDTO> {
}
