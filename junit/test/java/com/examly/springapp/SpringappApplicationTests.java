package com.examly.springapp;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class SpringappApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	// add user
	@Test
	@Transactional
	public void test_case1() throws Exception {
		String newUser = "{\"userId\":\"01\",\"email\":\"testuser@gmail.com\",\"password\":\"test@123\",\"username\":\"testuser\",\"mobileNumber\":\"9876543210\",\"userRole\":\"user\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/user/addUser")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newUser)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// add loan
	@Test
	@Transactional
	public void test_case2() throws Exception {
		String newLoan = "{\"loanId\":\"01\",\"loantype\":\"testloan\",\"applicantName\":\"test_user\",\"applicantAddress\":\"chennai\",\"applicantMobile\":\"9876543210\",\"applicantEmail\":\"testuser@gmail.com\",\"applicantAadhar\":\"356484590214\",\"applicantPan\":\"ABC5657RS\",\"applicantSalary\":\"20000\",\"loanAmountRequired\":\"500000\",\"loanRepaymentMonths\":\"36\",\"loanStatus\":\"Pending\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/loan/addLoan")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newLoan)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// get user by id
	@Test
	@Transactional
	public void test_case3() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/user/getUser/01")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isNotEmpty())
				.andReturn();
	}

	// update loan by id
	@Test
	@Transactional
	public void test_case4() throws Exception {
		String newLoan = "{\"loanId\":\"01\",\"loantype\":\"testloan2\",\"applicantName\":\"test_user2\",\"applicantAddress\":\"cbe\",\"applicantMobile\":\"9876543210\",\"applicantEmail\":\"testuser@gmail.com\",\"applicantAadhar\":\"356484590214\",\"applicantPan\":\"ABC5657RS\",\"applicantSalary\":\"20000\",\"loanAmountRequired\":\"500000\",\"loanRepaymentMonths\":\"36\",\"loanStatus\":\"Pending\"}";
		mockMvc.perform(MockMvcRequestBuilders.put("/loan/editLoan/01")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newLoan)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// get loan by id
	@Test
	@Transactional
	public void test_case5() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/loan/viewloan/01")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isNotEmpty())
				.andReturn();
	}

	// update user by id
	@Test
	@Transactional
	public void test_case6() throws Exception {
		String newUser = "{\"userId\":\"01\",\"email\":\"testuser2@gmail.com\",\"password\":\"test@123\",\"username\":\"testuser2\",\"mobileNumber\":\"9876543210\",\"userRole\":\"user\"}";
		mockMvc.perform(MockMvcRequestBuilders.put("user/editUser/01")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newUser)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// delete user by id
	@Test
	@Transactional
	public void test_case7() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.delete("/user/delete/01")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// delete loan by id
	@Test
	@Transactional
	public void test_case8() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.delete("/loan/deleteloan/01")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

}
