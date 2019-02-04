package no.tfjorstad.traniningapp.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import no.tfjorstad.traniningapp.R;

public class NewTrainingRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_trainingrecord);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.newtrainingrecord_menu, menu);
    return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.icon_newTrainingRecord_save:
                ///Save Test test2
        }

        return super.onOptionsItemSelected(item);
    }
}
