public class Program {
    public static void main(String[] args) {
        WorkersRepository repository = new WorkersRepository();

        for(Worker worker : repository.getWorkersRepository()){
            if(worker.getAge() > 40) worker.info();
        }
    }
}
