package com.xworkz.payingguest.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.payingguest.config.PayingGuestConfig;
import com.xworkz.payingguest.dto.PayingGuestDto;

public class PayingGuestRepoImpl implements PayingGuestRepo {

	SessionFactory factory = PayingGuestConfig.getSessionFactory();

	@Override
	public boolean save(PayingGuestDto dto) {

		Session session = factory.openSession();

		Transaction transact = session.getTransaction();

		transact.begin();

		session.save(dto);

		transact.commit();
		session.close();

		return true;
	}

	@Override
	public PayingGuestDto findbyName(String name) {

		Session session = factory.openSession();

		String query = "from PayingGuestDto where pgName = " + name;

		Query<PayingGuestDto> query1 = session.createQuery(query, PayingGuestDto.class);

		PayingGuestDto dto = query1.getSingleResult();

		return dto;
	}

	@Override
	public boolean updateByName(String name, String location) {

		Session session = factory.openSession();

		Transaction transact = session.getTransaction();
		transact.begin();

		String query = "from PayingGuestDto where pgName = " + name;

		Query<PayingGuestDto> query1 = session.createQuery(query, PayingGuestDto.class);

		PayingGuestDto dto = query1.getSingleResult();

		dto.getPgName();

		dto.setLocation(location);

		session.update(dto);

		transact.commit();
		session.close();

		return true;
	}

	@Override
	public List<PayingGuestDto> readAll() {

		Session session = factory.openSession();

		Query query = session.createQuery("from PayingGuestDto", PayingGuestDto.class);

		List<PayingGuestDto> list = query.list();

		for (PayingGuestDto dto : list) {
			System.out.println(dto);
		}

		return list;
	}

	@Override
	public boolean deleteByName(String name) {

		Session session = factory.openSession();

		Transaction transact = session.getTransaction();
		transact.begin();

		PayingGuestDto dto = findbyName(name);

		session.delete("PayingGuestDto", dto);

		transact.commit();
		session.close();

		return true;
	}

	@Override
	public boolean updateLocationAndRentByName(String name, String location, int rent) {

		Session session = factory.openSession();

		Transaction transact = session.getTransaction();
		transact.begin();

		String query = "from PayingGuestDto where pgName = " + name;

		Query<PayingGuestDto> query2 = session.createQuery(query, PayingGuestDto.class);

		PayingGuestDto dto1 = query2.getSingleResult();

		dto1.getPgName();

		dto1.setLocation(location);
		dto1.setRent(rent);

		session.update(dto1);

		transact.commit();
		session.close();

		return true;
	}

}
