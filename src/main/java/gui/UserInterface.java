package gui;

import mail.Email;
import mail.MailService;

import java.util.Scanner;

public class UserInterface {

    public static final String SPACE = "------------------------------";
    private MailService mailService;

    public UserInterface(MailService mailService) {
        this.mailService = mailService;
    }

    public void showMenu() {
        System.out.println("Witaj w aplikacji >>SDA Mailer<<");
        System.out.println(SPACE);
        System.out.println("Wybierz co chcesz zrobić:");
        System.out.println("1. Wyslij maila");
        System.out.println("2. Wyjscie");
        System.out.println(SPACE);
    }

    public void listen(Scanner scanner) {
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                sendEmail(scanner);
                break;
            case 2:
                System.out.println("Wychodze z programu");
                System.exit(0);
                break;
        }


    }

    private void sendEmail(Scanner scanner) {
        System.out.println("Podaj email:");
        String mail = scanner.nextLine();
        System.out.println("Podaj temat maila:");
        String subject = scanner.nextLine();
        System.out.println("Podaj tresc maila:");
        String content = scanner.nextLine();

        Email email = new Email(mail, subject, content);
        mailService.sendEmail(email);


    }
}
