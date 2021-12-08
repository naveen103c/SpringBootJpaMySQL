package com.springBoot.service;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.springBoot.model.UserRecord;
import com.springBoot.Repo.UserRepo;
@Service
public class UserService {
	private UserRepo userRepo;

	public UserService(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	public List<UserRecord> getAllUsers(){
		List<UserRecord> userList=new ArrayList<>();
		userRepo.findAll().forEach(userList::add);
		return userList;
	}

}
