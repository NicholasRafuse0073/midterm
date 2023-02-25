package nicholas.rafuse.n01440073.mid.ni;
//Nicholas Rafuse, N01440073, CENG-258-0NB
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class NicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton = findViewById(R.id.nicImage);
        imageButton.setOnClickListener(view -> openActivity());
    }

    public void openActivity(){
        Intent intent = new Intent(this, NicActivity2.class);
        startActivity(intent);
    }

}