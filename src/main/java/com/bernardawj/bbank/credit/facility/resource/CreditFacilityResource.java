package com.bernardawj.bbank.credit.facility.resource;

import com.bernardawj.bbank.credit.facility.exception.CreditFacilityServiceException;
import com.bernardawj.bbank.credit.facility.dto.CreditFacilityDTO;
import com.bernardawj.bbank.credit.facility.service.CreditFacilityService;
import com.bernardawj.bbank.creditfacility.facility.CreditFacilityServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/credit-facility")
public class CreditFacilityResource {

    // Services
    private final CreditFacilityService creditFacilityService;

    @Autowired
    public CreditFacilityResource(CreditFacilityService creditFacilityService) {
        this.creditFacilityService = creditFacilityService;
    }

    @GetMapping(path = "/{creditFacilityId}")
    public ResponseEntity<CreditFacilityDTO> getOneCreditFacility(@PathVariable("creditFacilityId") Long creditFacilityId) throws CreditFacilityServiceException {
        CreditFacilityDTO creditFacilityDTO = this.creditFacilityService.getOneCreditFacility(creditFacilityId);
        return new ResponseEntity<>(creditFacilityDTO, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<CreditFacilityDTO>> getAllCreditFacilities() {
        List<CreditFacilityDTO> creditFacilityListDTO = this.creditFacilityService.getAllCreditFacilities();
        return new ResponseEntity<>(creditFacilityListDTO, HttpStatus.OK);
    }

}
