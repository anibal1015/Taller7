package co.edu.sena.project_2687365.model.repository;

import co.edu.sena.project_2687365.model.User;
import co.edu.sena.project_2687365.model.User;


import java.sql.SQLException;


public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        co.edu.sena.project_2687365.model.repository.Repository<User> repository = new UserRepositoryImpl();

        System.out.println("========saveObj Insert===========");
        User userInsert1 = new User();
        userInsert1.setUser_firstname("Jose");
        userInsert1.setUser_lastname("Gomez");
        userInsert1.setUser_email("joae@gmail.com");
        userInsert1.setUser_password("gamoe54");
        repository.saveObj(userInsert1);

        User userInsert2 = new User();
        userInsert2.setUser_firstname("Anival");
        userInsert2.setUser_lastname("Novoa");
        userInsert2.setUser_email("aniv@gmail.com");
        userInsert2.setUser_password("astrid85");
        repository.saveObj(userInsert2);


        System.out.println("========== listaObj =========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ===========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("============== saveObj ===========");
        User userUpdate = new User();
        userUpdate.setUser_firstname("andres");
        userUpdate.setUser_lastname("Bastidas");
        userUpdate.setUser_email("anba@gmail.com");
        userUpdate.setUser_password("tidas897");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}

