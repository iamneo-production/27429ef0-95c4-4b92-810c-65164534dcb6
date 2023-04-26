import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { LoanStatusComponent } from './loanstatus.component';

describe('LoanStatusComponent', () => {
  let component: LoanStatusComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [LoanStatusComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(LoanStatusComponent);
    component = fixture.componentInstance;
  });
  it('FE_loanStatusTest', () => {
    expect(component).toBeTruthy();
  });
});