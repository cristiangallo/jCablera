package dataDB;

import entidades.User;

/**
 * Created by cgallo on 06/06/20.
 */

public class CatalogoUsers {

    private static CatalogoUsers instancia;

    public static CatalogoUsers getInstance() {
        if(instancia == null){
            instancia = new CatalogoUsers();
        }
        return instancia;
    }
    // hago privado el constructor para que nadie pueda instanciar
    private CatalogoUsers() {}

    public User getUser(String username, String password) {
        User user = DBUser.getUser(username, password);
        return user;
    }

    public void save(User user) {
        DBUser.save(user);
    }
}
