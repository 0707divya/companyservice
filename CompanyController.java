package com.tnsif.companyservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CompanyController
{
	@Autowired
	private Companyservice comp;
	@GetMapping("/companyservice")
	public List<Company>list()
	{
		return comp.listAll();
		
	}
   @PostMapping("/companyservice")
	public void add(@RequestBody Company comp2)
		{
			comp.save(comp2);
		}
   @GetMapping("/companyservice/{id}")
    public ReponseEntity<Company> get(@PathVariable Integer id)
   {
	   try 
	   {
	     Company exist_c=comp.get(id);
	     Company update_c;
		exist_c.setName(update_c.getName());
	     exist_c.setAddress(update_c.getAddress());
	     comp.update(exist_c);
	     return new ReponseEntity<Company>(c,HttpStatus.OK);
	   }
	   catch(noResultException e)
	   {
		   return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
		   
	   }
	   @DeleteMapping("/companyservice/{id}")
	   public void delete@PathVariable Integer id)
	   {
		   comp.delete(id);
	   }
	   @PutMapping("/Companyservice/{id}")
		public ResponseEntity<String> updateCompany(@PathVariable Integer id,@RequestBody Company updatedCompany)
	{
			comp.updatecompany(id,updatedCompany);
			return ResponseEntity.ok("Company updated Successfully");
		}
	}
	
