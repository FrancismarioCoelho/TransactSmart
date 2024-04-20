package com.devportfolio.banking.bankingapi.domain.model.user;

import com.devportfolio.banking.bankingapi.domain.model.user.agreggates.Role;
import com.devportfolio.banking.bankingapi.presentation.controller.user.UserRequestDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

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

    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;


    public User(UserRequestDTO dto) {
        login = dto.login();
        password = dto.password();
        status = dto.status();
        role = dto.role();
    }
}
