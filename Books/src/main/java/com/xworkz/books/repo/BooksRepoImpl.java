package com.xworkz.books.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.xworkz.books.dto.BooksDto;

@Repository
public class BooksRepoImpl implements BooksRepo {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean save(BooksDto dto) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();

		return false;
	}

	@Override
	public BooksDto findByName(String bookName, Model model) {

		EntityManager em = emf.createEntityManager();
		TypedQuery<BooksDto> query = em.createNamedQuery("find", BooksDto.class);
		query.setParameter("bnm", bookName);
		List<BooksDto> dtos = query.getResultList();
		if (!dtos.isEmpty()) {
			BooksDto dto = query.getSingleResult();
			return dto;
		}

		return null;
	}

	@Override
	public List<BooksDto> read() {

		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("read");
		List<BooksDto> dto = query.getResultList();
		return dto;
	}

}
