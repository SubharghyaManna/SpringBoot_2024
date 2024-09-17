package com.springproject;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springproject.model.Customer;
import com.springproject.service.MainController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(Application.class, args);

		Scanner sc = new Scanner(System.in);
		Integer rate = null, time = null;

		Customer customer = new Customer();
		if (sc != null) {

			System.out.print("Enter cname: ");
			customer.setCname(sc.next());

			System.out.print("Enter caddr: ");
			customer.setCaddr(sc.next());

			System.out.print("Enter pamt: ");
			customer.setPamt(sc.nextDouble());

			System.out.print("Enter rate: ");
			rate = sc.nextInt();

			System.out.print("Enter time: ");
			time = sc.nextInt();
		}

		MainController controller = ac.getBean(MainController.class);
		try {
			String result = controller.processCustomer(customer, rate, time);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		sc.close();

	}

}
