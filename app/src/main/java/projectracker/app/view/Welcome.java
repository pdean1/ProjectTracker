package projectracker.app.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import projectracker.app.R;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void Click_OpenViewAddProject(View v) {
        Intent intent = new Intent(v.getContext(), ViewAddProject.class);
        //Bundle bundleOfJoy = new Bundle();
        //bundleOfJoy.putParcelable(ContactAppUtil.CONTACT_KEY, this.contact);
        //intent.putExtras(bundleOfJoy);
        startActivity(intent);
    }
}
