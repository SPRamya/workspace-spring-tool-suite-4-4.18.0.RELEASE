package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.project.model.Bike;
import com.example.project.repository.BikeRepository;

@Service
public class ProjectService {
	@Autowired
	public BikeRepository repobj;

	public Bike saveInfo( Bike obj1)
	{
		return repobj.save(obj1);
	}

	public List<Bike> getAllbike()
	{
		List<Bike> bikeList=repobj.findAll();
		return bikeList;
		
	}
	public Bike updateInfo( Bike obj1)
	{
		return repobj.save(obj1);
	}
public void deleteInfo(int id)
{
	repobj.deleteById(id);
}
}
