package com.xworkz.employee.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.xworkz.employee.dto.EmployeeDto;

@Component
public class EmployeeRepoImpl implements EmployeeRepo {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee-connection");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public boolean save(EmployeeDto dto) {
		
		if(em!=null) {
			EntityTransaction transact = em.getTransaction();
			transact.begin();
			em.persist(dto);
			transact.commit();
			System.out.println("data Saved Successfully");
			return true;
		}
		return false;
	}

	@Override
	public EmployeeDto find(String name) {

		TypedQuery<EmployeeDto> query = em.createNamedQuery("find" , EmployeeDto.class);
		query.setParameter("nm", name);
		EmployeeDto dto = query.getSingleResult();
		System.out.println("Dto Found");
		return dto;
	}

	@Override
	public boolean updateMobileNumberByName(String name, long mobileNumber) {
		
		EntityTransaction transact = em.getTransaction();
		transact.begin();
		Query query = em.createNamedQuery("update");
		query.setParameter("nm", name);
		query.setParameter("mn", mobileNumber);
		query.executeUpdate();
		transact.commit();
		
		return true;
	}

	@Override
	public boolean deleteByName(String name) {
		
		EntityTransaction transact = em.getTransaction();
		transact.begin();
		Query query = em.createNamedQuery("delete");
		query.setParameter("nm", name);
		query.executeUpdate();
		
		transact.commit();
		
		return true;
	}

	@Override
	public List<EmployeeDto> readAll() {
		Query query = em.createNamedQuery("read");
		return query.getResultList();
	}

}
