package com.example.android.abrilcultural;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    private AppBarLayout mAppBarLayout;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy",new Locale("es","ES"));
    private CompactCalendarView mCompactCalendarView;
    Date date;
    private boolean isExpanded = false;
    private BlankFragment frag;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
       //int position = pager.getCurrentItem();
       // outState.putInt("Key", position );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            int  position= savedInstanceState.getInt("Key");
            Log.d("posicion pager",String.valueOf(position));
           // pager.setCurrentItem(position);
        }
        //getSupportFragmentManager().popBackStack();

        setContentView(R.layout.activity_main);
        frag=BlankFragment.newInstance("1");
         getSupportFragmentManager().beginTransaction()
                 .add(R.id.fragment,frag).commit();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Eventos del");


        mAppBarLayout = (AppBarLayout) findViewById(R.id.app_bar_layout);

        // Set up the CompactCalendarView
        mCompactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);

        // Force English

        mCompactCalendarView.setLocale(TimeZone.getDefault(),new Locale("es","ES"));
        mCompactCalendarView.setShouldDrawDaysHeader(true);
        mCompactCalendarView.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                setSubtitle(dateFormat.format(dateClicked));
                int dia;
                Calendar cal=Calendar.getInstance();
                cal.setTime(dateClicked);
                 dia=cal.get(Calendar.DAY_OF_MONTH);
                 cambiarFragment(String.valueOf(dia));
                 Log.d("dia del mes",String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                setSubtitle(dateFormat.format(firstDayOfNewMonth));
            }
        });

        String someDate = "01-04-2017";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy",new Locale("es","ES"));
        try {

            date = sdf.parse(someDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // Set current date to today
        setCurrentDate(date);
        final ImageView arrow = (ImageView) findViewById(R.id.date_picker_arrow);

        RelativeLayout datePickerButton = (RelativeLayout) findViewById(R.id.date_picker_button);

        datePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isExpanded) {
                    ViewCompat.animate(arrow).rotation(0).start();
                    mAppBarLayout.setExpanded(false, true);
                    isExpanded = false;
                } else {
                    ViewCompat.animate(arrow).rotation(180).start();
                    mAppBarLayout.setExpanded(true, true);
                    isExpanded = true;
                }
            }
        });
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
// Esto es lo que hace mi botón al pulsar ir a atrás

            setCurrentDate(date);
           // Toast.makeText(getApplicationContext(), "Voy hacia atrás!!",
             //       Toast.LENGTH_SHORT).show();
           // return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void setCurrentDate(Date date) {

        Log.d("fecha de spiker", date.toString());

        setSubtitle(dateFormat.format(date));
        if (mCompactCalendarView != null) {
            mCompactCalendarView.setCurrentDate(date);
        }

        mCompactCalendarView.shouldScrollMonth(false);


    }

    @Override
    public void setTitle(CharSequence title) {
        TextView tvTitle = (TextView) findViewById(R.id.title);
        Log.d("dia del mes",(String) title);

        if (tvTitle != null) {
            tvTitle.setText(title);
        }
    }

    public void setSubtitle(String subtitle) {
        TextView datePickerTextView = (TextView) findViewById(R.id.date_picker_text_view);

        if (datePickerTextView != null) {
            datePickerTextView.setText(subtitle);
        }
    }

    public void cambiarFragment(String dia){

       // getSupportFragmentManager().beginTransaction().remove(frag);
        getSupportFragmentManager().popBackStack();
        frag=BlankFragment.newInstance(dia);
        getSupportFragmentManager().beginTransaction().
                 setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.fragment,frag)
                .addToBackStack(null)
                .commit();

     }


    }

