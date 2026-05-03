package exercicio_fixacao.model.services;

import exercicio_fixacao.model.entities.Contract;
import exercicio_fixacao.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
         double basicQuota = contract.getTotalValue() / months;
         for (int i = 1; i <= months; i++) {
             LocalDate dueDate = contract.getDate().plusMonths(1);
             double interest = onlinePaymentService.interest(basicQuota, i);
             double fee = onlinePaymentService.paymentFee(basicQuota + interest);
             double quota = basicQuota + interest + fee;
             contract.getInstallments().add(new Installment(dueDate, quota));
         }

    }
}
