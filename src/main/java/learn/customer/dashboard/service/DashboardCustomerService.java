package learn.customer.dashboard.service;

import learn.customer.dashboard.models.CustomerInfo;
import learn.customer.dashboard.models.DashboardCustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DashboardCustomerService {

    @Autowired
    RestTemplate restTemplate;

    public DashboardCustomerInfo getDashboardCustomerInfoById(int id) {
        CustomerInfo customerInfo = restTemplate.getForObject("https://microservice-customer-info.herokuapp.com/customer/1", CustomerInfo.class);
        DashboardCustomerInfo dashboardCustomerInfo = new DashboardCustomerInfo();
        dashboardCustomerInfo.setId(id);
        dashboardCustomerInfo.setName(customerInfo.getName());
        return dashboardCustomerInfo;
    }
}
