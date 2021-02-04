package mcm.edu.ph.parcia_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);

        TextView txtLore = findViewById(R.id.storyBackground);
        txtLore.setText("You've been training for your whole life and became strong and want to beat or destroy your enemies");

        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        TextView outcome = findViewById(R.id.outcome);
        TextView storyBackground = findViewById(R.id.storyBackground);

        if (view.getId() == R.id.btnDecision1) {
            storyBackground.setText("One day a bald guy appears");
            outcome.setText
                    ("Decision 1: You tease him with his hair. \n \n" + "Decision 2: bend down and say all hail the bald men");
            if (view.getId() == R.id.btnDecision1) {
                storyBackground.setText("You managed to make the bald guy smile. What are you gonna do next");
                if (view.getId() == R.id.btnDecision1)
                    storyBackground.setText("Ask him to be your master");
            }
            if(view.getId() == R.id.btnDecision2){
                storyBackground.setText("Bring him to your apartment");
            }

            }
        else if (view.getId() == R.id.btnDecision2){
            storyBackground.setText("You found a enemy in a distant. What will you do?");
        }
        }
    }