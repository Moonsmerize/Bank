package Utilities;

import Enums.Branch;
import Interfaces.Controller;

public class Logout implements Controller {

    @Override
    public void execute(Branch branch) {
        Main.logoutValidator = 0;
    }

}