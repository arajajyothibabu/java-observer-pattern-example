public class Main {

    /**
     * Simulating setTimeout for delayed action
     * @param runnable
     * @param delay
     */
    public static void setTimeout(Runnable runnable, int delay){
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            }
            catch (Exception e){
                System.err.println(e);
            }
        }).start();
    }

    public static void main(String[] args) {

        System.out.println("Police Patrolling Started..!");

        PoliceOfficial subInspector = new PoliceOfficial("Subba Rao");

        PoliceOfficial circleInspector = new PoliceOfficial("Appa Rao");

        Dog puppy = new Dog("Subba Lakshmi");

        puppy.subscribe(subInspector);

        puppy.subscribe(circleInspector);


        for(Integer i = 0; i < 5; i++){
            /**
             * Barking action in irregular times
             */
            setTimeout(() -> puppy.bark(), i * 3000);
        }


    }


}
