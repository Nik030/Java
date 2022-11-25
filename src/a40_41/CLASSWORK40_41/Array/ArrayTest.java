package a40_41.CLASSWORK40_41.Array;

public class ArrayTest {
    private static class Order {
        String name;
        String surname;
        String orderName;
        String address;
        Integer priceInCents;
        Integer count;

    }


    public static void main(String[] args) {
  /*      int amountMoney = 0;
        Order[] orders = new Order[50];
        Order order = new Order();
        order.name = "Lego Minecraft Toy";
        orders[0] = order;

        Order[] orders1 = {order, order};
        */


        String[] english ={"Hi", "Good Day"};
        String[] russian ={"Привет", "Добрый день"};

        for (int i = 0; i < english.length; i++) {
            String englishWord = english[i];  //english[0]
            String russianWord = russian[i];
            System.out.println(englishWord + " = " + russianWord);
        }




    }
}
