package Interfaces;

import Enums.Branch;

@FunctionalInterface
public interface Controller {
    void execute(Branch branch);
}
