package de.tubs.ibr.dtn.todo;

import de.tubs.ibr.dtn.todo.R;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onResume() {
		refresh();
		super.onResume();
	}

	private void refresh() {
		
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);

		// check if the screen is active
		PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
		Boolean screenOn = pm.isScreenOn();
		
		String presence_nick = preferences.getString("editNickname", "Nobody");
		
		//TextView nicknameLabel = (TextView)findViewById(R.id.labelTitleBar);
		//nicknameLabel.setText(presence_nick);
	}
}