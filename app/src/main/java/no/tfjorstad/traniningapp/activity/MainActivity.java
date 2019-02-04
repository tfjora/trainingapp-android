package no.tfjorstad.traniningapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import no.tfjorstad.traniningapp.R;
import no.tfjorstad.traniningapp.adapter.TrainingAdapter;
import no.tfjorstad.traniningapp.service.TrainingService;

public class MainActivity extends AppCompatActivity {

    private TrainingService trainingService;
    private TrainingAdapter trainingAdapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.new_traingsrec:
                newTraining();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void newTraining() {
        Intent intent = new Intent(getApplicationContext(), NewTrainingRecord.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trainingService = new TrainingService();
        trainingAdapter = new TrainingAdapter(trainingService.getTrainings(), getApplicationContext());

        RecyclerView recyclerView = findViewById(R.id.recyclerview_main_trainings);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(trainingAdapter);

    }
}
