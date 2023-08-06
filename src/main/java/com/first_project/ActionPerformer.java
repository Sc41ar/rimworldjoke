public class ActionPerformer implements EventsCallback {
    int population;
    GUI gui;

    public ActionPerformer() {
        population = 0;
        gui = new GUI(this);
        gui.init();
    }

    @Override
    public void populationChaged(int value) {
        population = value;
        gui.populationLabel.setText("population: " + String.valueOf(population));
        gui.simpleDishCount.setText("кол-во простых блюд на день: " + String.valueOf(totalDishes(totalSaturation(population))));
    }

    public double totalSaturation(int popul) {
        return popul* 1.6;
    }

    public int totalDishes(double saturation) {
        return (int) Math.ceil(saturation / 0.9);
    }


}
