package com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO;
import com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.modal.Customer;
import com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerDAO {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public boolean saveCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.save(customer) != null;
	}

	@Override
	public List<Customer> getAllCustomers() throws Exception {
		// TODO Auto-generated method stub
		List<Customer> customerList = new ArrayList<Customer>();
		customerRepository.findAll().forEach(cust-> customerList.add(cust));
		return customerList;
	}
	
	@Override
	public void updateCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		Customer getCustomer = customerRepository.findById(customer.getId()).get();
		getCustomer.setName(customer.getName());
		getCustomer.setAge(customer.getAge());
		getCustomer.setCity(customer.getCity());
		getCustomer.setPincode(customer.getPincode());
		customerRepository.save(getCustomer);
	}

	@Override
	public void deleteCustomer(String id) throws Exception {
		// TODO Auto-generated method stub
		customerRepository.delete(getCustomer(id));
	}

	@Override
	public Customer getCustomer(String id) throws Exception {
		// TODO Auto-generated method stub
		Customer getCustomer = customerRepository.findById(id).get();
		return getCustomer;
	}	
}
