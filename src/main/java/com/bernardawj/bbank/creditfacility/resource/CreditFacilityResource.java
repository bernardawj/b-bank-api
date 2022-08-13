package com.bernardawj.bbank.creditfacility.resource;

import com.bernardawj.bbank.creditfacility.dto.CreateCreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.dto.CreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.service.CreditFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ResponseEntity<CreditFacilityDTO> getOneCreditFacility(@PathVariable("creditFacilityId") Long creditFacilityId) {
        CreditFacilityDTO creditFacilityDTO = this.creditFacilityService.getOneCreditFacility(creditFacilityId);
        return new ResponseEntity<>(creditFacilityDTO, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<CreditFacilityDTO>> getAllCreditFacilities() {
        List<CreditFacilityDTO> creditFacilityListDTO = this.creditFacilityService.getAllCreditFacilities();
        return new ResponseEntity<>(creditFacilityListDTO, HttpStatus.OK);
    }

    @PostMapping(path = "/open")
    public ResponseEntity<CreditFacilityDTO> openCreditFacilityForApplicant(@RequestBody @Valid CreateCreditFacilityDTO createCreditFacilityDTO) {
        CreditFacilityDTO createdCreditFacilityDTO = this.creditFacilityService.openCreditFacilityForApplicant(createCreditFacilityDTO);
        return new ResponseEntity<>(createdCreditFacilityDTO, HttpStatus.CREATED);
    }

}
