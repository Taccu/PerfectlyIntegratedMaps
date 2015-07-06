package P.I.M;

import android.app.Activity;
import android.os.Bundle;

public class Basilia extends Activity
{
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
    
    
}
