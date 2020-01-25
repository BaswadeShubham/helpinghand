package com.app.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import com.app.dao.IChildInfoDao;
import com.app.pojos.Childinfo;


@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
@RestController
public class ChildInfoController {

	@Autowired(required = false)
	private IChildInfoDao dao;
	
	
	@RequestMapping(method=RequestMethod.GET,path="/childinfo")
	
	public List<Childinfo> PerformLogin(){	
		List<Childinfo> list = dao.getChildInfo();
		
		return list;
	}
	
}
