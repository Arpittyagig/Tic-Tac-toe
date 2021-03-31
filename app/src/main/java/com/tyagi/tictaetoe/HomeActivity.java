package com.tyagi.tictaetoe;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
 Button start_btn;
 ConstraintLayout start_layout;
 LinearLayout game_layout;
 ImageView r1c1,r1c2,r1c3,r2c1,r2c2,r2c3,r3c1,r3c2,r3c3;


 int[][] state={{0,0,0},{0,0,0},{0,0,0}};


 boolean player_turn=true;  //true for player 1
    TextView player_turnn;


    Dialog d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        start_btn=findViewById(R.id.button);
        start_layout=findViewById(R.id.start_layout);
        game_layout=findViewById(R.id.game_layout);

        player_turnn=findViewById(R.id.textView5);


        r1c1=findViewById(R.id.imageViewr1c1);
        r1c2=findViewById(R.id.imageViewr1c2);
        r1c3=findViewById(R.id.imageViewr1c3);
        r2c1=findViewById(R.id.imageViewr2c1);
        r2c2=findViewById(R.id.imageViewr2c2);
        r2c3=findViewById(R.id.imageViewr2c3);
        r3c1=findViewById(R.id.imageViewr3c1);
        r3c2=findViewById(R.id.imageViewr3c2);
        r3c3=findViewById(R.id.imageViewr3c3);


        r1c1.setOnClickListener(this);
        r1c2.setOnClickListener(this);
        r1c3.setOnClickListener(this);
        r2c1.setOnClickListener(this);
        r2c2.setOnClickListener(this);
        r2c3.setOnClickListener(this);
        r3c1.setOnClickListener(this);
        r3c2.setOnClickListener(this);
        r3c3.setOnClickListener(this);

        d=new Dialog(HomeActivity.this);


        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_layout.setVisibility(View.GONE);
                game_layout.setVisibility(View.VISIBLE);
                player_turnn.setVisibility(View.VISIBLE);
            }
        });


    }
