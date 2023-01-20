public class main {

    public static void main(String[] args) {

        Post post = new Post();

        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.month = 06;
        post.birthday.year = 1999;


        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.pasport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = Boolean.valueOf("true");



        // заполните другие поля
    }
}
