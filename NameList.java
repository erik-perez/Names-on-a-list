import java.util.ArrayList;
import java.util.Scanner;

public class NameList  {

    public static void printSmallerThan(ArrayList<Integer> numbers, int threshold) {
        for (int number: numbers) {
            if (number < threshold) {
                System.out.println(number);
            }
        }
    }
    public static void printNumbersInRange (ArrayList<Integer> numbers, int lower, int upper) {
        while(lower < upper){
            System.out.println(numbers.get(lower));
            lower++;
        }
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList();
        String name = "";
        System.out.print("Input names, they will be added to a list: ");
        while(!name.equals("done")){
            String newName = reader.nextLine();
            name = newName;
            nameList.add(name);
        }

        int last = nameList.size() - 1;
        nameList.remove(last);
        for(int i = 0; i < nameList.size(); i++){
            if(nameList.get(i).equals("erik")){
                System.out.println("Your name is in the list!");
            }

        }
        System.out.print("The names on the list are:");
        System.out.print(nameList);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(2);
        printSmallerThan(list, 3);
        printNumbersInRange(list, 2, 4);
    }

}
