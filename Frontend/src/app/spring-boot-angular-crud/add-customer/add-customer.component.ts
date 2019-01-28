import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerServiceService } from '../../crud-service-module/customer-service.service';
import { Customer } from '../models/customer';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})

export class AddCustomerComponent implements OnInit {

  public addCustomer:Customer = new Customer();

  constructor(private router:Router, private customerService:CustomerServiceService) { }

  callCreateCustomer() {
    this.customerService.createCustomer(this.addCustomer).subscribe(
      (error)=> {
        Swal({
          type: 'error',
          title: '<i>Error!</i>',
          text: 'Unable To Add Customer!',
          confirmButtonText: '<i class="fa fa-thumbs-down"></i> Sorry!',
          confirmButtonAriaLabel: 'Thumbs down',
          buttonsStyling: false,
          confirmButtonClass: 'btn btn-dark btn-lg'
        });
        const resetAdd = document.querySelector('.resetClass') as HTMLInputElement;
        resetAdd.value = '';
        console.log('Unable To Add Customer');
        console.log(this.addCustomer);
      },
      (success)=> {
        Swal({
          type: 'success',
          title: '<i>Success!</i>',
          text: 'Successfully Add Customer!',
          confirmButtonText: '<i class="fa fa-thumbs-up"></i> Great!',
          confirmButtonAriaLabel: 'Thumbs up, great!',
          buttonsStyling: false,
          confirmButtonClass: 'btn btn-success btn-lg'
        });
        this.router.navigate(['/']);
        console.log('Successfully Add Customer');
        console.log(this.addCustomer);
      }
    );
  }

  ngOnInit() {
  }

}
