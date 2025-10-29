package dev.LCM.contract.controller;

import dev.LCM.contract.domain.ContractModel;
import dev.LCM.contract.dto.ContractDTO;
import dev.LCM.contract.service.ContractService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {

    final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @PostMapping("/criar")
    public ResponseEntity<ContractModel> createContract(@RequestBody ContractModel contractModel){
       ContractModel saveContract = contractService.save(contractModel);
       return ResponseEntity.status(HttpStatus.CREATED).body(saveContract);
    }
}
