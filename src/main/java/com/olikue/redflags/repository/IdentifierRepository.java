package com.olikue.redflags.repository;

import com.olikue.redflags.model.Identifier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IdentifierRepository extends JpaRepository<Identifier, UUID> {}
