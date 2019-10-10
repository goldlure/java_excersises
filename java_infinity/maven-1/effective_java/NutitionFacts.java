package inna.effective_java.NutritionFacts;

public class NutritionFacts{
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        //Required parameters
        private final int servingSize;
        private final int servings;

        //Optional parameters - initialized to default values
        private final int calories = 0;
        private final int fat = 0;
        private final int sodium = 0;
        private final int carbohydrate = 0;
        
        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int val)
            { calories = val; return this; }
        public Builder fat(int val)
            { fat = val; return this; }
        public Builder sodium(int val)
            { sodium = val; return this; }
        public Builder carbohydrate(int val)
            { carbohydrate = val; return this; }
        
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
    public void print(){
        System.out.println(this.servingSize);
    }
}