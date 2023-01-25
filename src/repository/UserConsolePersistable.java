package repository;

import model.UserModel;

public class UserConsolePersistable implements Persistable{
    private UserModel userModel;
    public UserConsolePersistable(UserModel userModel){
        this.userModel = userModel;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + userModel.getName());
    }
}
