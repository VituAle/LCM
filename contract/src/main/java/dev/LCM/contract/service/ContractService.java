package dev.LCM.contract.service;

import dev.LCM.contract.domain.ContractModel;
import dev.LCM.contract.dto.ContractDTO;
import dev.LCM.contract.repositorie.ContractRepositorie;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ContractService {

    final ContractRepositorie contractRepositorie;

    public ContractService(ContractRepositorie contractRepositorie) {
        this.contractRepositorie = contractRepositorie;
    }

    @Transactional
    public ContractModel createContract(ContractModel contractModel) {
        return contractModel = contractRepositorie.save(contractModel);
    }


    public ContractModel save(ContractDTO contractDTO) {
        ContractModel contractModel = new ContractModel();
        return contractRepositorie.save(contractModel);
    }

}
