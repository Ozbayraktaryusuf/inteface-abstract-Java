package com.turkcell;

import com.turkcell.Abstract.BaseCustomerManager;
import com.turkcell.Abstract.ICustomerCheckService;
import com.turkcell.Concrete.CustomerCheckManager;
import com.turkcell.Concrete.NeroCustomerManager;
import com.turkcell.Concrete.StarbucksCustomerManager;
import com.turkcell.entities.Customer;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager customerManager= new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager.saveToDatabase(new Customer(1,"Engin","Demiroğ",new Date(1985,1,6),"aaaa"));
        BaseCustomerManager customerManager1=new NeroCustomerManager();
        Customer customer1=new Customer();
        customer1.setName("Yusuf");
        customerManager1.saveToDatabase(customer1);
    }
}