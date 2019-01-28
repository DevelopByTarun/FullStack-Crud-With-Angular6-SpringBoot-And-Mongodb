import { Component, OnInit } from '@angular/core';
import { CustomerServiceService } from '../../crud-service-module/customer-service.service';
import { Customer } from '../models/customer';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-customer',
  templateUrl: './update-customer.component.html',
  styleUrls: ['./update-customer.component.css']
})
export class UpdateCustomerComponent implements OnInit {

  public updateCustomer:Customer = new Customer();

  constructor(private router:Router, private customerService:CustomerServiceService) {
    this.updateCustomer = JSON.parse(localStorage.getItem('objectToken'));
  }

  callUpdateCustomer() {
    this.customerService.updateCustomer(this.updateCustomer).subscribe(
      (success)=> {
        Swal({
          type: 'success',
          title: '<i>Success!</i>',
          text: 'Successfully Update Customer Id '+this.updateCustomer.id,
          confirmButtonText: '<i class="fa fa-thumbs-up"></i> Great!',
          confirmButtonAriaLabel: 'Thumbs up, great!',
          buttonsStyling: false,
          confirmButtonClass: 'btn btn-info btn-lg'
        });
        localStorage.removeItem('objectToken');
        this.router.navigate(['/']);
        console.log('Successfully Update Customer Id :: '+this.updateCustomer.id);
        console.log(this.updateCustomer);
      },
      (error)=> {
        Swal({
          type: 'error',
          title: '<i>Error!</i>',
          text: 'Unable To Update Customer!',
          confirmButtonText: '<i class="fa fa-thumbs-down"></i> Sorry!',
          confirmButtonAriaLabel: 'Thumbs down',
          buttonsStyling: false,
          confirmButtonClass: 'btn btn-dark btn-lg'
        });
        console.log('Unable To Update Customer');
        console.log(this.updateCustomer);
      }
    );
  }

  ngOnInit() {
  }

}
