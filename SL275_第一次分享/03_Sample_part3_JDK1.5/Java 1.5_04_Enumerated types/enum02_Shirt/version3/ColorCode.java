
public enum ColorCode {
   R ("����"),
   B ("�¦�"),
   G ("���"),
   U ("���w");

  private final String name;

  private ColorCode(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}