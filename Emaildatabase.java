import java.util.Scanner;

public class Emaildatabase {

 public static void main(String[] args) {
  int number;

  Scanner scan = new Scanner(System.in);

  System.out.println("Welcome to my database. Created by Alan Kantserov");
  System.out.println("You can capture all the names and e-mails here!");
  System.out.println("How many people's do you want to input?");
  System.out.println("__________________________________________________________");

  number = Integer.parseInt(scan.nextLine());


  String[] people = new String[number];
  String[] cnames = new String[number];
  String[] emails = new String[number];
  String[] cmails = new String[number];

  for (int i = 0; i < number; i++) {
   System.out.println("input person number " + (i + 1));
   people[i] = scan.nextLine();
  }

  for (int i = 0; i < number; i++) {
   System.out.println("input person's e-mail " + (i + 1));
   emails[i] = scan.nextLine();
  }

  System.out.print("There are " + number + " people. ");

  for (int i = 0; i < people.length; i++) {
   cnames[i] = people[i].substring(0, 1).toUpperCase() + people[i].substring(2, people[i].length()).toLowerCase();
  }

  for (int i = 0; i < emails.length; i++) {
   cmails[i] = emails[i].toLowerCase();
  }


  int a = 0;
  while (a < (number)) {
   System.out.print(cnames[a] + "'s email is " + cmails[a] + ". ");
   a++;
  }
 }
}