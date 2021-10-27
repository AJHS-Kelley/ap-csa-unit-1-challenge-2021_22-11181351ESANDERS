// <E'mare Sanders>, AP CSA Unit 1 Challenge, Andrew Jackson High School, <10/20/2021>, <Time>, v0.0

import java.util.Scanner;

public class DamageDealt {
public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("please Enter your Username: ")

    String userName = myScanner.nextLine();

    System.out.Println("Your Username is:" + Username);

    System.out.Println("\n Please enter the name of your weapon:");
    String weaponName = myScanner.nextLine();
    System.out.PrintLn(weaponName + "That's a great choice"); 

    System.out.Println("\n Please enter the monster name:");
    String MonsterName = myScanner.nextline();
    System.out.Println(MonsterName + "Is a really...Dangerous monster");

    System.out.Println("\n How many attacks do you want to use?");
    var numberAttack = myScanner.nextLine();
    System.out.Println(numberAttack + "ammount of attacks");

    System.out.Println("\n Your attack power");
    int damageDealt = myScanner.nextInt();
    System.out.Println(DamageDealt + "damage per attack");

    int totalDamage = numberAttack + DamageDealt;
    System.out.Println("\n your total damage was" + totalDamage);
}


    