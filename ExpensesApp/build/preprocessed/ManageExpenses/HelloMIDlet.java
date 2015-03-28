    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageExpenses;

import ManageExpenses.ManageExpenses;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.SplashScreen;

/**
 * @author Naman
 */
public class HelloMIDlet extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;

    private boolean flag = false;
    
    private ManageExpenses myexp = new ManageExpenses();
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command exitCommandMenu;
    private Command backCommandView;
    private Command cancelCommandAddForm;
    private Command okCommandAddForm;
    private List menu;
    private List ViewExpenses;
    private Form addExpenseForm;
    private TextField Reason;
    private TextField Amount;
    private SplashScreen splashScreen;
//</editor-fold>//GEN-END:|fields|0|
//    public Object viewExpense;
//    public Object Amount;
//    public Object Reason;

    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {
//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {
//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
switchDisplayable(null, getMenu());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {
//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code>
     * instance is taken from <code>getDisplay</code> method. This method is
     * used by all actions in the design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {
//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {
//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
if (displayable == ViewExpenses) {//GEN-BEGIN:|7-commandAction|1|31-preAction
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|1|31-preAction
                // write pre-action user code here
ViewExpensesAction();//GEN-LINE:|7-commandAction|2|31-postAction
                // write post-action user code here
} else if (command == backCommandView) {//GEN-LINE:|7-commandAction|3|34-preAction
 // write pre-action user code here
switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|4|34-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|5|37-preAction
} else if (displayable == addExpenseForm) {
    if (command == cancelCommandAddForm) {//GEN-END:|7-commandAction|5|37-preAction
 // write pre-action user code here
switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|6|37-postAction
 // write post-action user code here


    } else if (command == okCommandAddForm) {//GEN-LINE:|7-commandAction|7|39-preAction
 // write pre-action user code here
switchDisplayable(null, getSplashScreen());//GEN-LINE:|7-commandAction|8|39-postAction
 // write post-action user code here

        myexp.addExpense(Reason.getString(),Amount.getString() ); 
        Amount.setString("");
        Reason.setString("");
    }//GEN-BEGIN:|7-commandAction|9|24-preAction
} else if (displayable == menu) {
    if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|9|24-preAction
 // write pre-action user code here
menuAction();//GEN-LINE:|7-commandAction|10|24-postAction
 // write post-action user code here
} else if (command == exitCommandMenu) {//GEN-LINE:|7-commandAction|11|27-preAction
 // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|12|27-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|13|42-preAction
} else if (displayable == splashScreen) {
    if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|13|42-preAction
 // write pre-action user code here
switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|14|42-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|15|7-postCommandAction
        }//GEN-END:|7-commandAction|15|7-postCommandAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|16|
//</editor-fold>//GEN-END:|7-commandAction|16|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {
//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
}//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|18-getter|2|





//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommandMenu ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initialized instance of exitCommandMenu component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommandMenu() {
        if (exitCommandMenu == null) {
//GEN-END:|26-getter|0|26-preInit
 // write pre-init user code here
exitCommandMenu = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|26-getter|1|26-postInit
 // write post-init user code here
}//GEN-BEGIN:|26-getter|2|
        return exitCommandMenu;
    }
//</editor-fold>//GEN-END:|26-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommandView ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initialized instance of backCommandView component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommandView() {
        if (backCommandView == null) {
//GEN-END:|33-getter|0|33-preInit
 // write pre-init user code here
backCommandView = new Command("Back", Command.BACK, 0);//GEN-LINE:|33-getter|1|33-postInit
 // write post-init user code here
}//GEN-BEGIN:|33-getter|2|
        return backCommandView;
    }
//</editor-fold>//GEN-END:|33-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: cancelCommandAddForm ">//GEN-BEGIN:|36-getter|0|36-preInit
    /**
     * Returns an initialized instance of cancelCommandAddForm component.
     *
     * @return the initialized component instance
     */
    public Command getCancelCommandAddForm() {
        if (cancelCommandAddForm == null) {
//GEN-END:|36-getter|0|36-preInit
 // write pre-init user code here
cancelCommandAddForm = new Command("Cancel", Command.CANCEL, 0);//GEN-LINE:|36-getter|1|36-postInit
 // write post-init user code here
}//GEN-BEGIN:|36-getter|2|
        return cancelCommandAddForm;
    }
//</editor-fold>//GEN-END:|36-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommandAddForm ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initialized instance of okCommandAddForm component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommandAddForm() {
        if (okCommandAddForm == null) {
//GEN-END:|38-getter|0|38-preInit
 // write pre-init user code here
okCommandAddForm = new Command("Ok", Command.OK, 0);//GEN-LINE:|38-getter|1|38-postInit
 // write post-init user code here
}//GEN-BEGIN:|38-getter|2|
        return okCommandAddForm;
    }
//</editor-fold>//GEN-END:|38-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: menu ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initialized instance of menu component.
     *
     * @return the initialized component instance
     */
    public List getMenu() {
        if (menu == null) {
//GEN-END:|22-getter|0|22-preInit
 // write pre-init user code here
menu = new List("menu", Choice.IMPLICIT);//GEN-BEGIN:|22-getter|1|22-postInit
            menu.append("Add Expense", null);
            menu.append("View Expense", null);
            menu.addCommand(getExitCommandMenu());
            menu.setCommandListener(this);
            menu.setSelectedFlags(new boolean[]{false, false});//GEN-END:|22-getter|1|22-postInit
 // write post-init user code here
}//GEN-BEGIN:|22-getter|2|
        return menu;
    }
