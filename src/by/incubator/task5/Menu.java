package by.incubator.task5;

public class Menu {

    private final Writer writer;

    public Menu() {
        this.writer = new Writer();
    }

    public void start() {
        MonitoringSystem generalModule = getGeneralModule();

        MonitoringSystem bugModule = getBugModule();

        MonitoringSystem securityModule = getSecurityModule();

        generalModule.startMonitoring();
        bugModule.startMonitoring();
        securityModule.startMonitoring();
    }

    private MonitoringSystem getGeneralModule() {
        return () -> writer.print("Monitoring of general indicators has started!");
    }

    private MonitoringSystem getBugModule() {
        return () -> writer.print("Bug tracking monitoring has started!");
    }

    private MonitoringSystem getSecurityModule() {
        return () -> writer.print("Security monitoring has started!");
    }
}
