package com.xworkz.television.dao;

import com.xworkz.television.dto.TelevisionDto;

public class TelevisionDaoTwo implements TelevisionDao {
	
	TelevisionDto[] tele=new TelevisionDto[5];

	public boolean saveTele(TelevisionDto brand) throws BrandIsNullException {
		if(brand!=null) {
			if(brand.getBrand()!=null && brand.getGraphics()!=null) {
				for(int i=0; i<tele.length;i++) {
					if(tele[i]==null) {
						tele[i]=brand;
						System.out.println("Dto is Saved");
						return true;
					}
					
				}
				System.out.println("No space available");
				return false;
			}
		}
		throw new BrandIsNullException("Brand should not be null");
	}

	public TelevisionDto[] readTele() {
		return tele;
	}

	public boolean updateTele(Character brand, Integer price) throws BrandNotFoundException {
		if(brand!=null && price!=null) {
			for(int i=0;i<tele.length;i++) {
				if(tele[i]!=null) {
					if(tele[i].getBrand()!=null) {
						if(tele[i].getBrand().equals(brand)) {
							tele[i].setPrice(price);
							System.out.println("Price Updated");
							return true;
						}
					}
				}
				
			}
			throw new BrandNotFoundException("Enter Valid Brand name to update");
			
		}
		System.out.println("brand and Price is null");
		return false;
	}
	
	public boolean findTele(Integer price) throws DtoNotFoundException {
		for(int i=0;i<tele.length;i++) {
			if(tele[i]!=null) {
			if(tele[i].getPrice().equals(price)) {
				System.out.println("Found Dto");
				return true;
			}
			}
		}
		throw new DtoNotFoundException("Enter Valid Price");
	}
	

	public boolean deleteTele(Character brand) throws BrandNotFoundException {
		if(brand!=null) {
			for(int i=0;i<tele.length;i++) {
				if(tele[i]!=null) {
					if(tele[i].getBrand().equals(brand)) {
						tele[i]=null;
						System.out.println("Dto is deleted");
						return true;
					}
				}
			}
			throw new BrandNotFoundException("Enter Valid Brand");
		}
		System.out.println("brand is null");
		return false;
	}

	public TelevisionDto updateNameByPriceAndGraphics(Character brand, Integer price, Boolean graphics) {
		if (brand != null && graphics != null) {
			for (int i = 0; i < tele.length; i++) {
				if (tele[i] != null) {
					if (tele[i].getPrice() != null && tele[i].getGraphics() != null) {
						if (tele[i].getPrice().equals(price) && tele[i].getGraphics().equals(graphics)) {
							tele[i].setBrand(brand);
							System.out.println("Brand is updated by Price and Graphics");
							return tele[i];
						}
					}

				}
			}
			System.out.println("brand not found");
			return null;
		}
		System.out.println("Brand Graphics is null");
		return null;
	}

	public TelevisionDto findByBrandAndStreaming(Character brand, Boolean streaming) {
		if (brand != null) {
			for (int i = 0; i < tele.length; i++) {
				if (tele[i] != null) {
					if (tele[i].getBrand() != null && tele[i].getStreaming() != null) {
						if (tele[i].getBrand().equals(brand) && tele[i].getStreaming().equals(streaming)) {
							System.out.println("found dto");
							return tele[i];

						}
					}
				}
			}
			System.out.println("Brand Not Found");
			return null;
		}
		System.out.println("Brand is Null");
		return null;
	}
	
	

}
	
	


