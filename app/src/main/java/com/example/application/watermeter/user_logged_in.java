package com.example.application.watermeter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class user_logged_in extends AppCompatActivity {
//    private TextView user_info;
//    private String username;
//    private String password;
    private String admin;
    private String Amount0;
    private String Amount1;
    private String Amount2;
    private String Amount3;
    private String Amount4;
    private String Amount5;
    private String Amount6;
    private String Amount7;
    private String Amount8;
    private String Amount9;
    private String Amount10;
    private String Amount11;
    private String Amount12;
    private String Area;
    private String City;
    private String Cost;
    private String Date0;
    private String Date1;
    private String Date2;
    private String Date3;
    private String Date4;
    private String Date5;
    private String Date6;
    private String Date7;
    private String Date8;
    private String Date9;
    private String Date10;
    private String Date11;
    private String Date12;
    private String Discount;
    private String Final_Amount;
    private String Flat;
    private String Method;
    private String Mobile_Number;
    private String Password;
    private String Pincode;
    private String Reading0;
    private String Reading1;
    private String Reading2;
    private String Reading3;
    private String Reading4;
    private String Reading5;
    private String Reading6;
    private String Reading7;
    private String Reading8;
    private String Reading9;
    private String Reading10;
    private String Reading11;
    private String Reading12;
    private String Society;
    private String Username;
    private String username_password;
    // private Button user_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_logged_in);

//        user_info = (TextView)findViewById(R.id.user_info);
        //user_password = (Button)findViewById(R.id.user_password);

        Intent intent = getIntent();

        Amount0 = intent.getStringExtra("Amount0");
        Amount1 = intent.getStringExtra("Amount1");
        Amount2 = intent.getStringExtra("Amount2");
        Amount3 = intent.getStringExtra("Amount3");
        Amount4 = intent.getStringExtra("Amount4");
        Amount5 = intent.getStringExtra("Amount5");
        Amount6 = intent.getStringExtra("Amount6");
        Amount7 = intent.getStringExtra("Amount7");
        Amount8 = intent.getStringExtra("Amount8");
        Amount9 = intent.getStringExtra("Amount9");
        Amount10 = intent.getStringExtra("Amount10");
        Amount11 = intent.getStringExtra("Amount11");
        Amount12 = intent.getStringExtra("Amount12");
        Area = intent.getStringExtra("Area");
        City = intent.getStringExtra("Area");
        Cost = intent.getStringExtra("Area");
        Date0 = intent.getStringExtra("Date0");
        Date1 = intent.getStringExtra("Date1");
        Date2 = intent.getStringExtra("Date2");
        Date3 = intent.getStringExtra("Date3");
        Date4 = intent.getStringExtra("Date4");
        Date5 = intent.getStringExtra("Date5");
        Date6 = intent.getStringExtra("Date6");
        Date7 = intent.getStringExtra("Date7");
        Date8 = intent.getStringExtra("Date8");
        Date9 = intent.getStringExtra("Date9");
        Date10 = intent.getStringExtra("Date10");
        Date11 = intent.getStringExtra("Date11");
        Date12 = intent.getStringExtra("Date12");
        Discount = intent.getStringExtra("Discount");
        Final_Amount = intent.getStringExtra("Final_Amount");
        Flat = intent.getStringExtra("Flat");
        Method = intent.getStringExtra("Method");
        Mobile_Number = intent.getStringExtra("Mobile_Number");
        Password = intent.getStringExtra("Password");
        Pincode = intent.getStringExtra("Pincode");
        Reading0 = intent.getStringExtra("Reading0");
        Reading1 = intent.getStringExtra("Reading1");
        Reading2 = intent.getStringExtra("Reading2");
        Reading3 = intent.getStringExtra("Reading3");
        Reading4 = intent.getStringExtra("Reading4");
        Reading5 = intent.getStringExtra("Reading5");
        Reading6 = intent.getStringExtra("Reading6");
        Reading7 = intent.getStringExtra("Reading7");
        Reading8 = intent.getStringExtra("Reading8");
        Reading9 = intent.getStringExtra("Reading9");
        Reading10 = intent.getStringExtra("Reading10");
        Reading11 = intent.getStringExtra("Reading11");
        Reading12 = intent.getStringExtra("Reading12");
        Society = intent.getStringExtra("Society");
        Username = intent.getStringExtra("Username");
        username_password = intent.getStringExtra("username_password");
        admin = intent.getStringExtra("Admin");

//        username = intent.getStringExtra("username");
//        password = intent.getStringExtra("password");
//        String society = intent.getStringExtra("society");
//        String username_password = intent.getStringExtra("username_password");
//        String flat = intent.getStringExtra("flat");
//        String cost = intent.getStringExtra("cost");
//        String final_amount = intent.getStringExtra("final_amount");


//        String reading0 = intent.getStringExtra("Reading0");
//        String reading1 = intent.getStringExtra("Reading1");
//        String reading2 = intent.getStringExtra("Reading2");
//        String reading3 = intent.getStringExtra("Reading3");
//        String reading4 = intent.getStringExtra("Reading4");
//        String reading5 = intent.getStringExtra("Reading5");
//        String reading6 = intent.getStringExtra("Reading6");
//        String reading7 = intent.getStringExtra("Reading7");
//        String reading8 = intent.getStringExtra("Reading8");
//        String reading9 = intent.getStringExtra("Reading9");
//        String reading10 = intent.getStringExtra("Reading10");
//        String reading11 = intent.getStringExtra("Reading11");
//        String reading12 = intent.getStringExtra("Reading12");
//        String date0 = intent.getStringExtra("Date0");
//        String date1 = intent.getStringExtra("Date1");
//        String date2 = intent.getStringExtra("Date2");
//        String date3 = intent.getStringExtra("Date3");
//        String date4 = intent.getStringExtra("Date4");
//        String date5 = intent.getStringExtra("Date5");
//        String date6 = intent.getStringExtra("Date6");
//        String date7 = intent.getStringExtra("Date7");
//        String date8 = intent.getStringExtra("Date8");
//        String date9 = intent.getStringExtra("Date9");
//        String date10 = intent.getStringExtra("Date10");
//        String date11 = intent.getStringExtra("Date11");
//        String date12 = intent.getStringExtra("Date12");



        //admin = intent.getStringExtra("admin");

        String info = "Hello " + Username + ", \n\n" ;
        info = info + "Society Name :\t \t \t " + Society + "\n\n";
        info = info + "Flat Number :\t \t \t " + Flat + "\n\n";
        info = info + "Cost per unit :\t \t \t " + Cost + "\n\n";
        info = info + "Date \t \t \t \t Reading \t \t \t \t Amount \n\n";

        String date = "";
        String month = "";
        String year = "";

        int a = 0;

        if(!Reading0.equals("0")){
            a++;
            info = info + convert(a,Date0,Reading0,Amount0);
        }
        if(!Reading1.equals("0")){
            a++;
            info = info + convert(a,Date1,Reading1,Amount1);
        }
        if(!Reading2.equals("0")){
            a++;
            info = info + convert(a,Date2,Reading2,Amount2);
        }
        if(!Reading3.equals("0")){
            a++;
            info = info + convert(a,Date3,Reading3,Amount3);
        }
        if(!Reading4.equals("0")){
            a++;
            info = info + convert(a,Date4,Reading4,Amount4);
        }
        if(!Reading5.equals("0")){
            a++;
            info = info + convert(a,Date5,Reading5,Amount5);
        }
        if(!Reading6.equals("0")){
            a++;
            info = info + convert(a,Date6,Reading6,Amount6);
        }
        if(!Reading7.equals("0")){
            a++;
            info = info + convert(a,Date7,Reading7,Amount7);
        }
        if(!Reading8.equals("0")){
            a++;
            info = info + convert(a,Date8,Reading8,Amount8);
        }
        if(!Reading9.equals("0")){
            a++;
            info = info + convert(a,Date9,Reading9,Amount9);
        }
        if(!Reading10.equals("0")){
            a++;
            info = info + convert(a,Date10,Reading10,Amount10);
        }
        if(!Reading11.equals("0")){
            a++;
            info = info + convert(a,Date11,Reading11,Amount11);
        }
        if(!Reading12.equals("0")){
            a++;
            info = info + convert(a,Date12,Reading12,Amount12);
        }

        info = info + "Final Amount : \t \t \t" + Final_Amount + "\n\n";
//        user_info.setText(info);
    }

    public String convert(int a, String day,String Reading,String Amount){
        String date = "" + day.charAt(0) + day.charAt(1);
        String month = "" + day.charAt(2) + day.charAt(3);
        String year = "" + day.charAt(4) + day.charAt(5) + day.charAt(6) + day.charAt(7);

        if(date.equals("01")){
            date = "1";
        }else if(date.equals("02")){
            date = "2";
        }else if(date.equals("03")){
            date = "3";
        }else if(date.equals("04")){
            date = "4";
        }else if(date.equals("05")){
            date = "5";
        }else if(date.equals("06")){
            date = "6";
        }else if(date.equals("07")){
            date = "7";
        }else if(date.equals("08")){
            date = "8";
        }else if(date.equals("09")){
            date = "9";
        }

        if(month.equals("01")){
            month = "January";
        }else if(month.equals("02")){
            month = "February";
        }else if(month.equals("03")){
            month = "March";
        }else if(month.equals("04")){
            month = "April";
        }else if(month.equals("05")){
            month = "May";
        }else if(month.equals("06")){
            month = "June";
        }else if(month.equals("07")){
            month = "July";
        }else if(month.equals("08")){
            month = "August";
        }else if(month.equals("09")){
            month = "September";
        }else if(month.equals("10")){
            month = "August";
        }else if(month.equals("11")){
            month = "November";
        }else if(month.equals("12")){
            month = "December";
        }

        String info = "";

        info = info + String.valueOf(a) + ") " + date + " " + month + " " + year + "\t \t" + Reading  + "\t \t"+ Amount + "\n\n";
        return info;
    }

    public void choosen_change_password(View view){
        Intent i = new Intent(getApplicationContext(), user_change_password.class);
//        i.putExtra("username", username);
//        i.putExtra("password", password);
        i.putExtra("Admin",admin);
        i.putExtra("Amount0",Amount0);
        i.putExtra("Amount1",Amount1);
        i.putExtra("Amount2",Amount2);
        i.putExtra("Amount3",Amount3);
        i.putExtra("Amount4",Amount4);
        i.putExtra("Amount5",Amount5);
        i.putExtra("Amount6",Amount6);
        i.putExtra("Amount7",Amount7);
        i.putExtra("Amount8",Amount8);
        i.putExtra("Amount9",Amount9);
        i.putExtra("Amount10",Amount10);
        i.putExtra("Amount11",Amount11);
        i.putExtra("Amount12",Amount12);
        i.putExtra("Area",Area);
        i.putExtra("City",City);
        i.putExtra("Cost",Cost);
        i.putExtra("Date0",Date0);
        i.putExtra("Date1",Date1);
        i.putExtra("Date2",Date2);
        i.putExtra("Date3",Date3);
        i.putExtra("Date4",Date4);
        i.putExtra("Date5",Date5);
        i.putExtra("Date6",Date6);
        i.putExtra("Date7",Date7);
        i.putExtra("Date8",Date8);
        i.putExtra("Date9",Date9);
        i.putExtra("Date10",Date10);
        i.putExtra("Date11",Date11);
        i.putExtra("Date12",Date12);
        i.putExtra("Discount",Discount);
        i.putExtra("Final_Amount",Final_Amount);
        i.putExtra("Flat",Flat);
        i.putExtra("Method",Method);
        i.putExtra("Mobile_Number",Mobile_Number);
        i.putExtra("Password",Password);
        i.putExtra("Pincode",Pincode);
        i.putExtra("Reading0",Reading0);
        i.putExtra("Reading1",Reading1);
        i.putExtra("Reading2",Reading2);
        i.putExtra("Reading3",Reading3);
        i.putExtra("Reading4",Reading4);
        i.putExtra("Reading5",Reading5);
        i.putExtra("Reading6",Reading6);
        i.putExtra("Reading7",Reading7);
        i.putExtra("Reading8",Reading8);
        i.putExtra("Reading9",Reading9);
        i.putExtra("Reading10",Reading10);
        i.putExtra("Reading11",Reading11);
        i.putExtra("Reading12",Reading12);
        i.putExtra("Society",Society);
        i.putExtra("Username",Username);
        i.putExtra("username_password",username_password);
        startActivity(i);
        //startActivity(new Intent(this, user_change_password.class));
    }

    public void choosen_generate_bill(View view){
        Intent i = new Intent(this,bill.class);
        i.putExtra("Admin",admin);
        i.putExtra("Amount0",Amount0);
        i.putExtra("Amount1",Amount1);
        i.putExtra("Amount2",Amount2);
        i.putExtra("Amount3",Amount3);
        i.putExtra("Amount4",Amount4);
        i.putExtra("Amount5",Amount5);
        i.putExtra("Amount6",Amount6);
        i.putExtra("Amount7",Amount7);
        i.putExtra("Amount8",Amount8);
        i.putExtra("Amount9",Amount9);
        i.putExtra("Amount10",Amount10);
        i.putExtra("Amount11",Amount11);
        i.putExtra("Amount12",Amount12);
        i.putExtra("Area",Area);
        i.putExtra("City",City);
        i.putExtra("Cost",Cost);
        i.putExtra("Date0",Date0);
        i.putExtra("Date1",Date1);
        i.putExtra("Date2",Date2);
        i.putExtra("Date3",Date3);
        i.putExtra("Date4",Date4);
        i.putExtra("Date5",Date5);
        i.putExtra("Date6",Date6);
        i.putExtra("Date7",Date7);
        i.putExtra("Date8",Date8);
        i.putExtra("Date9",Date9);
        i.putExtra("Date10",Date10);
        i.putExtra("Date11",Date11);
        i.putExtra("Date12",Date12);
        i.putExtra("Discount",Discount);
        i.putExtra("Final_Amount",Final_Amount);
        i.putExtra("Flat",Flat);
        i.putExtra("Method",Method);
        i.putExtra("Mobile_Number",Mobile_Number);
        i.putExtra("Password",Password);
        i.putExtra("Pincode",Pincode);
        i.putExtra("Reading0",Reading0);
        i.putExtra("Reading1",Reading1);
        i.putExtra("Reading2",Reading2);
        i.putExtra("Reading3",Reading3);
        i.putExtra("Reading4",Reading4);
        i.putExtra("Reading5",Reading5);
        i.putExtra("Reading6",Reading6);
        i.putExtra("Reading7",Reading7);
        i.putExtra("Reading8",Reading8);
        i.putExtra("Reading9",Reading9);
        i.putExtra("Reading10",Reading10);
        i.putExtra("Reading11",Reading11);
        i.putExtra("Reading12",Reading12);
        i.putExtra("Society",Society);
        i.putExtra("Username",Username);
        i.putExtra("username_password",username_password);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}