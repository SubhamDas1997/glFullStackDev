package customerRelations.service;

import java.util.List;

import customerRelations.entity.Customer;

public interface CustomerService {

	public List<Customer> viewAll();

	public Customer findCustomerById(Integer customer_id);

	public void saveCustomer(Customer cust);

	public void deleteCustomer(Customer st);
}
