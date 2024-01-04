package com.xworkz.metro.service;


import java.sql.ResultSet;

import com.xworkz.metro.dto.MetroDto;

public interface MetroService {
	
	public boolean save(MetroDto dto) throws Exception;
	public ResultSet find(MetroDto dto,String name) throws Exception;

}
