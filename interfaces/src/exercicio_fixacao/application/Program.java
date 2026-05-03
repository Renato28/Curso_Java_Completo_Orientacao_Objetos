package exercicio_fixacao.application;

import exercicio_fixacao.model.entities.Contract;
import exercicio_fixacao.model.entities.Installment;
import exercicio_fixacao.model.services.ContractService;
import exercicio_fixacao.model.services.PaypalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() throws ParseException {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        Double valor = sc.nextDouble();
        Contract contract = new Contract(numero, data, valor);

        System.out.print("Entre com o número de parcelas: ");
        int parcelas = sc.nextInt();
        ContractService service = new ContractService(new PaypalService());

        service.processContract(contract, parcelas);

        System.out.println("Parcelas:");
        for (Installment installment: contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();

    }
}
