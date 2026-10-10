public enum Fluids {
        TAP_WATER("kranvatten"),
        PROTEIN_DRINK("proteindryck"),
        MINERAL_WATER("mineralvatten");

        private final String name;

        Fluids(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

    }

