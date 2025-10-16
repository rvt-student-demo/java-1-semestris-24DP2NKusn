package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {
    public static void main(String[] args) {
        RemoveLast();
    }


    public static void onlyTheseNumbers() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        Integer ievads;
        Integer stop = -1;

        while (true) {
            ievads = Integer.valueOf(input.nextLine());
            if (ievads.equals(stop)){
                break;     
            } else {
                numbers.add(ievads);
            }
        }

        System.out.println("From where?");
        int start = Integer.valueOf(input.nextLine());
        System.out.println("To where? ");
        int stp = Integer.valueOf(input.nextLine());
        for (int i = start; i <= stp; i++) {
            System.out.println(numbers.get(i));
        }
        

    }


    public static void ListSize() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String ievads;
        String stop = ".";

        while (true) {
            ievads = input.nextLine();
            if (ievads.equals(stop)){
                break;
            } else{
                list.add(ievads);
            }
        }
        System.out.println("In total: " + list.size());

    }



    public static void OnTheList() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String ievads;
        String stop = "";

        while (true) {
            ievads = input.nextLine();
            if (ievads.equals(stop)){
                break;
            } else{
                list.add(ievads);
            }
        }
        System.out.println("Search for?");
        String search = input.nextLine();

        if (list.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }

    }

    public static void RemoveLast() {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        if (!strings.isEmpty()) { 
            strings.remove(strings.size() - 1); 
        }

        System.out.println(strings); 
    }

}
