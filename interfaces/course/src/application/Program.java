package application;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter data of the rent: ");
        System.out.println("Car model: ");
        String carModel = sc.nextLine();
        System.out.println("Date of removal: ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.println("Date of return: ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
        
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        
        System.out.println("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Enter price per day: ");
        double pricePerDay = sc.nextDouble();
        
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        
        rentalService.processInvoice(cr);
        
        System.out.println("Fatura: ");
        System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
        sc.close();
	}

}
