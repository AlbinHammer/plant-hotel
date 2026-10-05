public enum Fluids {
        TAP_WATER("Kranvatten", 0.5),
        PROTEINDRINK("Proteindryck", 0.1),
        MINERAL_WATER("Mineralvatten", 0.2);

        private String name;
        private double volume;
        Fluids(String name, double volume) {
            this.name = name;
            this.volume = volume;

        }
    }

