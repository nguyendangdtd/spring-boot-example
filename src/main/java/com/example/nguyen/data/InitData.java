/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.nguyen.data;

import com.example.nguyen.entities.Role;
import com.example.nguyen.entities.User;
import com.example.nguyen.repository.UserRepository;
import java.awt.List;
import java.util.Arrays;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author XV
 */
@Component
public class InitData {

    @Autowired
    UserRepository userRepository;

    @PostConstruct
    public void insertData() {
        Role roleAdmin = new Role();
        roleAdmin.setName("admin");

        Role roleUser = new Role();
        roleUser.setName("user");

        User admin = new User();
        admin.setUserName("admin");
        admin.setPassword("admin");
        admin.setRoles(Arrays.asList(roleAdmin));

        User user = new User();
        user.setUserName("user");
        user.setPassword("user");
        user.setRoles(Arrays.asList(roleUser));
        
        userRepository.saveAll(Arrays.asList(admin, user));

    }
}
