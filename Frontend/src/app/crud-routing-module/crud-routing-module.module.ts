import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

// routing or spa
import { RouterModule } from '@angular/router';
import { Routes } from '@angular/router';

// components for routing
import { HomeComponent } from '../spring-boot-angular-crud/home/home.component';
import { AddCustomerComponent } from '../spring-boot-angular-crud/add-customer/add-customer.component';
import { UpdateCustomerComponent } from '../spring-boot-angular-crud/update-customer/update-customer.component';
import { FetchCustomersComponent } from '../spring-boot-angular-crud/fetch-customers/fetch-customers.component';

export const routing:Routes = [

  { path: '', component: HomeComponent },

  { path: 'addcust', component: AddCustomerComponent },

  { path: 'getcust', component: FetchCustomersComponent },

  { path: 'updatecust', component: UpdateCustomerComponent },

  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [
    CommonModule, RouterModule.forRoot(routing)
  ],
  exports: [ RouterModule ],
  declarations: []
})

export class CrudRoutingModuleModule { }
