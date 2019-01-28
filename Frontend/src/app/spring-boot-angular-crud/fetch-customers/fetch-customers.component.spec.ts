import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FetchCustomersComponent } from './fetch-customers.component';

describe('FetchCustomersComponent', () => {
  let component: FetchCustomersComponent;
  let fixture: ComponentFixture<FetchCustomersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FetchCustomersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FetchCustomersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
