package com.xworkz.spotify.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SpotifyDto;

@Repository
public class SpootifyRepoImpl implements SpotifyRepo {
	
	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean saveSong(SpotifyDto dto) {
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		
		return true;
	}

	@Override
	public List<SpotifyDto> read() {
		
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("read");
		List<SpotifyDto> dto = query.getResultList();
		
		return dto;
	}

	@Override
	public SpotifyDto findBySongName(String songName, Model model)throws NoResultException {
		EntityManager em = emf.createEntityManager();
		TypedQuery<SpotifyDto> query = em.createNamedQuery("find" , SpotifyDto.class);
		query.setParameter("snm", songName);
		SpotifyDto dtos = query.getSingleResult();
		return dtos;
	}

	@Override
	public boolean updateRatingsBySongName(String songName, float ratings, Model model) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("update");
		query.setParameter("sn", songName);
		query.setParameter("rt", ratings);
		int i = query.executeUpdate();
		try {
			em.getTransaction().commit();
			if(i>0) {
				System.out.println("Ratings Updated");
				return true;
			}	
		} catch (Exception e) {
			em.getTransaction().rollback();
			
			e.printStackTrace();
			return false;
		}
		finally {
			System.out.println("Closing Resource");
			em.close();
		}
		
		return false;
	}

	@Override
	public boolean deleteBySongName(String songName, Model model) {
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("delete");
		query.setParameter("sn", songName);
		int i = query.executeUpdate();
		try {
			em.getTransaction().commit();
			if(i>0) {
				System.out.println("Deleted Successfully");
				return true;
			}	
		} catch (Exception e) {
			em.getTransaction().rollback();
			
			e.printStackTrace();
			return false;
		}
		finally {
			System.out.println("Closing Resource");
			em.close();
		}
		
		return false;
	}

}
