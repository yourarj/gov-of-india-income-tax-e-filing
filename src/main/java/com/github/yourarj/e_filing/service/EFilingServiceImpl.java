package com.github.yourarj.e_filing.service;

import com.github.yourarj.e_filing.gov.bulk_itr.BulkItrRequest;
import com.github.yourarj.e_filing.gov.bulk_itr.BulkItrResponse;
import com.github.yourarj.e_filing.gov.bulk_itr.BulkItrService;
import com.github.yourarj.e_filing.gov.bulk_itr.BulkItrService_Service;
import com.github.yourarj.e_filing.gov.bulk_pan.BulkPanRequest;
import com.github.yourarj.e_filing.gov.bulk_pan.BulkPanResponse;
import com.github.yourarj.e_filing.gov.bulk_pan.BulkPanService;
import com.github.yourarj.e_filing.gov.bulk_pan.BulkPanService_Service;
import com.github.yourarj.e_filing.gov.evc_thru_bank_atm.BankAtmGenEvcRequest;
import com.github.yourarj.e_filing.gov.evc_thru_bank_atm.BankAtmGenEvcResponse;
import com.github.yourarj.e_filing.gov.evc_thru_bank_atm.BankAtmGenEvcService;
import com.github.yourarj.e_filing.gov.evc_thru_bank_atm.BankAtmGenEvcService_Service;
import com.github.yourarj.e_filing.gov.itrv_by_ackno.GetItrVByAckNoRequest;
import com.github.yourarj.e_filing.gov.itrv_by_ackno.GetItrVByAckNoService;
import com.github.yourarj.e_filing.gov.itrv_by_ackno.GetItrVByAckNoService_Service;
import com.github.yourarj.e_filing.gov.itrv_by_ackno.ItrVStatusAckNoResponse;
import com.github.yourarj.e_filing.gov.itrv_by_tokenno.GetItrVByTokenNoRequest;
import com.github.yourarj.e_filing.gov.itrv_by_tokenno.GetItrVByTokenNoService;
import com.github.yourarj.e_filing.gov.itrv_by_tokenno.GetItrVByTokenNoService_Service;
import com.github.yourarj.e_filing.gov.itrv_by_tokenno.ItrVStatustokenNoResponse;
import com.github.yourarj.e_filing.gov.return_status.ReturnStatusRequest;
import com.github.yourarj.e_filing.gov.return_status.ReturnStatusResponse;
import com.github.yourarj.e_filing.gov.return_status.ReturnStatusService;
import com.github.yourarj.e_filing.gov.return_status.ReturnStatusService_Service;
import com.github.yourarj.e_filing.util.Constants;
import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EFilingServiceImpl implements EFilingService {

    private final Bus bulkItrBus;
    private final Bus bulkPanBus;
    private final Bus evcThruBankAtmBus;
    private final Bus itrvByAckBus;
    private final Bus itrvByTokenBus;
    private final Bus returnStatusBus;

    @Autowired
    public EFilingServiceImpl(
            @Qualifier(Constants.BUS_BULK_ITR) Bus bulkItrBus,
            @Qualifier(Constants.BUS_BULK_PAN) Bus bulkPanBus,
            @Qualifier(Constants.BUS_EVC_THRU_BANK_ATM) Bus evcThruBankAtmBus,
            @Qualifier(Constants.BUS_ITR_BY_ACK) Bus itrvByAckBus,
            @Qualifier(Constants.BUS_ITR_BY_TOKEN) Bus itrvByTokenBus,
            @Qualifier(Constants.BUS_RETURN_STATUS) Bus returnStatusBus
    ) {
        this.bulkItrBus = bulkItrBus;
        this.bulkPanBus = bulkPanBus;
        this.evcThruBankAtmBus = evcThruBankAtmBus;
        this.itrvByAckBus = itrvByAckBus;
        this.itrvByTokenBus = itrvByTokenBus;
        this.returnStatusBus = returnStatusBus;
    }

    @Override
    public BulkItrResponse doBulkItrRequest(){
        BusFactory.setThreadDefaultBus(bulkItrBus);

        BulkItrService_Service ss = new BulkItrService_Service();
        BulkItrService port = ss.getPort(BulkItrService.class);

        BulkItrRequest ditRequest = new BulkItrRequest();
        BulkItrResponse resp = port.uploadBulkItr(ditRequest);

        return resp;
    }

    @Override
    public BulkPanResponse doBulkPanRequest() {

        BusFactory.setThreadDefaultBus(bulkPanBus);

        BulkPanService_Service ss = new BulkPanService_Service();
        BulkPanService port = ss.getPort(BulkPanService.class);

        BulkPanRequest ditRequest = new BulkPanRequest();
        BulkPanResponse resp = port.uploadBulkPan(ditRequest);

        return resp;
    }

    @Override
    public BankAtmGenEvcResponse doEvcThruBankAtm(){

        BusFactory.setThreadDefaultBus(evcThruBankAtmBus);

        BankAtmGenEvcService_Service ss = new BankAtmGenEvcService_Service();
        BankAtmGenEvcService port = ss.getPort(BankAtmGenEvcService.class);

        BankAtmGenEvcRequest ditRequest = new BankAtmGenEvcRequest();

        BankAtmGenEvcResponse resp = port.getBankAtmGenEvcDetails(ditRequest);

        return resp;
    }


    @Override
    public ItrVStatusAckNoResponse getItrVByAckNo() {
        BusFactory.setThreadDefaultBus(itrvByAckBus);

        GetItrVByAckNoService_Service ss = new GetItrVByAckNoService_Service();
        GetItrVByAckNoService port = ss.getPort(GetItrVByAckNoService.class);

        GetItrVByAckNoRequest ditRequest = new GetItrVByAckNoRequest();
        ItrVStatusAckNoResponse resp = port.getItrV(ditRequest);

        return resp;
    }

    @Override
    public ItrVStatustokenNoResponse getItrVByTokenNo(){

        BusFactory.setThreadDefaultBus(itrvByTokenBus);

        GetItrVByTokenNoService_Service ss = new GetItrVByTokenNoService_Service();
        GetItrVByTokenNoService port = ss.getPort(GetItrVByTokenNoService.class);

        GetItrVByTokenNoRequest ditRequest = new GetItrVByTokenNoRequest();
        ItrVStatustokenNoResponse resp = port.getItrV(ditRequest);

        return resp;
    }

    @Override
    public ReturnStatusResponse getReturnStatus(){

        BusFactory.setThreadDefaultBus(returnStatusBus);

        ReturnStatusService_Service ss = new ReturnStatusService_Service();
        ReturnStatusService port = ss.getPort(ReturnStatusService.class);

        ReturnStatusRequest ditRequest = new ReturnStatusRequest();
        ReturnStatusResponse resp = port.getReturnStatus(ditRequest);
        return resp;
    }
}
