package com.briup.jz.service;

import java.util.List;
import com.briup.jz.utils.CustomerException;
import com.briup.jz.bean.Comment;;

public interface ICommentService {
	
	void saveOrUpdate(Comment comment) throws CustomerException;
	
	void deleteById(long id) throws CustomerException;
	
	List<Comment> findAll();
	
	Comment findById(long id);
}
