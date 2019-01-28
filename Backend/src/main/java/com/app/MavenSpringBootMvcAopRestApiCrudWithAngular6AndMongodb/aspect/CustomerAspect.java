package com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.aspect;

import java.util.Date;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class CustomerAspect {
	
	private Logger logger = Logger.getLogger(CustomerAspect.class);
	
	private long startTime;
	
	private long endTime;
	
	@Pointcut("execution(* com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO.*(..))")
	public void applyPointcutDate() {
	}
	
	@Before("applyPointcutDate()")
	public void showExecutionDate() {
		System.out.println("");
		logger.debug("");
		System.out.println("Method Is Calling On :: "+ new Date());
		logger.debug("Method Is Calling On :: "+ new Date());
		logger.debug("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO.saveCustomer(..))")
	public void showStartTimeOfSaveCustomer(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO.saveCustomer(..))")
	public void showEndTimeOfSaveCustomer(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO.deleteCustomer(..))")
	public void showStartTimeOfDeleteCustomer(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO.deleteCustomer(..))")
	public void showEndTimeOfDeleteCustomer(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO.getAllCustomers(..))")
	public void showStartTimeOfGetAllCustomers(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO.getAllCustomers(..))")
	public void showEndTimeOfGetAllCustomers(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO.updateCustomer(..))")
	public void showStartTimeOfUpdateCustomer(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO.updateCustomer(..))")
	public void showEndTimeOfUpdateCustomer(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}

	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO.getCustomer(..))")
	public void showStartTimeOfGetCustomer(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithAngular6AndMongodb.dao.ICustomerDAO.getCustomer(..))")
	public void showEndTimeOfGetCustomer(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}	
}
