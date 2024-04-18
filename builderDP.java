public class Pizza {
    private final String dough;
    private final String sauce;
    private final String topping;

    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    // Getters for pizza properties

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    // Builder class for creating Pizza objects
    public static class Builder {
        // Required parameters
        private final String dough;
        private final String sauce;

        // Optional parameters - initialized to default values
        private String topping = "cheese";

        public Builder(String dough, String sauce) {
            this.dough = dough;
            this.sauce = sauce;
        }

        // Method to set optional topping
        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        // Method to build Pizza object
        public Pizza build() {
            return new Pizza(this);
        }
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Thin crust", "Tomato").topping("Mushrooms").build();
        System.out.println("Dough: " + pizza.getDough());
        System.out.println("Sauce: " + pizza.getSauce());
        System.out.println("Topping: " + pizza.getTopping());
    }
}
