public class Main {
    public static void main(String[] args) {
        int simulationMinutes = 2; // Simulate for 2 minutes

        // 3 tellers, max queue length 5
        BankQueue bankQueue = new BankQueue(3, 5);  

        QueueSimulator simulator = new QueueSimulator(simulationMinutes, bankQueue);
        simulator.simulate();
        simulator.printResults();
    }
}
