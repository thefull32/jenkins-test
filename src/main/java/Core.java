public class Core {
    private String device;

    public void Core(String device) {
        this.device = device;
    }

    public void info() {
        System.out.println("The device is " + device);
    }
}
