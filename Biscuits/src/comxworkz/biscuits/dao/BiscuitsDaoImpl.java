package comxworkz.biscuits.dao;

import java.util.Iterator;
import java.util.LinkedList;

import comxworkz.biscuits.dto.BiscuitsDto;

public class BiscuitsDaoImpl implements BiscuitsDao {

	LinkedList<BiscuitsDto> dao = new LinkedList<BiscuitsDto>();

	@Override
	public boolean save(BiscuitsDto dto) {
		if (dto != null) {
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
	public BiscuitsDto update(String flavour, int price) {
		if (flavour != null) {
			for (BiscuitsDto bisc : dao) {
				if (bisc != null && bisc.getFlavour() != null) {
					if (bisc.getFlavour().equals(flavour)) {
						bisc.setPrice(price);
						System.out.println("Price is Updated");
						return bisc;
					}

				}
				
			}
			System.out.println("Flavour not found");
			return null;

		}

		System.out.println("Flavour is null");
		return null;
	}

	@Override
	public BiscuitsDto search(String shape) {
		if (shape != null) {
			for (BiscuitsDto biscuitsDto : dao) {
				if (biscuitsDto != null && biscuitsDto.getShape() != null) {
					if (biscuitsDto.getShape().equals(shape)) {
						System.out.println("found Dto");
						return biscuitsDto;
					}
				}

			}
			System.out.println("Shape not found");
			return null;
		}
		System.out.println("Shape should not be null");
		return null;
	}

	@Override
	public BiscuitsDto delete(String name) {
		Iterator<BiscuitsDto> bisc = dao.iterator();
		if (name != null) {
			while (bisc.hasNext()) {
				BiscuitsDto dto = (BiscuitsDto) bisc.next();
				if (dto != null && dto.getName() != null) {
					if (dto.getName().equals(name)) {
						bisc.remove();
						System.out.println("Dto is deleted");
						return dto;
					}
				}

			}
			System.out.println("Name not found");
			return null;

		}
		System.out.println("Name is null");
		return null;

	}

}
