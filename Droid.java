public class Droid {
  int batteryLevel;
  String name;
  
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
  }

  public int energyReport() {
    System.out.println("Current energy level for " + name + " is " + batteryLevel);
    return batteryLevel;
  }

  public void energyTransfer(Droid droid) {
    int tempBatteryLevel = this.batteryLevel;
    this.batteryLevel = droid.batteryLevel;
    droid.batteryLevel = tempBatteryLevel;
    System.out.println(name + " transferred " + tempBatteryLevel + " energy to " + droid.name);
  }

  public String toString() {
    return "Hello, I'm the droid: " + name;
  }

  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("drinking");
    codey.energyReport();

    System.out.println();

    Droid mikel = new Droid("Mikel");
    System.out.println(mikel);
    mikel.performTask("biking");
    mikel.performTask("writing java");
    mikel.performTask("watching football");
    mikel.energyReport();

    System.out.println();

    codey.energyTransfer(mikel);

    codey.energyReport();
    mikel.energyReport();

  }
}
