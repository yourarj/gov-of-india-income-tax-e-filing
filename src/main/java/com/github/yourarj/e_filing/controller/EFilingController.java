package com.github.yourarj.e_filing.controller;

import com.github.yourarj.e_filing.gov.bulk_itr.BulkItrResponse;
import com.github.yourarj.e_filing.gov.bulk_pan.BulkPanResponse;
import com.github.yourarj.e_filing.gov.evc_thru_bank_atm.BankAtmGenEvcResponse;
import com.github.yourarj.e_filing.gov.itrv_by_ackno.ItrVStatusAckNoResponse;
import com.github.yourarj.e_filing.gov.itrv_by_tokenno.ItrVStatustokenNoResponse;
import com.github.yourarj.e_filing.gov.return_status.ReturnStatusResponse;
import com.github.yourarj.e_filing.service.EFilingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.github.yourarj.e_filing.util.Constants.*;

@RestController
public class EFilingController {

    private final EFilingService eFilingService;

    @Autowired
    public EFilingController(EFilingService eFilingService) {
        this.eFilingService = eFilingService;
    }

    @PostMapping(path = MAPPING_BULK_ITR)
    protected BulkItrResponse doBulkItrRequest() {
        return eFilingService.doBulkItrRequest();
    }

    @PostMapping(path = MAPPING_BULK_PAN)
    protected BulkPanResponse doBulkPanRequest() {
        return eFilingService.doBulkPanRequest();
    }

    @PostMapping(path = MAPPING_EVC_THRU_BANK_ATM)
    protected BankAtmGenEvcResponse doEvcThruBankAtm() {
        return eFilingService.doEvcThruBankAtm();
    }

    @PostMapping(path = MAPPING_ITR_BY_ACK)
    protected ItrVStatusAckNoResponse getItrVByAckNo() {
        return eFilingService.getItrVByAckNo();
    }

    @PostMapping(path = MAPPING_ITR_BY_TOKEN)
    protected ItrVStatustokenNoResponse getItrVByTokenNo() {
        return eFilingService.getItrVByTokenNo();
    }

    @PostMapping(path = MAPPING_RETURN_STATUS)
    protected ReturnStatusResponse getReturnStatus() {
        return eFilingService.getReturnStatus();
    }
}
