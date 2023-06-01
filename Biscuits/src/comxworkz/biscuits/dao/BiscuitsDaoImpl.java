package comxworkz.biscuits.dao;

import java.util.LinkedList;

import comxworkz.biscuits.dto.BiscuitsDto;

public class BiscuitsDaoImpl implements BiscuitsDao{
	
	LinkedList<BiscuitsDto> dao = new LinkedList<BiscuitsDto>();

	@Override
	public boolean save(BiscuitsDto dto) {
		if(dto!=null) {
			dao.add(dto);
			System.out.println("Dto saved");
			return true;
			}
		System.out.println("Dto not saved");
		return false;
	}

	@Override
	public LinkedList<BiscuitsDto> read() {
		return dao;
	}

	@Override
	public boolean update(String flavour) {
		if(flavour!=null) {
			for(BiscuitsDto str:dao) {
			dao.set(0, str);
			System.out.println("Flavour updated");
			return true;
			}
		}
		System.out.println("Flavour not updated");
		return false;
	}

	@Override
	public boolean search(String shape) {
		if(shape!=null) {
			for(BiscuitsDto str:dao) {
			dao.get(2);
			System.out.println("Dto found");
			return true;
			}
		}
		System.out.println("Dto not found");
		return false;
	}

	@Override
	public boolean delete(int price) {
		for(BiscuitsDto str:dao) {
		dao.set(2, str).setPrice(0);
		System.out.println("Dto deleted");
		return true;
		}
		
		System.out.println("valid price not found");
		return false;
	}

}
