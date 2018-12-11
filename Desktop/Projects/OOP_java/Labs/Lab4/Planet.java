
  public class Planet implements Nameable {
    x
    private String PlanetName;

    public Planet() { }
    public Planet(String planet) {
        PlanetName = planet;
    }

    public void setPlanetName(String name) {
        PlanetName = name;
    }
    public void changeName(String newName) {
        PlanetName = newName;
    }

    public String getName() {
        return PlanetName;
    }
}
