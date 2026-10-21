public enum Fluids {
    TAP_WATER("kranvatten"),
    PROTEIN_DRINK("proteindryck"),
    MINERAL_WATER("mineralvatten");

    private final String name;
    //Skapar ett visningsnamn för varje vätsketyp
    Fluids(String name) {
        this.name = name;
    }
    // Returnerar vätskans visningsnamn
    public String getName() {
        return name;
    }

}

