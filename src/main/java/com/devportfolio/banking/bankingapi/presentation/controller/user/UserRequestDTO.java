package com.devportfolio.banking.bankingapi.presentation.controller.user;

import com.devportfolio.banking.bankingapi.domain.model.user.agreggates.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserRequestDTO(Long id,
                             String login,
                             @NotBlank(message = "Informe o campo de senha.")
                             @Size(min = 8, max = 8, message = "Insira uma senha com 8 caracteres.")
                             String password,
                             @NotNull(message = "Informe o estado atual.")
                             String status,

                             Role role
) {
    public UserRequestDTO(Long id, String login,String password, String status, Role role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.status = status;
        this.role = role;
    }

}