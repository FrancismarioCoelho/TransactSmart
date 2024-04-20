package com.devportfolio.banking.bankingapi.presentation.controller.user;

import com.devportfolio.banking.bankingapi.domain.model.user.User;
import com.devportfolio.banking.bankingapi.domain.model.user.agreggates.Role;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public record UserResponseDTO(Long id,
                              LocalDateTime createAt,
                              String status,
                              Role role) {


    public UserResponseDTO(User user) {
        this(user.getId(), user.getCreateAt(), user.getStatus(), user.getRole());
    }
}