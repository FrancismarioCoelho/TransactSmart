package com.devportfolio.banking.bankingapi.application.core;

import com.devportfolio.banking.bankingapi.domain.model.service.users.IUserService;
import com.devportfolio.banking.bankingapi.domain.model.user.User;
import com.devportfolio.banking.bankingapi.infrastructure.repository.IUserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Usuário não existe id "+ id));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return  userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
