package joanbonell.cat.udl.gtidic.course2223.unit1.memory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = Uri.parse("https://www.campusigualada.udl.cat");


        Button startGame = findViewById(R.id.startGame);
        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWindow();
            }
        });
    }
    private void openWindow(){
        Uri uri = Uri.parse("https://www.campusigualada.udl.cat");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
}