package Entities;

import Enums.Branch;
import Interfaces.Controller;

public class Investor extends User implements Controller {

    public Investor(Profile profile, String username, String password) {
        super(profile, username, password);
    }

    @Override
    public void execute(Branch branch) {

    }
}
