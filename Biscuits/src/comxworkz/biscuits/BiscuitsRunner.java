package comxworkz.biscuits;

import java.util.LinkedList;

import comxworkz.biscuits.dao.BiscuitsDao;
import comxworkz.biscuits.dao.BiscuitsDaoImpl;
import comxworkz.biscuits.dto.BiscuitsDto;

public class BiscuitsRunner {
	
	public static void main(String[] args) {
		
		BiscuitsDto dto=new BiscuitsDto("Dark Fantasy","Chocolate","Round",30,6);
		BiscuitsDto dto1=new BiscuitsDto("Hide & Seek","Chocolatyyy","Square",20,10);
		BiscuitsDto dto2=new BiscuitsDto("Barbourn","Pineapple","Rectangle",25,15);
		BiscuitsDao dao=new BiscuitsDaoImpl();
		
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		
		LinkedList<BiscuitsDto> read = dao.read();
		for(BiscuitsDto biscts:read) {
			System.out.println(biscts);
		}
		
		boolean ref=dao.update("Milky");
		System.out.println(ref);
		
		boolean ref1=dao.search("Square");
		System.out.println(ref1);
		
		boolean ref2=dao.delete(40);
		System.out.println(ref2);
		
		
		
	}

}
