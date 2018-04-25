package com.github.yourarj.e_filing.gov.return_status;

import java.io.File;
import java.math.BigInteger;
import java.net.URL;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.bus.spring.SpringBusFactory;

public final class ReturnStatusService_Client {

    private ReturnStatusService_Client() {
    }

    public static void main(String argsMme[]) throws Exception {

        URL wsdlURL = new URL("https://services.incometaxindiaefiling.gov.in/e-FilingSecWS/ditsecws/ReturnStatusService?wsdl");

        SpringBusFactory bf = new SpringBusFactory();
        
        File busFile = new File("return_status/bulk_itr.xml");

        Bus bus = bf.createBus(busFile.toString());
        BusFactory.setDefaultBus(bus);

        System.out.println(wsdlURL);
        ReturnStatusService_Service ss = new ReturnStatusService_Service();
        ReturnStatusService port = ss.getPort(ReturnStatusService.class);

        System.out.println("Invoking ReturnStatusService...");
        try {

            ReturnStatusRequest ditRequest = new ReturnStatusRequest();
            BigInteger BI = new BigInteger("2017");
            ditRequest.setPan("BDBPC4051J");
            ditRequest.setAssessmentYear(BI);
            ditRequest.setUniqueRequestId("ERIA521499-235645");
            ReturnStatusResponse resp = port.getReturnStatus(ditRequest);

            System.out.println("Server responded with: " + resp);
            System.out.println();

        } catch (Exception e) {
            System.out.println("Invocation failed with the following: " + e.getCause());
            System.out.println();
            e.printStackTrace();
        }

        System.exit(0);
    }

}
