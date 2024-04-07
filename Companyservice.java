package com.tnsif.companyservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class Companyservice
{
	@Autowired
	   private CompanyRepository repo;
	
	//Get all the records from the table
	   public List<Company> listAll()
	   {
		return repo.findAll();	
		}
	//save the record
		public void save (Company comp)
		
		{
			repo.save(comp);
		}
		//retrieving the particular record the id
	   public Company get(Integer id)
	{
		return repo.findById.get();
		
	}
}

