/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageExpenses;
import java.io.IOException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;

/**
 *
 * @author Naman
 */
public class ManageExpenses 
{
    /**
    * The array corresponding that will store myExpense objects
    */

    Expenses myExpense[] = null;


    /**
    * count: To indicate the total number of records
    * added: To indicate number of records added since the midlet
    * was last opened
    */
    int count;
    int added;

    /**
    * Constructor.
    */

    ManageExpenses()
    {
        myExpense = new Expenses[20];
        count = 0;
        added = 0;
    };

    /**
    * Method to write the current state of Expense object
    * to a record store.
    * This is similar to Serialization of an object
    */
    void writeToDisk() 
    {
        for (int i = count-added; i < count; i++) {
        try
        {
         //   int I = 0;
            myExpense[i].writeToDisk();
        }
        catch (IOException ex)
        {

        }
    }
         
}


      /**
      * Method to read from disk and initialize Expense object
      * It is like Deserialization
      */
    void readFromDisk() 
    {
        try 
        {

            //Open Record Store
            RecordStore SubjectRecord = RecordStore.openRecordStore("ExpRecord", false);

            //Get the length of Record Store in a Length member variable
            int Length = SubjectRecord.getNumRecords();

            //Start From RecordID 1
            int RecordID = 1;

            for (int i = 0; i < Length; i++)
            {
             //   int I = 0;
                myExpense[i] = new Expenses();
                RecordID = myExpense[i].readFromDisk(RecordID);
                count++;
            }
    //Close Record Store
    SubjectRecord.closeRecordStore();
    }
    catch (IOException ex) 
    {
        ex.printStackTrace();
    }
    catch (RecordStoreFullException ex) 
    {
        ex.printStackTrace();
    }
    catch (RecordStoreNotFoundException ex) 
    {
        ex.printStackTrace();
    }
    catch (RecordStoreException ex) 
    {
        ex.printStackTrace();
    }
}

/**

* @param r

* @param a

* @param d

*

* To add a Expense entry in the list

*/

    void addExpense(String r, String a)
    {

        Expenses e = new Expenses();
    
         //e.id = 0;

        e.Reason = r;

         e.Amount = Integer.parseInt(a);
        int Count = 0;

         myExpense[Count++] = e;

         added++;
    }

}
