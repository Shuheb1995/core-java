package com.xworkz.television.dao;

import com.xworkz.television.dto.TelevisionDto;

public interface TelevisionDao {
	
	boolean saveTele(TelevisionDto brand) throws BrandIsNullException;
	TelevisionDto[] readTele();
	boolean updateTele(Character brand,Integer price) throws BrandNotFoundException;
	boolean findTele(Integer price) throws DtoNotFoundException;
	boolean deleteTele(Character brand) throws BrandNotFoundException;
	TelevisionDto updateNameByPriceAndGraphics(Character brand,Integer price,Boolean graphics);
	TelevisionDto findByBrandAndStreaming(Character brand,Boolean streaming);

}
