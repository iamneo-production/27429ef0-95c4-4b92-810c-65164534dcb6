import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { CustomerReviewComponent } from './customerreview.component';

describe('CustomerReviewComponent', () => {
  let component: CustomerReviewComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [CustomerReviewComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(CustomerReviewComponent);
    component = fixture.componentInstance;
  });
  it('FE_customerReviewTest', () => {
    expect(component).toBeTruthy();
  });
});