// event listener for all click event
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageViewr1c1:
                // first player
                if (state[0][0]==0){
                    if(player_turn==true){
                    r1c1.setImageResource(R.drawable.cross);
                    state[0][0]=1;
                    player_turn=false;
                    player_turn(player_turn);
                        check_win_state();

                }
                    //second player
                else {
                    r1c1.setImageResource(R.drawable.o);
                    state[0][0]=2;
                    player_turn=true;
                    player_turn(player_turn);
                        check_win_state();
                }}

                    break;

            case R.id.imageViewr1c2:
                // first player
                if (state[0][1]==0){
                    if(player_turn==true){
                        r1c2.setImageResource(R.drawable.cross);
                        state[0][1]=1;
                        player_turn=false;
                        player_turn(player_turn);
                        check_win_state();

                    }
                    //second player
                    else {
                        r1c2.setImageResource(R.drawable.o);
                        state[0][1]=2;
                        player_turn=true;
                        player_turn(player_turn);
                        check_win_state();
                    }}

                break;

            case R.id.imageViewr1c3:
                // first player
                if (state[0][2]==0){
                    if(player_turn==true){
                        r1c3.setImageResource(R.drawable.cross);
                        state[0][2]=1;
                        player_turn=false;
                        player_turn(player_turn);
                        check_win_state();
                    }
                    //second player
                    else {
                        r1c3.setImageResource(R.drawable.o);
                        state[0][2]=2;
                        player_turn=true;
                        player_turn(player_turn);
                        check_win_state();
                    }}

                break;
            case R.id.imageViewr2c1:

                // first player
                if (state[1][0]==0){
                    if(player_turn==true){
                        r2c1.setImageResource(R.drawable.cross);
                        state[1][0]=1;
                        player_turn=false;
                        player_turn(player_turn);
                        check_win_state();

                    }
                    //second player
                    else {
                        r2c1.setImageResource(R.drawable.o);
                        state[1][0]=2;
                        player_turn=true;
                        player_turn(player_turn);
                        check_win_state();
                    }}

                break;
            case R.id.imageViewr2c2:
                // first player
                if (state[1][1]==0){
                    if(player_turn==true){
                        r2c2.setImageResource(R.drawable.cross);
                        state[1][1]=1;
                        player_turn=false;
                        player_turn(player_turn);
                        check_win_state();

                    }
                    //second player
                    else {
                        r2c2.setImageResource(R.drawable.o);
                        state[1][1]=2;
                        player_turn=true;
                        player_turn(player_turn);
                        check_win_state();
                    }}

                break;
            case R.id.imageViewr2c3:
                // first player
                if (state[1][2]==0){
                    if(player_turn==true){
                        r2c3.setImageResource(R.drawable.cross);
                        state[1][2]=1;
                        player_turn=false;
                        player_turn(player_turn);
                        check_win_state();

                    }
                    //second player
                    else {
                        r2c3.setImageResource(R.drawable.o);
                        state[1][2]=2;
                        player_turn=true;
                        player_turn(player_turn);
                        check_win_state();
                    }}

                break;
            case R.id.imageViewr3c1:
                // first player
                if (state[2][0]==0){
                    if(player_turn==true){
                        r3c1.setImageResource(R.drawable.cross);
                        state[2][0]=1;
                        player_turn=false;
                        player_turn(player_turn);
                        check_win_state();

                    }
                    //second player
                    else {
                        r3c1.setImageResource(R.drawable.o);
                        state[2][0]=2;
                        player_turn=true;
                        player_turn(player_turn);
                        check_win_state();
                    }}

                break;
            case R.id.imageViewr3c2:
                // first player
                if (state[2][1]==0){
                    if(player_turn==true){
                        r3c2.setImageResource(R.drawable.cross);
                        state[2][1]=1;
                        player_turn=false;
                        player_turn(player_turn);
                        check_win_state();

                    }
                    //second player
                    else {
                        r3c2.setImageResource(R.drawable.o);
                        state[2][1]=2;
                        player_turn=true;
                        player_turn(player_turn);
                        check_win_state();
                    }}

                break;
            case R.id.imageViewr3c3:
                // first player
                if (state[2][2]==0){
                    if(player_turn==true){
                        r3c3.setImageResource(R.drawable.cross);
                        state[2][2]=1;
                        player_turn=false;
                        player_turn(player_turn);
                        check_win_state();
                    }
                    //second player
                    else {
                        r3c3.setImageResource(R.drawable.o);
                        state[2][2]=2;
                        player_turn=true;
                        player_turn(player_turn);
                        check_win_state();
                    }}
                break;
        }//switch close

    }//onclick close

    public void player_turn(Boolean a){

        if(a==true){player_turnn.setText("Player 1 Turn");}
        if(a==false){player_turnn.setText("Player 2 Turn");}

    }

    public void check_win_state(){
        // 1st check row to row
        if((state[0][0]==state[0][1]&& state[0][1]==state[0][2])&&(state[0][0]==1 || state[0][0]==2)){
            if(state[0][0]==1){win_alert(1);}
            if(state[0][0]==2){win_alert(2);}
        }
        // 2nd check  row to row
        if((state[1][0]==state[1][1]&& state[1][1]==state[1][2])&&(state[1][0]==1 || state[1][0]==2)){
            if(state[1][0]==1){win_alert(1);}
            if(state[1][0]==2){win_alert(2);}
        }
        // 3rd check row to row
        if((state[2][0]==state[2][1]&& state[2][1]==state[2][2])&&(state[2][0]==1 || state[2][0]==2)){
            if(state[2][0]==1){win_alert(1);}
            if(state[2][0]==2){win_alert(2);}
        }
        // 4th check coloumn to coloumn
        if((state[0][0]==state[1][0]&& state[1][0]==state[2][0])&&(state[0][0]==1 || state[0][0]==2)){
            if(state[0][0]==1){win_alert(1);}
            if(state[0][0]==2){win_alert(2);}
        }
        // 5th check coloumn to coloumn
        if((state[0][1]==state[1][1]&& state[1][1]==state[2][1])&&(state[0][1]==1 || state[0][1]==2)){
            if(state[0][1]==1){win_alert(1);}
            if(state[0][1]==2){win_alert(2);}
        }
        // 6th check coloumn to coloumn
        if((state[0][2]==state[1][2]&& state[1][2]==state[2][2])&&(state[0][2]==1 || state[0][2]==2)){
            if(state[0][2]==1){win_alert(1);}
            if(state[0][2]==2){win_alert(2);}
        }
        // 7th check  cross
        if((state[0][0]==state[1][1]&& state[1][1]==state[2][2])&&(state[0][0]==1 || state[0][0]==2)){
            if(state[0][0]==1){win_alert(1);}
            if(state[0][0]==2){win_alert(2);}
        }
        // 8th check cross
        if((state[0][2]==state[1][1]&& state[1][1]==state[2][0])&&(state[0][2]==1 || state[0][2]==2)){
            if(state[0][2]==1){win_alert(1);}
            if(state[0][2]==2){win_alert(2);}
        }
    }// check win state close
    public void win_alert(int a){
       // Toast.makeText(this, "player "+a+"wins", Toast.LENGTH_SHORT).show();

        d.setContentView(R.layout.custom_design);
        d.setCancelable(false);
        d.show();
        TextView show_winner;
        Button restart;
        show_winner=d.findViewById(R.id.textView6);
        restart=d.findViewById(R.id.button3);
        show_winner.setText(("Player"+a+"Win").toString());
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.cancel();
                reset();

            }
        });
//reset();

    }
    public void reset(){
        player_turn=true;
        player_turnn.setText("Player 1");
        r1c1.setImageResource(R.drawable.smile);
        r1c2.setImageResource(R.drawable.smile);
        r1c3.setImageResource(R.drawable.smile);
        r2c1.setImageResource(R.drawable.smile);
        r2c2.setImageResource(R.drawable.smile);
        r2c3.setImageResource(R.drawable.smile);
        r3c1.setImageResource(R.drawable.smile);
        r3c2.setImageResource(R.drawable.smile);
        r3c3.setImageResource(R.drawable.smile);
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                state[i][j]=0;
            }
        }
    }
    //option menu start
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate1=getMenuInflater();
        inflate1.inflate(R.menu.custom_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Reset:
                reset();
                break;
            case R.id.screenshot: finish();
                break;
            case R.id.Exit: finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    //menu end
   //  back button alert box start
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        AlertDialog.Builder al=new AlertDialog.Builder(HomeActivity.this);
        al.setMessage("Do you want close app");
        al.setCancelable(true);
        al.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        al.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog a=al.create();
        a.show();
    }
    // alert box end
}