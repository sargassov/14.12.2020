public class Worker {
      private String fio;
      private String employee;
      private String email;
      private int salary;
      private long phoneNumber;
      private int age;

      Worker(String fio, String employee, String email, long phoneNumber, int salary, int age){
          this.employee = employee;
          this.fio = fio;
          this.email = email;
          this.salary = salary;
          this.age = age;
          this.phoneNumber = phoneNumber;
      }

    int getAge() {
        return age;
    }

    void info(){
          System.out.println(fio + " working at " + employee + ". Age = " + age + ". \nWith email - " + email +
                  ", has salary = " + salary + ", and phone number - " + phoneNumber);
      }
}
