package com.example.backend.repository;

import com.example.backend.data.entity.Invitation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvitationRepository extends JpaRepository<Invitation, Long> {

    Page<Invitation> getBySenderId(Long id, Pageable pageable);

    Page<Invitation> getByReceiverId(Long id, Pageable pageable);

    Optional<Invitation> findById(Long id);

    Invitation save(Invitation invitation);

    void deleteById(Long id);
}
