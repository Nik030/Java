package a40_41.HOMEWORK_40_41M;

public class ArrayTrain {
    // train
    // speed = 42km/h
    // distance = 15km
    // every 30 sek display current distance
    public static void main(String[] args) {
        TrainJourney();
    }


    public static void TrainJourney() {
        double speed = 42;  // (5 * 1km)/1h
        double distance = 15;

        double speedConvert = (speed * 1000) / 120;   ///..... 350m / 30sek
        double distancePerMeter = distance * 1000;
        double currentDistance = 0;

        for (int minute = 0; currentDistance <= distancePerMeter; minute += 1) {
            if (minute % 1 == 0 && minute != 0) {
                System.out.println("Поезд проехал " + currentDistance + ", осталось ехать" + (distancePerMeter - currentDistance) + ", время в пути: " + (currentDistance / speedConvert));
                currentDistance = speedConvert * minute; // v = s/t
            }
        }
        if (currentDistance >= 14700) {
            System.out.println("Общее время в пути: " + distancePerMeter / speedConvert);
        }
    }

// я не понял как сделать так чтобы было ровно 15км, пожтому подогнал под значение 14700
//
//
//
//
//
//
//
//
//
// ЗАДАЧА НА МАССИВЫ // СОЗДАТЬ НОВЫЙ МАССИВ С НЕЧЕТНЫМИ ЧИСЛАМИ
 // public static void ArrayHomework() {
 //      int[] array1 = {12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21};
 //      int Count = 0;

  //     for (int i = 0;  < array1; i++){

 //      }



//}







}

