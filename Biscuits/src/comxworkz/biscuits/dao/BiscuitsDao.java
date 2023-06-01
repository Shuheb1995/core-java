package comxworkz.biscuits.dao;

import java.util.LinkedList;

import comxworkz.biscuits.dto.BiscuitsDto;

public interface BiscuitsDao {
	
	public boolean save(BiscuitsDto dto);
	public LinkedList<BiscuitsDto> read();
	public boolean update(String flavour);
	public boolean search(String flavour);
	public boolean delete(int price);

}
