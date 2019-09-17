package EffectiveJavaFolder.effectiveJava.chapter2.item2;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fact;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        //请求参数
        private final int servingSize;
        private final int servings;
        //可选参数，初始化为默认值
        private int calories = 0;
        private int fact = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize,int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }
        public Builder fact(int val) {
            fact = val;
            return this;
        }
        public Builder sodium(int val) {
            sodium = val;
            return this;
        }
        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fact = builder.fact;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new Builder(204, 8)
                .calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola);
    }
}
