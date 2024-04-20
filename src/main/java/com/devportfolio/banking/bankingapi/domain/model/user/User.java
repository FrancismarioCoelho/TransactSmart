package com.devportfolio.banking.bankingapi.domain.model.user;

import com.devportfolio.banking.bankingapi.domain.model.user.agreggates.Role;
import com.devportfolio.banking.bankingapi.presentation.controller.user.UserRequestDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@Getter
@Setter
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private String status;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @PrePersist
    public void setCreateAt() {
        this.createAt = LocalDateTime.now();;
    }

    public User(UserRequestDTO dto) {
        login = dto.login();
        password = dto.password();
        status = dto.status();
        role = dto.role();
    }
}
