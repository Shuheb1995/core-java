package com.xworkz.resume.dao;

import com.xworkz.resume.dto.ResumeDto;

public class ResumeDao {
	
	ResumeDto[] resume = new ResumeDto[10];
	
	public boolean saveResume(ResumeDto dto) {
		if(dto != null) {
			if(dto.getName() != null && dto.getEmail() != null) {
				if(resume != null) {
					for(int i=0; i<resume.length; i++) {
						if(resume[i] == null) {
							resume[i] = dto;
							System.out.println("Resume saved successfully");
							return true;
						}
						System.out.println("Resume is not null continuing loop");
						
					}
					System.out.println("no resume found");
					return false;
					
					
				}
				System.out.println("Resume is null");
				return false;
				
			}
			System.out.println("The Name & Email is null");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}
	
	public ResumeDto[] readAll() {
		return resume;
	}
	
	public ResumeDto findByName(String name) {
		if(name != null) {
				for(int i = 0; i<resume.length; i++) {
					if(resume[i] != null) {
						if(resume[i].getName().equals(name)) {
						System.out.println("name found");
						return resume[i];
						
						}
						System.out.println("name not found");
						
					}
					System.out.println("Name is null");
					
				}
				System.out.println("Name not found");
				return null;
			
		}
		System.out.println("name is null");
		return null;
	}
	
	public ResumeDto findByEmail(String email) {
		
		if(email!= null) {
			for(int i=0; i<resume.length; i++) {
				if(resume[i]!= null) {
					if(resume[i].getEmail().equals(email)) {
					System.out.println("email found");
					return resume[i];
					}
					System.out.println("email not found");
				}
				System.out.println("email not found continue loop");
			}
			System.out.println("email  not found");
			return null;
		}
		System.out.println("email is null");
		return null;
		
	}
	
	public boolean updateDegreebyName(String name,String degree) {
		
		if(name != null && name.length()>=5) {
			if(degree != null) {
				for(int i=0; i<resume.length;i++) {
					if(resume[i]!=null) {
						if(resume[i].getName().equals(name)) {
						resume[i].setDegree(degree);
						System.out.println("degree is updated");
						return true;
						
						}
						System.out.println("degree is not changed");
						
					}
					System.out.println("degree is null");
					
				}
				System.out.println("degree not updated");
				return false;
				
			}
			System.out.println("degree is null");
			return false;
			
		}
		System.out.println("name is null");
		return false;
	}
	
	public boolean updatePhoneNumberByEmail(String email,long phoneNumber) {
		
		if(email != null && email.length()>5) {
			if(phoneNumber!= 0) {
				for(int i=0; i<resume.length; i++) {
					if(resume[i]!=null) {
						if(resume[i].getEmail().equals(email)) {
							resume[i].setPhoneNumber(phoneNumber);
							System.out.println("Phone Number is Updated Successfully");
							return true;
						}
						
					}
					System.out.println("Phone Number not found");
					
				}
				System.out.println("PhoneNumber is not updated");
				return false;
				
			}
			System.out.println("PhoneNumber is null");
			return false;
			
		}
		System.out.println("email is null");
		return false;
	}
	
	
	
	
	public boolean deleteByName(String name) {
		if(name!= null) {
		    	 for(int i=0;i<resume.length;i++) {
		    		 if(resume[i]!=null) {
		    			if( resume[i].getName().equalsIgnoreCase(name)) {
		    				resume[i].setDateOfbirth(null);
		    			
		    			 System.out.println("Name is deleted successfully");
		    			 return true;
		    			}
		    			
		    		 }
		    		 
		    		 
		    	 }
		    	 System.out.println("Name not Deleted");
		    	 return false;
			
		}
		System.out.println("name is null");
		return false;
	}
	
	

}
