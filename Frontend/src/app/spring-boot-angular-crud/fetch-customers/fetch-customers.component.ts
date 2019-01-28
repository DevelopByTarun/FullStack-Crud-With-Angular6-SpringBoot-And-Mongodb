import { Component, OnInit } from '@angular/core';
import { CustomerServiceService } from '../../crud-service-module/customer-service.service';
import { Customer } from '../models/customer';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';

@Component({
  selector: 'app-fetch-customers',
  templateUrl: './fetch-customers.component.html',
  styleUrls: ['./fetch-customers.component.css']
})
export class FetchCustomersComponent implements OnInit {

  public allCustomers:Customer[];

  public editCustomer:Customer = new Customer();

  constructor(private router:Router, private customerService:CustomerServiceService) { }

  callFetchCustomers() {
    this.customerService.fetchCustomers().subscribe(
      (data)=> {
        this.allCustomers = data;
        console.log('Successfully Fetch Customers');
        console.log(data);
      },
      (error)=> {
        console.log('Unable To Fetch Customers');
        console.log(error);
      }
    );
  }

  callEditCustomer(id:string) {
    this.customerService.editCustomerById(id).subscribe(
      (editdata)=> {
        this.editCustomer = editdata;
        localStorage.setItem('objectToken', JSON.stringify(this.editCustomer));
        this.router.navigate(['/updatecust']);
        console.log('Successfully Edit Customer Id :: '+editdata.id);
      },
      (error)=> {
        Swal({
          type: 'error',
          title: '<i>Error!</i>',
          text: 'Unable To Edit Customer!',
          confirmButtonText: '<i class="fa fa-thumbs-down"></i> Sorry!',
          confirmButtonAriaLabel: 'Thumbs down',
          buttonsStyling: false,
          confirmButtonClass: 'btn btn-dark btn-lg'
        });
        console.log('Unable To Edit Customer');
        console.log(error);
      }
    );
  }

  callDeleteCustomer(id:string) {
    this.customerService.deleteCustomer(id).subscribe(
      (success)=> {
        Swal({
          type: 'success',
          title: '<i>Success!</i>',
          text: 'Successfully Delete Customer Id '+id,
          confirmButtonText: '<i class="fa fa-thumbs-up"></i> Great!',
          confirmButtonAriaLabel: 'Thumbs up, great!',
          buttonsStyling: false,
          confirmButtonClass: 'btn btn-danger btn-lg'
        });
        this.router.navigate(['/']);
        console.log('Successfully Delete Customer Id :: '+id);
      },
      (error)=> {
        Swal({
          type: 'error',
          title: '<i>Error!</i>',
          text: 'Unable To Delete Customer!',
          confirmButtonText: '<i class="fa fa-thumbs-down"></i> Sorry!',
          confirmButtonAriaLabel: 'Thumbs down',
          buttonsStyling: false,
          confirmButtonClass: 'btn btn-dark btn-lg'
        });
        console.log('Unable To Delete Customer');
      }
    );
  }

  ngOnInit() {
    this.callFetchCustomers();
  }

}
