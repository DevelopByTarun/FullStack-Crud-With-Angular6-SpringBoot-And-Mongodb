package com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO;
import com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.modal.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {
	
	@Autowired
	private ICustomerDAO customerDAO;
	
	@PostMapping("/create")
	public ResponseEntity<Void> callSaveCustomer(@RequestBody Customer customer, UriComponentsBuilder builder) throws Exception {
		boolean flag = customerDAO.saveCustomer(customer);
		if(flag == false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/create?id={id}").buildAndExpand(customer.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Customer> callUpdateCustomer(@RequestBody Customer customer) throws Exception {
		customerDAO.updateCustomer(customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}	
	
	@DeleteMapping("/delete")
	public ResponseEntity<Void> callDeleteCustomer(@RequestParam("id") String id) throws Exception {
		customerDAO.deleteCustomer(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/edit")
	public ResponseEntity<Customer> callGetCustomer(@RequestParam("id") String id) throws Exception {
		Customer customer = customerDAO.getCustomer(id);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@GetMapping("/fetch")
	public ResponseEntity<List<Customer>> getAllCustomers() throws Exception {
		List<Customer> customersList = customerDAO.getAllCustomers();
		return new ResponseEntity<List<Customer>>(customersList, HttpStatus.OK);
	}	
}
