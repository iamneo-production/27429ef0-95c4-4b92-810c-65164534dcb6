import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { AdminApprovalFormComponent } from './adminapprovalform.component';

describe('AdminApprovalFormComponent', () => {
  let component: AdminApprovalFormComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [AdminApprovalFormComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(AdminApprovalFormComponent);
    component = fixture.componentInstance;
  });
  it('FE_adminApprovalFormTest', () => {
    expect(component).toBeTruthy();
  });
});