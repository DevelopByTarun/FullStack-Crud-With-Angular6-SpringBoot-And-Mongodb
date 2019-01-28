import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

// components
import { AppComponent } from './app.component';
import { SpringBootAngularCrudComponent } from './spring-boot-angular-crud/spring-boot-angular-crud.component';
import { AddCustomerComponent } from './spring-boot-angular-crud/add-customer/add-customer.component';
import { UpdateCustomerComponent } from './spring-boot-angular-crud/update-customer/update-customer.component';
import { FetchCustomersComponent } from './spring-boot-angular-crud/fetch-customers/fetch-customers.component';
import { HomeComponent } from './spring-boot-angular-crud/home/home.component';
import { HeaderComponent } from './spring-boot-angular-crud/header/header.component';
import { FooterComponent } from './spring-boot-angular-crud/footer/footer.component';

// forms
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

// ajax call
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from "@angular/http";

// service module
import { CrudServiceModuleModule } from './crud-service-module/crud-service-module.module';

// routing module
import { CrudRoutingModuleModule } from './crud-routing-module/crud-routing-module.module';


@NgModule({
  declarations: [
    AppComponent,
    SpringBootAngularCrudComponent,
    AddCustomerComponent,
    UpdateCustomerComponent,
    FetchCustomersComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    HttpClientModule,
    CrudServiceModuleModule,
    CrudRoutingModuleModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
