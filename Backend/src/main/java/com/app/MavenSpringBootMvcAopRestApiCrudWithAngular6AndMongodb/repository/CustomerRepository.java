package com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.modal.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
