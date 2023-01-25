package client;

import model.User;
import repository.Persistable;
import repository.Reportable;
import repository.UserConsolePersistable;
import repository.UserConsoleReporter;


import java.util.ArrayList;
import java.util.List;

public class ApplicationStartup {
    public static void startApp() {
        Persistable user = new UserConsolePersistable(new User("Jon"));

        Reportable user1 = new UserConsoleReporter(new User("Alex"));


        List<Persistable> listModel = new ArrayList<>();
        List<Reportable> listModel2 = new ArrayList<>();

        listModel.add(user);
        listModel2.add(user1);

        for (Persistable model : listModel) {
            model.save();
        }
        for (Reportable model : listModel2) {
            model.report();
        }
    }

}


