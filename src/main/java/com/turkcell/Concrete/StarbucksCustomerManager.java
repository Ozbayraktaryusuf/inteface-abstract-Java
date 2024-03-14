package com.turkcell.Concrete;

import com.turkcell.Abstract.BaseCustomerManager;
import com.turkcell.Abstract.ICustomerCheckService;
import com.turkcell.Abstract.ICustomerService;
import com.turkcell.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager
{
    ICustomerCheckService iCustomerCheckService;
    public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
        this.iCustomerCheckService=customerCheckService;
    }
    @Override
    public void saveToDatabase(Customer customer) {
        if (iCustomerCheckService.CheckIFRealPerson(customer)) {
            super.saveToDatabase(customer);
        }
        else {
            System.out.println("Not a valid person");
        }
    }

}
