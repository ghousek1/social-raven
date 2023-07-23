package com.ghouse.socialraven.service;

import java.util.List;

import com.ghouse.socialraven.entity.Profile;

public interface ProfileService {
    List<String> getProfilePermissions(String userName);

    Profile addProfile(Profile profile);
}
