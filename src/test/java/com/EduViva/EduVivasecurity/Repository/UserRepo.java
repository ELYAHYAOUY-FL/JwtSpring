package com.EduViva.EduVivasecurity.Repository;

import com.EduViva.EduVivasecurity.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String> {

}
