import java.util.*;

public class MyNumbers {

    public static void main(String[] args) {
        collectionTypes();
    }

    public static void collectionTypes(){
        Random rand = new Random();
        ArrayList<Integer> randNum = new ArrayList<>();

        while(randNum.size() < 20){
            randNum.add(rand.nextInt(100));
            //generates 20 nos within the range of 1 to 99
        }


        HashMap<Integer, Integer> randNumMap = new HashMap<Integer, Integer>();
        randNum.forEach((number) -> randNumMap.put((number * 10), number));


        iteratorClass(randNum);

    }

    static void iteratorClass(ArrayList<Integer> numberList){

        Iterator<Integer> loop = numberList.iterator();


        LinkedList<Integer> numLinkedList = new LinkedList<>();

        while(loop.hasNext()){
            int currentNumber = loop.next();

            if(currentNumber % 2 == 0 || currentNumber % 5 == 0){
                numLinkedList.add(currentNumber);
                //checks if number is divisible by 2 or 5
            }
        }

        LinkedList <Integer> newNumberLinkedList = (LinkedList<Integer>) numLinkedList.clone();

        numLinkedList.forEach((number) -> newNumberLinkedList.add(number -1));
        //new LinkedList from initial list




        try {
            System.out.println("\n");
            System.out.println("The 10th value is: " + newNumberLinkedList.get(9));
            System.out.println("The 50th value is: " + newNumberLinkedList.get(49));
            //uses num index to get the 5th & 10th nos

            System.out.println("\n");
        }
        catch (Exception e){
            System.out.println("\n");
            System.out.println("Error handled"); //throws exception
            System.out.println("Completed successfully!");

            System.out.println("\n");
        }

        Set<Integer> numSet = new HashSet<>(newNumberLinkedList);
        Set<Integer> multiplesOfFive = new HashSet<>(Arrays.asList(5,10,15,20, 25));


        if(!Collections.disjoint(numSet, multiplesOfFive)){
            System.out.println("HashSet contains multiples of 5 up to 25");
        }
        else{
            System.out.println("HashSet does not contain multiples of 5 till 25!");
        }


        System.out.println("\n");
        System.out.println("Final HashSet:");

        numSet.forEach(System.out::println);







    }
}
