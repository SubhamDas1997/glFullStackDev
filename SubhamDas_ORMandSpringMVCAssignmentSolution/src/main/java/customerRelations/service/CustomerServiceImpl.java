package customerRelations.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import customerRelations.entity.Customer;

@Repository
public class CustomerServiceImpl implements CustomerService {

	private SessionFactory sessionfactory;
	private Session session;

	public CustomerServiceImpl(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
		try {
			session = this.sessionfactory.getCurrentSession();
		} catch (HibernateException e) {
			session = this.sessionfactory.openSession();
			e.printStackTrace();
		}
	}

	@Transactional
	public List<Customer> viewAll() {
		@SuppressWarnings("unchecked")
		List<Customer> customerList = session.createQuery("from Customer").list();
		return customerList;
	}

	@Transactional
	public Customer findCustomerById(Integer customer_id) {
		Customer customer = session.get(Customer.class, customer_id);
		return customer;
	}

	@Transactional
	public void saveCustomer(Customer cust) {
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(cust);
		tr.commit();
	}

	@Transactional
	public void deleteCustomer(Customer cust) {
		Transaction tr = session.beginTransaction();
		session.delete(cust);
		tr.commit();
	}
}
