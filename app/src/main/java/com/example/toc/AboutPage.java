package com.example.toc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
//import android.provider.CalendarContract;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;
//import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;



public class AboutPage extends AppCompatActivity {

    String link1 = "https://www.linkedin.com/in/abhishek-hole-a728a716b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);



        Element adsElement = new Element();
        View aboutPage = new mehdi.sakout.aboutpage.AboutPage(this)
                .isRTL(false)

                .setImage(R.drawable.logo1)
                .setDescription("Theory Of Computation (Automata theory) is a theoretical branch of Computer Science " +
                        "and Mathematics, which mainly deals with the logic of computation with respect to simple machines, referred to as Automata.")
                .addGroup("CONNECT WITH US! (Instructor)")

                .addEmail("bharatigurav2008@gmail")
                .addPlayStore("")   //Replace all this with your package name
                .addGroup("CONNECT WITH US! (Developers)")
                .addEmail("abhishek.hole1@gmail.com")
                .addEmail("saurabhmunderock@gmail.com")
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }
    private Element createCopyright()
    {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d by Your Name", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        // copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutPage.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}