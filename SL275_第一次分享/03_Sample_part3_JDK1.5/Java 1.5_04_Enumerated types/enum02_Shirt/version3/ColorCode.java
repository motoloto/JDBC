
public enum ColorCode {
   R ("紅色"),
   B ("黑色"),
   G ("綠色"),
   U ("未定");

  private final String name;

  private ColorCode(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}