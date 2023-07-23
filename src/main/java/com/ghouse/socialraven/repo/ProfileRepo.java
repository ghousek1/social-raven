package com.ghouse.socialraven.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ghouse.socialraven.entity.Profile;

@Repository
public interface ProfileRepo extends MongoRepository<Profile,String> {
}
