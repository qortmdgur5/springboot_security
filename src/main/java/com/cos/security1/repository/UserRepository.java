package com.cos.security1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.security1.model.User;


//  CRUD 함수를 JapRepository가 들고 있다.
//	 @Repository라는 어노테이션이 없어도 IoC됨. 이유는 JpaRepository를 상속했기 때문
public interface UserRepository extends JpaRepository<User, Integer>{

}
