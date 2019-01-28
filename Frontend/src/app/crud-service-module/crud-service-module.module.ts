import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

// service
import { CustomerServiceService } from './customer-service.service';

@NgModule({
  imports: [
    CommonModule
  ],

  providers:[ CustomerServiceService ],

  declarations: []
})

export class CrudServiceModuleModule { }
