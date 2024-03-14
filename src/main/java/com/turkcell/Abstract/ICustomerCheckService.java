package com.turkcell.Abstract;

import com.turkcell.entities.Customer;

public interface ICustomerCheckService {
    public boolean CheckIFRealPerson(Customer customer);
}
