public class Main {
    public static void main(String[] args) throws Exception {
        Airport piazzola = new Airport(54, "Ruta 2");
        Hangar hangarOne = new Hangar("Comerciales");
        Service breakFast = new Service("Breakfast", "Is the breakfast");

        CommercialPlane airOne = new CommercialPlane("Model1", "AR Airlines",
                14000, "Tremendo", 100, 6);

        CommercialPlane airTwo = new CommercialPlane("Model2", "AR Airlines",
                14000, "Tremendo", 100, 6);

        hangarOne.addAirplane(airOne);
        hangarOne.addAirplane(airTwo);

        airOne.land();
        airTwo.land();

        System.out.println(Airport.getOperationCapacity());

        piazzola.liftAllFromHangar(hangarOne);

        System.out.println(Airport.getOperationCapacity());
    }
}
