package com.example.montreal.project.service;

import com.example.montreal.project.entity.Users;
import com.example.montreal.project.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    private UsersRepository usersRepository;

    public List<Users> listAll(){
        return usersRepository.findAll();
    }

    public Optional<Users> getUserById(Long id) {
        return usersRepository.findById(id);
    }

    public Users createUser(Users user) {
        return usersRepository.save(user);
    }

    public Users updateUser(Long id, Users userDetails) {
        Users user = usersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com id: " + id));

        user.setName(userDetails.getName());
        user.setUserName(userDetails.getUserName());

        return usersRepository.save(user);
    }


    public void deleteUser(Long id) {
        usersRepository.deleteById(id);
    }

}