package com.devportfolio.banking.bankingapi.domain.model.user.agreggates;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_role")
public class Role {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    public Role(Long id, String description) {
        this.id = id;
        this.description = description;
    }
}
