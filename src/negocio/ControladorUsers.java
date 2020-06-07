package negocio;

import appExceptions.appException;
import dataDB.CatalogoUsers;
import entidades.User;

/**
 * Created by cgallo on 06/06/2020.
 */

public class ControladorUsers {
    public ControladorUsers(){};

    private CatalogoUsers catUsers = CatalogoUsers.getInstance();

    public User login(String username, String password) throws appException {
        User user = catUsers.login(username, password);
        return user;
    }
    /**
     * Launch the application.
     */
    public static void main(String[] args) {


                try {
                    ControladorUsers ctrlUsers = new ControladorUsers();
                    ctrlUsers.login("cgallo", "popo");
                } catch (Exception e) {
                    e.printStackTrace();
                }


    }


}
