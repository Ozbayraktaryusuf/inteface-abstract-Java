package com.turkcell.Abstract;

import com.turkcell.entities.Customer;

public  class BaseCustomerManager implements ICustomerService{

    @Override
    public void saveToDatabase(Customer customer) {
        System.out.println("Saved to db:"+customer.getName());
    }
}
