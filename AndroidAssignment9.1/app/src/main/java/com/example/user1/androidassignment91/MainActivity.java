package com.example.user1.androidassignment91;

/*
This  Assignment is just an exmple of option menu
it will change color of text view by clicking on menu optoin
 */

// required classes imported
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


// class Starts here
public class MainActivity extends AppCompatActivity {

    // some private reference variables.
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();// support for action bar

        // Id assigned to text view.
        text = (TextView) findViewById(R.id.helloworld);


    }


    @Override
    // this methods creats option menu layout with help of menuiflater
    public boolean onCreateOptionsMenu(Menu menu) {

        // menu infalter to inflat menu in layout
        MenuInflater menuifalte=getMenuInflater();
        menuifalte.inflate(R.menu.menu,menu);



        return true;
    }


    @RequiresApi(api = Build.VERSION_CODES.M)

    @Override

    // this method is to permofer action on the click of menu option
    public boolean onOptionsItemSelected(MenuItem item) {

        int id= item.getItemId();

        if(id== R.id.item1){
          text.setTextColor(getColor(R.color.colorPrimary));


    }else if(id== R.id.item2){

            text.setTextColor(getColor(R.color.colorPrimaryDark));

        }else if(id== R.id.item3){
            text.setTextColor(getColor(R.color.colorAccent));

        }

        return super.onOptionsItemSelected(item);
    }
}