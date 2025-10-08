package dev.LCM.email.repositorie;

import dev.LCM.email.domain.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepositorie extends JpaRepository<EmailModel, UUID> {
}
