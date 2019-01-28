import { Injectable } from '@angular/core';
import { Http, Response, Headers, URLSearchParams, RequestOptions } from '@angular/http';
import { Observable, throwError } from 'rxjs';
import { map, catchError } from 'rxjs/operators';
import { Customer } from '../spring-boot-angular-crud/models/customer';

@Injectable()
export class CustomerServiceService {

  // URLs for CRUD operations
  private addCustomerUrl = 'http://localhost:9191/api/customer/create';

  private updateCustomerUrl = 'http://localhost:9191/api/customer/update';

  private deleteCustomerUrl = 'http://localhost:9191/api/customer/delete';

  private editCustomerUrl = 'http://localhost:9191/api/customer/edit';

  private fetchCustomersUrl = 'http://localhost:9191/api/customer/fetch';

  constructor(private http:Http) { }

  private handleError(wrong:Response | any) {
    console.log(wrong.message || wrong);
    return throwError("Something Wrong In Ajax Call :: ",wrong);
  }

  private extractData(risk:Response) {
    const output = risk.json();
    return output;
  }

  // create customer
  createCustomer(customerObject:Customer):Observable<number> {
    let ajaxHeaders = new Headers({ 'Content-Type': 'application/json' });
    let ajaxOptions = new RequestOptions({ headers: ajaxHeaders });
    return this.http.post(this.addCustomerUrl, customerObject, ajaxOptions).pipe(
      map((response:any) => response.json()), catchError(this.handleError)
    );
  }

  // fetch customers
  fetchCustomers():Observable<Customer[]> {
    return this.http.get(this.fetchCustomersUrl).pipe(
      map(this.extractData), catchError(this.handleError)
    );
  }

  // edit customers
  editCustomerById(id:string):Observable<Customer> {
    const ajaxHeaders = new Headers({ 'Content-Type': 'application/json' });
    const ajaxParams = new URLSearchParams();
    ajaxParams.set('id', id);
    const manyWays = new RequestOptions({ headers: ajaxHeaders, params: ajaxParams });
    return this.http.get(this.editCustomerUrl, manyWays).pipe(
      map(this.extractData), catchError(this.handleError)
    );
  }

  // update customers
  updateCustomer(customerObject:Customer):Observable<number> {
    let ajaxHeaders = new Headers({ 'Content-Type': 'application/json' });
    let ajaxOptions = new RequestOptions({ headers: ajaxHeaders });
    return this.http.post(this.updateCustomerUrl, customerObject, ajaxOptions).pipe(
      map((response:any) => response.json()), catchError(this.handleError)
    );
  }

  // delete customers
  deleteCustomer(id:string):Observable<number> {
    const ajaxHeaders = new Headers({ 'Content-Type': 'application/json' });
    const ajaxParams = new URLSearchParams();
    ajaxParams.set('id', id);
    const manyWays = new RequestOptions({ headers: ajaxHeaders, params: ajaxParams });
    return this.http.delete(this.deleteCustomerUrl, manyWays).pipe(
      map((response:any) => response.json()), catchError(this.handleError)
    );
  }

}
