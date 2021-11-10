package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    void update(int id, Customer customer);
    Customer findById(int id);
    void remove(int id);
}
