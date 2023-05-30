package com.sg.vendingmachine;

import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.sg.vendingmachine.ui.UserIO;
import com.sg.vendingmachine.ui.UserIOConsoleImpl;
import com.sg.vendingmachine.ui.VendingMachineView;

public class App {
    UserIO myIO = new UserIOConsoleImpl();
    // Instantiate the View and wire the UserIO implementation into it
    VendingMachineView myView = new VendingMachineView(myIO);
    // Instantiate the DAO
    VendingMachineDao myDao = new VendingMachineDaoFileImpl();
}