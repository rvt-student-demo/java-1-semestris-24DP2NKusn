package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {
    public static void main(String[] args) {
        ListSize();

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
        

    }
    public static void ListSize() {
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
        System.out.println("In total: " + list.size());

    }
    public static void OnTheList() {}
    public static void RemoveLast() {}

}
