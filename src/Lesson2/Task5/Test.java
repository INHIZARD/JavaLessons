package Lesson2.Task5;

public class Test {
    public static void main(String[] args) throws Exception {
        try {
            Dog dog1 = new Dog("Bob", 10);
            Dog dog2 = new Dog("Lil", 14);
            Dog dog3 = new Dog("Bimbo", 5);

            DogKennel kennel = new DogKennel();
            System.out.printf("Сейчас в питомнике такие собаки:\n%s\n", kennel);
            kennel.addDog(dog1, dog2);
            System.out.printf("Сейчас в питомнике такие собаки:\n%s\n", kennel);
            kennel.addDog(dog3);
            System.out.printf("Сейчас в питомнике такие собаки:\n%s\n", kennel);
        }
        catch (Exception e){
            System.out.printf("%s", e.getMessage());
        }
    }
}
