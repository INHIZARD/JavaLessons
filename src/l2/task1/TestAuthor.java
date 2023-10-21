package l2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author vladimir = new Author("Vladimir", "pushkin@gmail.com", 'm');
        System.out.printf("""
                Имя автора: %s
                Электронная почта автора: %s
                Пол автора: %c
                """, vladimir.getName(), vladimir.getEmail(), vladimir.getGender());
        vladimir.setEmail("pushkin@mail.ru");
        System.out.println(vladimir);
    }
}
