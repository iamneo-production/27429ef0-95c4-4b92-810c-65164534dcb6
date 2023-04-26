import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { AdminHomepageComponent } from './adminhomepage.component';

describe('AdminHomepageComponent', () => {
  let component: AdminHomepageComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [AdminHomepageComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(AdminHomepageComponent);
    component = fixture.componentInstance;
  });
  it('FE_adminHomepageTest', () => {
    expect(component).toBeTruthy();
  });
});