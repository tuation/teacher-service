package com.tuition.teacher.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuition.app.entity.TeacherDetails;

@Repository
public interface ManageTeacherDao extends JpaRepository<TeacherDetails,String>{

	
	
}
