package com.github.yourarj.e_filing.config;

import com.github.yourarj.e_filing.util.Constants;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBusFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SpringBusFactory springBusFactory() {
        return new SpringBusFactory();
    }

    @Bean(name = Constants.BUS_BULK_ITR)
    public Bus bulkItrBus() {
        return springBusFactory()
                .createBus("classpath:client_config/bulk_itr.xml");
    }
    @Bean(name = Constants.BUS_BULK_PAN)
    public Bus bulkPanBus() {
        return springBusFactory()
                .createBus("classpath:client_config/bulk_pan.xml");
    }
    @Bean(name = Constants.BUS_EVC_THRU_BANK_ATM)
    public Bus evcThruBankAtmBus() {
        return springBusFactory()
                .createBus("classpath:client_config/evc_thru_bank_atm.xml");
    }
    @Bean(name = Constants.BUS_ITR_BY_ACK)
    public Bus itrByAckBus() {
        return springBusFactory()
                .createBus("classpath:client_config/itrv_by_ackno.xml");
    }
    @Bean(name = Constants.BUS_ITR_BY_TOKEN)
    public Bus itrByTokenBus() {
        return springBusFactory()
                .createBus("classpath:client_config/itrv_by_tokenno.xml");
    }
    @Bean(name = Constants.BUS_RETURN_STATUS)
    public Bus returnStatusBus() {
        return springBusFactory()
                .createBus("classpath:client_config/return_status.xml");
    }


}
