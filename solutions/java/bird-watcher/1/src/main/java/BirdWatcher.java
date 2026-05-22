
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int [] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        int n = birdsPerDay.length;
        return birdsPerDay[n-1];
    }

    public void incrementTodaysCount() {
        int n = birdsPerDay.length;
        birdsPerDay[n-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int count : birdsPerDay){
            if(count == 0){
                return true;
            } 
            }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for(int i = 0; i < limit; i++){
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for(int i = 0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] >= 5) count++;
        }
        return count;
    }
}
