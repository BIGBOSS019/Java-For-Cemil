package AtHome;

public class Home3 {



        private String login;
        private String mail;
        private String secretCode;

        // Установка логина (простая проверка)
        public void setUsername(String name) {
            if (name != null && !name.isEmpty()) {
                this.login = name.trim();
            }
        }


        public void setEmail(String email) {
            if (email == null || !email.contains("@")) {
                System.err.println("Ошибка: некорректный email!");
                return;
            }
            this.mail = email;
        }


        public void setPassword(String pass) {
            if (pass == null || pass.length() < 6) {
                System.err.println("Ошибка: пароль слишком короткий!");
                return;
            }
            this.secretCode = pass;
        }

        
        public void showProfile() {
            System.out.println("=== Данные пользователя ===");
            System.out.println("Логин: " + (login != null ? login : "не указан"));
            System.out.println("Email: " + (mail != null ? mail : "не указан"));
            System.out.println("Пароль: [скрыто]");
        }
    }

