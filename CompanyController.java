package com.tnsif.companyservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
public ReponseEntity<Company> get(@Pathvariable Integeer id)
   {
	   
   }
	}
	
