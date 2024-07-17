package com.sbcrud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sbcrud.model.User;
import com.sbcrud.repository.serviceRepositery;
import com.sbcrud.servicei.serviceI;
@Service
public class serviceImpl implements serviceI{
	@Autowired
	serviceRepositery sr;

	@Override
	public void toSavedata(User u) {
		sr.save(u);
		
	}

	

	
	

}
