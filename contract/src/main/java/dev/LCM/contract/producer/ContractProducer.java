package dev.LCM.contract.producer;

import dev.LCM.contract.domain.ContractModel;
import dev.LCM.contract.dto.EmailDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class ContractProducer {

    final RabbitTemplate rabbitTemplate;

    public ContractProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    private final String routingKey = "email-queue";

    public void enviarContractCriado(ContractModel contractModel){
        var emailDTO = new EmailDTO();
        emailDTO.setUserId(contractModel.getId());
        emailDTO.setEmailTo(contractModel.getEmail());
        emailDTO.setEmailSubject("Bem vindo ao LCM");
        emailDTO.setBody("Olá" + contractModel.getNome() + (", \n contrato cadastrado com sucesso."));
        rabbitTemplate.convertAndSend("",routingKey,emailDTO);
    }
}
