import java.util.*;

public class Main {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            CoffeeMaker maker = new CoffeeMaker();
            System.out.println("~~~|-WELCOME-|~~~");
            while (true) {
                System.out.print("Write action {buy, fill, take, remaining, exit} :");
                String input = scan.next();
                switch (input) {
                    case ("buy"):
                        System.out.println("What do you want to buy?" +
                                "\n1 - latte" +
                                "\n2 - espresso" +
                                "\n3 - cappuccino");
                        int in = scan.nextInt();
                        switch (in) {
                            case (1):
                                if (maker.getWater() < 150)
                                    System.out.println("Not enough water!!!");
                                if ( maker.getBeans() < 100)
                                    System.out.println("Not enough coffee beans!!!");
                                if (maker.getMilk() < 250)
                                    System.out.println("Not enough milk!!!");
                                else {
                                    maker.setMilk(maker.getMilk() - 250);
                                    maker.setWater(maker.getWater() - 150);
                                    maker.setBeans(maker.getBeans() - 100);
                                    System.out.println("Do you want some sugar?\n 1 - yes\n 2 - no");
                                    in = scan.nextInt();
                                    if (in == 1){
                                        if (maker.getSugar()==0)
                                            System.out.println("There is no sugar!!!");
                                        else
                                            maker.setSugar(maker.getSugar() - 1);}
                                    System.out.println("Everything ok. Making your coffee...");
                                    maker.setMoney(maker.getMoney() + 25);
                                    maker.setCups(maker.getCups()-1);
                                }
                                break;
                            case (2):
                                if (maker.getWater() < 150)
                                    System.out.println("Not enough water!!!");
                                if ( maker.getBeans() < 100)
                                    System.out.println("Not enough coffee beans!!!");


                                else {
                                    maker.setWater(maker.getWater() - 150);
                                    maker.setBeans(maker.getBeans() - 100);
                                    System.out.println("Do you want some sugar?\n 1 - yes\n 2 - no");
                                    in = scan.nextInt();
                                    if (in == 1){
                                        if (maker.getSugar()==0)
                                            System.out.println("There is no sugar!!!");
                                        else
                                            maker.setSugar(maker.getSugar() - 1);}
                                    System.out.println("Everything ok. Making your coffee...");
                                    maker.setMoney(maker.getMoney() + 15);
                                    maker.setCups(maker.getCups()-1);
                                }
                                break;
                            case (3):
                                if (maker.getWater() < 200) //|| || maker.getMilk() < 150)
                                    System.out.println("Not enough water!!!");
                                if ( maker.getBeans() < 150)
                                    System.out.println("Not enough coffee beans!!!");
                                if (maker.getMilk() < 150)
                                    System.out.println("Not enough milk!!!");

                                else {
                                    maker.setMilk(maker.getMilk() - 150);
                                    maker.setWater(maker.getWater() - 200);
                                    maker.setBeans(maker.getBeans() - 150);
                                    System.out.println("Do you want some sugar?\n 1 - yes\n 2 - no");
                                    in = scan.nextInt();
                                    if (in == 1){
                                        if (maker.getSugar()==0)
                                            System.out.println("There is no sugar!!!");
                                        else
                                        maker.setSugar(maker.getSugar() - 1);}
                                    System.out.println("Everything ok. Making your coffee...");
                                    maker.setMoney(maker.getMoney() + 20);
                                    maker.setCups(maker.getCups()-1);
                                }
                                break;
                        }
                            break;


                    case ("fill"):
                        System.out.println("What do you want to fill\n 1 - Milk\n 2 - Coffee beans\n 3 - Water\n 4 - Sugar\n 5 - Paper cups");
                        in = scan.nextInt();
                        switch (in){
                            case (1):
                                System.out.println("How many ml of milk do you want to fill?");
                                in=scan.nextInt();
                                maker.setMilk(maker.getMilk()+in);
                                System.out.println("Done");
                                break;
                            case (2):
                                System.out.println("How many gr of coffee beans do you want to fill?");
                                in=scan.nextInt();
                                maker.setBeans(maker.getBeans()+in);
                                System.out.println("Done");
                                break;
                            case (3):
                                System.out.println("How many ml of water do you want to fill?");
                                in=scan.nextInt();
                                maker.setWater(maker.getWater()+in);
                                System.out.println("Done");
                                break;
                            case (4):
                                System.out.println("How many portions of sugar beans do you want to fill?");
                                in=scan.nextInt();
                                maker.setSugar(maker.getSugar()+in);
                                System.out.println("Done");
                                break;
                            case (5):
                                System.out.println("How many paper cups do you want to fill?");
                                in=scan.nextInt();
                                maker.setCups(maker.getCups()+in);
                                System.out.println("Done");
                                break;
                            }
                            break;
                    case ("remaining"):
                        System.out.println(maker.toString());
                        break;
                    case ("take"):
                        System.out.println("There is " + maker.getMoney() + " grn in machine");
                        System.out.println("Take your money...");
                        maker.setMoney(0);
                        break;
                    case ("exit"):
                        System.out.println("~~~|-BYE-|~~~");
                        return;
                }


            }
        }
    }
}