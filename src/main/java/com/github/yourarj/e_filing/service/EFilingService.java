package com.github.yourarj.e_filing.service;

import com.github.yourarj.e_filing.gov.bulk_itr.BulkItrResponse;
import com.github.yourarj.e_filing.gov.bulk_pan.BulkPanResponse;
//import com.github.yourarj.e_filing.gov.bulk_pan.DitResponse; 
import com.github.yourarj.e_filing.gov.evc_thru_bank_atm.BankAtmGenEvcResponse;
import com.github.yourarj.e_filing.gov.itrv_by_ackno.ItrVStatusAckNoResponse;
import com.github.yourarj.e_filing.gov.itrv_by_tokenno.ItrVStatustokenNoResponse;
import com.github.yourarj.e_filing.gov.return_status.ReturnStatusResponse;

//import java.net.MalformedURLException;

public interface EFilingService {
    BulkItrResponse doBulkItrRequest();

    BulkPanResponse doBulkPanRequest();

    BankAtmGenEvcResponse doEvcThruBankAtm();

    ItrVStatusAckNoResponse getItrVByAckNo();

    ItrVStatustokenNoResponse getItrVByTokenNo();

    ReturnStatusResponse getReturnStatus();
}
