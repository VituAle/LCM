package dev.LCM.contract.service;

import dev.LCM.contract.domain.ContractModel;
import dev.LCM.contract.dto.ContractDTO;
import dev.LCM.contract.producer.ContractProducer;
import dev.LCM.contract.repositorie.ContractRepositorie;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ContractService {

    final ContractRepositorie contractRepositorie;
    final ContractProducer contractProducer;

    public ContractService(ContractRepositorie contractRepositorie, ContractProducer contractProducer) {
        this.contractRepositorie = contractRepositorie;
        this.contractProducer = contractProducer;
    }

    @Transactional
    public ContractModel save(ContractModel contractModel) {
        contractModel = contractRepositorie.save(contractModel);
        contractProducer.enviarContractCriado(contractModel);
        return contractModel;
    }

}
