package Lab9;

public class AnimalWithBuilder {
    private String name;
    private boolean flyable;
    private int speed;

    private AnimalWithBuilder() {
    }

    protected AnimalWithBuilder(Builder builder) {
        name = builder.name;
        flyable = builder.flyable;
        speed = builder.speed;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "name='" + name + '\'' +
                ", flyable=" + flyable +
                ", speed=" + speed +
                '}';
    }

    //Inner Class
    public static class Builder {
        private String name;
        private boolean flyable;
        private int speed;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public AnimalWithBuilder builder() {
            return new AnimalWithBuilder(this);
        }
    }
}
