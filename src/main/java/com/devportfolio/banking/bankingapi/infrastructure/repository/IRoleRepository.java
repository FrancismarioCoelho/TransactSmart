package com.devportfolio.banking.bankingapi.infrastructure.repository;

import com.devportfolio.banking.bankingapi.domain.model.user.agreggates.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
}
