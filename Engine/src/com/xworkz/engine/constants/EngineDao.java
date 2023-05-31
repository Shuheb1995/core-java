package com.xworkz.engine.constants;

import com.xworkz.engine.dto.EngineDto;

public interface EngineDao {
	
	EngineDto saveEngine(EngineDto dto);
	EngineDto[] readEngine();
	boolean  updateEngine(String name,String type);
	boolean searchEngine(String type);
	boolean deleteEngine(String cycle);
	

}
