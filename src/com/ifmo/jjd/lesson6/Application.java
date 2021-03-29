package com.ifmo.jjd.lesson6;

public class Application {
    public static void main(String[] args) {
        Climber climber1 = new Climber(); // вызов конструктора
        // обращение к свойствам объекта
       /* climber1.fullName = "Иван Григорьев";
        climber1.email = "igrigorev@mail.ru"; // обращение к свойству недоступно потому что объект закрыт свойством private
        climber1.age = 34;
        climber1.uuid = UUID.randomUUID();
        */
        climber1.setFullName("Иван Григорьев");
        climber1.setAge(34);
        climber1.setEmail("ivan@mail.ru");
        climber1.setUuid();


        Climber climber2 = new Climber();
        climber2.setAge(19);
        climber2.setFullName("Елена Михайловна");
        climber2.setEmail("helena@mail.ru");
        climber2.setUuid();
        /*
        // обращение к свойствам объекта
        climber2.fullName = "Елена Михайловна";
        climber2.email = "emikhaylova@gmail.com";
        climber2.age = 27;
        climber2.uuid = UUID.randomUUID();
        */
        int helenaAge = climber2.getAge();

        System.out.println(helenaAge);
        System.out.println(climber1);
        System.out.println(climber2);

        Mountain everest  = new Mountain("Эверест",8000);
        Mountain elbrus = new Mountain("Эльбрус",6000);

        Mountain defaultMountain = new Mountain();

        System.out.println(everest);
        System.out.println(elbrus);


    }
}
