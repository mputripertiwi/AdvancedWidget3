package id.sch.smktelkom_mlg.learn.advancedwidget3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingutil.setContentView(this, R.layout.activity_main);
        binding.setNama(nama);

        
    }
}
