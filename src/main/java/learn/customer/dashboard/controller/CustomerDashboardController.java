package learn.customer.dashboard.controller;

import learn.customer.dashboard.models.DashboardCustomerInfo;
import learn.customer.dashboard.service.DashboardCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard/customer")
public class CustomerDashboardController {

    @Autowired
    DashboardCustomerService dashboardCustomerService;

    @GetMapping("/{id}")
    public DashboardCustomerInfo getDashboardCustomerInfoById(@PathVariable int id){
        return dashboardCustomerService.getDashboardCustomerInfoById(id);
    }
}
