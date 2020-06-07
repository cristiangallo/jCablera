package dataDB;

import appExceptions.appException;
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

    // hago privado el constructor para que nadie pueda instanciarlo
    private CatalogoUsers() {}

    public User getUser(String username, String password) throws appException  {
        User user = DBUser.getUser(username, password);
        if (user == null) throw new appException("Nombre de usuario o contraseña inválida.");
        return user;
    }

    public User login(String username, String password) throws appException {
        User user = this.getUser(username, password);
        if (user.getIsActive()) throw new appException("Usuario inactivo.");
        return user;
    }

    public void save(User user) {
        DBUser.save(user);
    }

}