//</editor-fold>//GEN-END:|22-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: menuAction ">//GEN-BEGIN:|22-action|0|22-preAction
    /**
     * Performs an action assigned to the selected list element in the menu
     * component.
     */
    public void menuAction() {
//GEN-END:|22-action|0|22-preAction
 // enter pre-action user code here
String __selectedString = getMenu().getString(getMenu().getSelectedIndex());//GEN-BEGIN:|22-action|1|28-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Add Expense")) {//GEN-END:|22-action|1|28-preAction
 // write pre-action user code here
switchDisplayable(null, getAddExpenseForm());//GEN-LINE:|22-action|2|28-postAction
 // write post-action user code here
} else if (__selectedString.equals("View Expense")) {//GEN-LINE:|22-action|3|29-preAction
 // write pre-action user code here
switchDisplayable(null, getViewExpenses());//GEN-LINE:|22-action|4|29-postAction
 // write post-action user code here

       if(!flag)
        {
            myexp.readFromDisk();
            flag = true;
        }
        for (int i = ViewExpenses.size();  i < myexp.count;i++)
        {
            ViewExpenses.append(myexp.myExpense[i].Reason+" : "+myexp.myExpense[i].Amount , null);
        }
            }//GEN-BEGIN:|22-action|5|22-postAction
        }//GEN-END:|22-action|5|22-postAction
 // enter post-action user code here
}//GEN-BEGIN:|22-action|6|
//</editor-fold>//GEN-END:|22-action|6|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: ViewExpenses ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initialized instance of ViewExpenses component.
     *
     * @return the initialized component instance
     */
    public List getViewExpenses() {
        if (ViewExpenses == null) {
//GEN-END:|30-getter|0|30-preInit
 // write pre-init user code here
ViewExpenses = new List("ViewExapenses", Choice.IMPLICIT);//GEN-BEGIN:|30-getter|1|30-postInit
            ViewExpenses.addCommand(getBackCommandView());
            ViewExpenses.setCommandListener(this);//GEN-END:|30-getter|1|30-postInit
 // write post-init user code here
}//GEN-BEGIN:|30-getter|2|
        return ViewExpenses;
    }
//</editor-fold>//GEN-END:|30-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: ViewExpensesAction ">//GEN-BEGIN:|30-action|0|30-preAction
    /**
     * Performs an action assigned to the selected list element in the
     * ViewExpenses component.
     */
    public void ViewExpensesAction() {
//GEN-END:|30-action|0|30-preAction
 // enter pre-action user code here
String __selectedString = getViewExpenses().getString(getViewExpenses().getSelectedIndex());//GEN-LINE:|30-action|1|30-postAction
 // enter post-action user code here
}//GEN-BEGIN:|30-action|2|
//</editor-fold>//GEN-END:|30-action|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: addExpenseForm ">//GEN-BEGIN:|35-getter|0|35-preInit
    /**
     * Returns an initialized instance of addExpenseForm component.
     *
     * @return the initialized component instance
     */
    public Form getAddExpenseForm() {
        if (addExpenseForm == null) {
//GEN-END:|35-getter|0|35-preInit
 // write pre-init user code here
addExpenseForm = new Form("form1", new Item[]{getReason(), getAmount()});//GEN-BEGIN:|35-getter|1|35-postInit
            addExpenseForm.addCommand(getCancelCommandAddForm());
            addExpenseForm.addCommand(getOkCommandAddForm());
            addExpenseForm.setCommandListener(this);//GEN-END:|35-getter|1|35-postInit
 // write post-init user code here
}//GEN-BEGIN:|35-getter|2|
        return addExpenseForm;
    }
//</editor-fold>//GEN-END:|35-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|40-getter|0|40-preInit
    /**
     * Returns an initialized instance of splashScreen component.
     *
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {
//GEN-END:|40-getter|0|40-preInit
 // write pre-init user code here
splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|40-getter|1|40-postInit
            splashScreen.setTitle("splashScreen");
            splashScreen.setCommandListener(this);
            splashScreen.setText("Expense added Successfully");//GEN-END:|40-getter|1|40-postInit
 // write post-init user code here
}//GEN-BEGIN:|40-getter|2|
        return splashScreen;
    }
//</editor-fold>//GEN-END:|40-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Reason ">//GEN-BEGIN:|51-getter|0|51-preInit
    /**
     * Returns an initialized instance of Reason component.
     *
     * @return the initialized component instance
     */
    public TextField getReason() {
        if (Reason == null) {
//GEN-END:|51-getter|0|51-preInit
 // write pre-init user code here
Reason = new TextField("Reason", "<null>", 32, TextField.ANY);//GEN-LINE:|51-getter|1|51-postInit
 // write post-init user code here
}//GEN-BEGIN:|51-getter|2|
        return Reason;
    }
//</editor-fold>//GEN-END:|51-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Amount ">//GEN-BEGIN:|52-getter|0|52-preInit
    /**
     * Returns an initialized instance of Amount component.
     *
     * @return the initialized component instance
     */
    public TextField getAmount() {
        if (Amount == null) {
//GEN-END:|52-getter|0|52-preInit
 // write pre-init user code here
Amount = new TextField("Amount", null, 32, TextField.ANY);//GEN-LINE:|52-getter|1|52-postInit
 // write post-init user code here
}//GEN-BEGIN:|52-getter|2|
        return Amount;
    }
//</editor-fold>//GEN-END:|52-getter|2|

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        
        try
        {
            myexp.writeToDisk();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
    
}
