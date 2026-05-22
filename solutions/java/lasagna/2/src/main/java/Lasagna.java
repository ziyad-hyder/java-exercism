public class Lasagna {
    private static final int expected_time = 40;
    private static final int time_per_layer = 2;
   public int expectedMinutesInOven(){
        return expected_time;
    }

  public int remainingMinutesInOven(int actual){
       return expectedMinutesInOven() - actual;
   }

   public int preparationTimeInMinutes(int layers){
        return layers * time_per_layer;
    }

   public int totalTimeInMinutes(int layers, int actual){
        return preparationTimeInMinutes(layers) + actual;
    }
}
