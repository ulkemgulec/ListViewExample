package ulkem.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomActivity extends AppCompatActivity {

    final List<Animal> animals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        animals.add(new Animal("Cat", R.mipmap.ic_cat2));
        animals.add(new Animal("Bear", R.mipmap.ic_bear));
        animals.add(new Animal("Ant", R.mipmap.ic_ant));
        animals.add(new Animal("Bird", R.mipmap.ic_bird));
        animals.add(new Animal("Dog", R.mipmap.ic_dog));


        ListView listView = findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(animals, this);

        listView.setAdapter(adapter);

    }
}