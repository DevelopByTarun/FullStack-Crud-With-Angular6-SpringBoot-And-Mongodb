package com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao;

import java.util.List;
import com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.modal.Customer;

public interface ICustomerDAO {
	
	public boolean saveCustomer(Customer customer) throws Exception;
	
	public void updateCustomer(Customer customer) throws Exception;
	
	public void deleteCustomer(String id) throws Exception;
	
	public Customer getCustomer(String id) throws Exception;
					
	public List<Customer> getAllCustomers() throws Exception;
}
