package customerRelations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import customerRelations.entity.Customer;
import customerRelations.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	public String viewAll(Model model) {
		List<Customer> customerList = customerService.viewAll();
		model.addAttribute("customerList", customerList);
		return "Customers";
	}

	@RequestMapping("/save")
	public String saveCustomer(@RequestParam("customer_id") Integer customer_id,
			@RequestParam("first_name") String first_name, @RequestParam("last_name") String last_name,
			@RequestParam("email") String email) {
		Customer cust = null;
		if (customer_id != -1) {
			cust = customerService.findCustomerById(customer_id);
			cust.setFirst_name(first_name);
			cust.setLast_name(last_name);
			cust.setEmail(email);
		} else
			cust = new Customer(first_name, last_name, email);

		customerService.saveCustomer(cust);
		return "redirect:list";
	}

	@RequestMapping("/addCustomer")
	public String addCustomer(@RequestParam("customer_id") Integer customer_id, Model model) {
		/* System.out.println(student_id); */
		Customer st = new Customer();
		if (customer_id != -1)
			st = customerService.findCustomerById(customer_id);
		else
			st.setCustomer_id(-1);
		model.addAttribute("customer", st);
		return "CustomerAddForm";
	}

	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customer_id") Integer customer_id) {
		Customer st = null;
		if (customer_id != -1) {
			st = customerService.findCustomerById(customer_id);
			customerService.deleteCustomer(st);
		}
		return "redirect:list";
	}
}
