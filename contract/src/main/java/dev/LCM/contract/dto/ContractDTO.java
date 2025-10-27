package dev.LCM.contract.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record ContractDTO(


        UUID id,
       @NotBlank String name,
       @NotBlank @Email String email
) {

}
