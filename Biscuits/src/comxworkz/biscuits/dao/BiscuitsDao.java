package comxworkz.biscuits.dao;

import java.util.LinkedList;

import comxworkz.biscuits.dto.BiscuitsDto;

public interface BiscuitsDao {
	
	public boolean save(BiscuitsDto dto);
	public LinkedList<BiscuitsDto> read();
	public BiscuitsDto update(String flavour,int price);
	public BiscuitsDto search(String flavour);
	public BiscuitsDto delete(String name);

}
