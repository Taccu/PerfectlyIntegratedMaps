package P.I.M;

import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;

public class Basilia extends Activity
{
    // array which contains all locations
    private ArrayList<BLocation> blocations;
    private Thread t;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    }
    // Called when user is 
    // switching back to app 
    // after first creation
    // i.e. just hides the app
    @Override
    public void onRestart()
    {
        super.onRestart();
        // implement smth
        
    }
    
    // Called when user forcing
    // app to be exited
    // or maybe smth weird happened ^_°
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        //implement smth
        
    }
    private ArrayList<BLocation> getLocationsFromDB(final ArrayList<BLocation> blocations){
        
        // getting locations runs in a thread
        t = new Thread(new Runnable()
        {
            @Override
            public void run(){
                // do smth
                final Location location = new Location("yourprovidername");
                location.setLatitude(1.2345d);
                location.setLongitude(1.2345d);
                blocations.add(new BLocation("asd",location, "Sample description", 0));
            }
        });
        // end of thread
        return blocations;
    }
    // This method should be called 
    // everytime app starts, restarts etc.
    private boolean checkStatusOfApp()
    {
        return true;
    }
}
