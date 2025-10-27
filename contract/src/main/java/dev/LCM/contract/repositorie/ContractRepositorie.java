package dev.LCM.contract.repositorie;

import dev.LCM.contract.domain.ContractModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContractRepositorie extends JpaRepository<ContractModel, UUID> {
}
