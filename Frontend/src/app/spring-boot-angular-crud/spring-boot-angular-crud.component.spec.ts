import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SpringBootAngularCrudComponent } from './spring-boot-angular-crud.component';

describe('SpringBootAngularCrudComponent', () => {
  let component: SpringBootAngularCrudComponent;
  let fixture: ComponentFixture<SpringBootAngularCrudComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SpringBootAngularCrudComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SpringBootAngularCrudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
