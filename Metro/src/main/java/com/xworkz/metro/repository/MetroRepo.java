package com.xworkz.metro.repository;

import java.sql.ResultSet;


import com.xworkz.metro.dto.MetroDto;

public interface MetroRepo {
	
	public boolean save(MetroDto dto) throws Exception;

	public ResultSet find(MetroDto dto,String name) throws Exception;

}
