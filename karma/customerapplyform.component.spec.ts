import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { CustomerApplyFormComponent } from './customerapplyform.component';

describe('CustomerApplyFormComponent', () => {
  let component: CustomerApplyFormComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [CustomerApplyFormComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(CustomerApplyFormComponent);
    component = fixture.componentInstance;
  });
  it('FE_customerApplyFormTest', () => {
    expect(component).toBeTruthy();
  });
});