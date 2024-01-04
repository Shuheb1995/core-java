package com.xworkz.taxi.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.xworkz.taxi.dto.TaxiDto;

public class TaxiRepoImpl implements TaxiRepo {
	
	private static final int List = 0;
	private static final int TaxiDto = 0;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Taxi-connection");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public boolean saveTaxi(TaxiDto dto) {
		
		if(em!=null) {
			EntityTransaction transact = em.getTransaction();
			transact.begin();
			em.persist(dto);
			transact.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<TaxiDto> readAll() {
		
		Query query = em.createNamedQuery("readAll");
		return query.getResultList();
	}

	@Override
	public boolean updateTaxiEarnings(String taxiNumber, String earnings) {
		
		if(em!=null) {
			EntityTransaction transact = em.getTransaction();
			transact.begin();
			Query query = em.createNamedQuery("updateTaxiEarnings");
			query.setParameter("tn", taxiNumber);
			query.setParameter("ern", earnings);
			query.executeUpdate();
			
			transact.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean updateTaxiAvailabeById(int id,boolean isAvailable) {
		
		if(em!=null) {
			EntityTransaction transact = em.getTransaction();
			transact.begin();
			Query query = em.createNamedQuery("updateTaxiAvailableById");
			query.setParameter("id", id);
			query.setParameter("ia", isAvailable);
			query.executeUpdate();
			
			transact.commit();
			return true;
		}
		return false;
	}

	@Override
	public TaxiDto findTaxiByLocation(String location) {
		
		TypedQuery<TaxiDto> query = em.createNamedQuery("find", TaxiDto.class);
		query.setParameter("lcn", location);
		TaxiDto dto = query.getSingleResult();
		return dto;
	}

	@Override
	public List<TaxiDto> findAllTaxiAvailable() {
		
	TypedQuery<TaxiDto> query = em.createNamedQuery("findAllAvailableTaxis" , TaxiDto.class);
	query.setParameter("ia", true);
	List<TaxiDto> list = query.getResultList();
	
		return list;
	}

	@Override
	public TaxiDto bookTaxi(String taxiNumber) {
		
		Query query = em.createNamedQuery("bookTaxi");
		return (TaxiDto) query.getSingleResult();
		
		 
	}

}
