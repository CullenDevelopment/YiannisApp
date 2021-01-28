package com.cullendevelopment.yiannisapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    double totalPrice = 0;

    public static int halloumi_quantity = 0;
    public static int kolokithokeftedes_quantity = 0;
    public static int keftedes_quantity = 0;
    public static int halloumi_pancetta_quantity = 0;
    public static int calamari_quantity = 0;
    public static int salad_quantity = 0;
    public static int patzarosalata_quantity = 0;
    public static int hummus_quantity = 0;
    public static int tsatziki_quantity = 0;
    public static int tirokafteri_quantity = 0;

    public static int gyros_open_quantity = 0;
    public static int gyros_wrapped_quantity = 0;
    public static int mixed_souvlaki_quantity = 0;
    public static int pork_souvlaki_quantity = 0;
    public static int chicken_souvlaki_quantity = 0;
    public static int yiaourtlou_quantity = 0;
    public static int seftalies_quantity = 0;
    public static int moshari_quantity = 0;
    public static int meat_moussaka_quantity = 0;
    public static int veg_moussaka_quantity = 0;
    public static int spanakopita_quantity = 0;
    public static int baklava_quantity = 0;
    public static int galactobureko_quantity = 0;
    public static int cake_quantity = 0;
    public static int ravani_quantity = 0;

    public static String HALLOUMI_AMOUNT = "HALLOUMI_AMOUNT";
    public static String KOLOKITHOKEFTEDES_AMOUNT = "KOLOKITHOKEFTEDES_AMOUNT";
    public static String KEFTEDES_AMOUNT = "KEFTEDES_AMOUNT";
    public static String HALLOUMI_PANCETTA_AMOUNT = "HALLOUMI_PANCETTA_AMOUNT";
    public static String CALAMARI_AMOUNT = "CALAMARI_AMOUNT";
    public static String SALAD_AMOUNT = "SALAD_AMOUNT";
    public static String PATZAROSALATA_AMOUNT = "PATZAROSALATA_AMOUNT";
    public static String HUMMUS_AMOUNT = "HUMMUS_AMOUNT";
    public static String TSATZIKI_AMOUNT = "TSATZIKI_AMOUNT";
    public static String TIROKAFTERI_AMOUNT = "TIROKAFTERI_AMOUNT";
    public static String GYROS_OPEN_AMOUNT = "GYROS_OPEN_AMOUNT";
    public static String GYROS_WRAPPED_AMOUNT = "GYROS_WRAPPED_AMOUNT";
    public static String MIXED_SOUVLAKI_AMOUNT = "MIXED_SOUVLAKI_AMOUNT";
    public static String PORK_SOUVLAKI_AMOUNT = "PORK_SOUVLAKI_AMOUNT";
    public static String CHICKEN_SOUVLAKI_AMOUNT = "CHICKEN_SOUVLAKI_AMOUNT";
    public static String YIAOURTLOU_AMOUNT = "YIAOURTLOU_AMOUNT";
    public static String SEFTALIES_AMOUNT = "SEFTALIES_AMOUNT";
    public static String MOSHARI_AMOUNT = "MOSHARI_AMOUNT";
    public static String MEAT_MOUSSAKA_AMOUNT = "MEAT_MOUSSAKA_AMOUNT";
    public static String VEG_MOUSSAKA_AMOUNT = "VEG_MOUSSAKA_AMOUNT";
    public static String SPANAKOPITA_AMOUNT = "SPANAKOPITA_AMOUNT";
    public static String BAKLAVA_AMOUNT = "BAKLAVA_AMOUNT";
    public static String GALACTOBUREKO_AMOUNT = "GALACTOBUREKO_AMOUNT";
    public static String CAKE_AMOUNT = "CAKE_AMOUNT";
    public static String RAVANI_AMOUNT = "RAVANI_AMOUNT";


    public int submit_order_quantity = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Use onSaveInstanceState(Bundle) and onRestoreInstanceState
    @Override
    public void onSaveInstanceState(@NonNull Bundle  outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(BAKLAVA_AMOUNT, baklava_quantity);
        outState.putInt(GALACTOBUREKO_AMOUNT, galactobureko_quantity);
        outState.putInt(CAKE_AMOUNT, cake_quantity);
        outState.putInt(RAVANI_AMOUNT, ravani_quantity);
        outState.putInt(GYROS_OPEN_AMOUNT, gyros_open_quantity);
        outState.putInt(GYROS_WRAPPED_AMOUNT, gyros_wrapped_quantity);
        outState.putInt(MIXED_SOUVLAKI_AMOUNT, mixed_souvlaki_quantity);
        outState.putInt(PORK_SOUVLAKI_AMOUNT, pork_souvlaki_quantity);
        outState.putInt(CHICKEN_SOUVLAKI_AMOUNT, chicken_souvlaki_quantity);
        outState.putInt(YIAOURTLOU_AMOUNT, yiaourtlou_quantity);
        outState.putInt(SEFTALIES_AMOUNT, seftalies_quantity);
        outState.putInt(MOSHARI_AMOUNT, moshari_quantity);
        outState.putInt(MEAT_MOUSSAKA_AMOUNT, meat_moussaka_quantity);
        outState.putInt(VEG_MOUSSAKA_AMOUNT, veg_moussaka_quantity);
        outState.putInt(SPANAKOPITA_AMOUNT, spanakopita_quantity);
        outState.putInt(HALLOUMI_AMOUNT, halloumi_quantity);
        outState.putInt(KOLOKITHOKEFTEDES_AMOUNT, kolokithokeftedes_quantity);
        outState.putInt(KEFTEDES_AMOUNT, keftedes_quantity);
        outState.putInt(HALLOUMI_PANCETTA_AMOUNT, halloumi_pancetta_quantity);
        outState.putInt(CALAMARI_AMOUNT, calamari_quantity);
        outState.putInt(SALAD_AMOUNT, salad_quantity);
        outState.putInt(PATZAROSALATA_AMOUNT, patzarosalata_quantity);
        outState.putInt(HUMMUS_AMOUNT, hummus_quantity);
        outState.putInt(TSATZIKI_AMOUNT, tsatziki_quantity);
        outState.putInt(TIROKAFTERI_AMOUNT, tirokafteri_quantity);
    }



    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        View view = getCurrentFocus();
        if (view != null && (ev.getAction() == MotionEvent.ACTION_UP || ev.getAction() == MotionEvent.ACTION_MOVE) && view instanceof EditText && !view.getClass().getName().startsWith("android.webkit.")) {
            int[] scrcoords = new int[2];
            view.getLocationOnScreen(scrcoords);
            float x = ev.getRawX() + view.getLeft() - scrcoords[0];
            float y = ev.getRawY() + view.getTop() - scrcoords[1];
            if (x < view.getLeft() || x > view.getRight() || y < view.getTop() || y > view.getBottom())
                ((InputMethodManager)this.getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow((this.getWindow().getDecorView().getApplicationWindowToken()), 0);
        }
        return super.dispatchTouchEvent(ev);
    }

    /**
     * This method is called when the halloumi increment button is clicked.
     */
    public void halloumi_increment(View view) {

        if (halloumi_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Halloumi?", Toast.LENGTH_SHORT).show();
            return;
        }
        halloumi_quantity = halloumi_quantity + 1;
        halloumiDisplayQuantity(halloumi_quantity);

    }

    /**
     * This method is called when the  halloumi decrement button is clicked.
     */
    public void halloumi_decrement(View view) {

        if (halloumi_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Halloumi!", Toast.LENGTH_SHORT).show();
            return;
        }



        halloumi_quantity = halloumi_quantity - 1;
        halloumiDisplayQuantity(halloumi_quantity);

    }
    /**
     * This method displays the given halloumi quantity value on the screen.
     */
    public void halloumiDisplayQuantity(int halloumi_quantity) {
        TextView halloumiQuantityTextView = findViewById(R.id.halloumi_quantity_text_view);
        halloumiQuantityTextView.setText(String.valueOf(halloumi_quantity));
    }

    /**
     * This method is called when the kolokithokeftedes increment button is clicked.
     */
    public void kolokithokeftedes_increment(View view) {

        if (kolokithokeftedes_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Kolokithokeftedes?", Toast.LENGTH_SHORT).show();
            return;
        }
        kolokithokeftedes_quantity = kolokithokeftedes_quantity + 1;
        kolokithokeftedesDisplayQuantity(kolokithokeftedes_quantity);


    }

    /**
     * This method is called when the kolokithokeftedes decrement button is clicked.
     */
    public void kolokithokeftedes_decrement(View view) {

        if (kolokithokeftedes_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Kolokithokeftedes!", Toast.LENGTH_SHORT).show();
            return;
        }



        kolokithokeftedes_quantity = kolokithokeftedes_quantity - 1;
        kolokithokeftedesDisplayQuantity(kolokithokeftedes_quantity);

    }
    /**
     * This method displays the given kolokithokeftedes quantity value on the screen.
     */
    public void kolokithokeftedesDisplayQuantity(int kolokithokeftedes_quantity) {
        TextView kolokithokeftedesQuantityTextView = findViewById(R.id.kolokithokeftedes_quantity_text_view);
        kolokithokeftedesQuantityTextView.setText(String.valueOf(kolokithokeftedes_quantity));
    }

    /**
     * This method is called when the keftedes increment button is clicked.
     */
    public void keftedes_increment(View view) {

        if (keftedes_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Keftedes?", Toast.LENGTH_SHORT).show();
            return;
        }
        keftedes_quantity = keftedes_quantity + 1;
        keftedesDisplayQuantity(keftedes_quantity);

    }

    /**
     * This method is called when the keftedes decrement button is clicked.
     */
    public void keftedes_decrement(View view) {

        if (keftedes_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Keftedes!", Toast.LENGTH_SHORT).show();
            return;
        }



        keftedes_quantity = keftedes_quantity - 1;
        keftedesDisplayQuantity(keftedes_quantity);

    }
    /**
     * This method displays the given keftedes quantity value on the screen.
     */
    public void keftedesDisplayQuantity(int keftedes_quantity) {
        TextView keftedesQuantityTextView = findViewById(R.id.keftedes_quantity_text_view);
        keftedesQuantityTextView.setText(String.valueOf(keftedes_quantity));
    }



    /**
     * This method is called when the halloumi_pancetta increment button is clicked.
     */
    public void halloumi_pancetta_increment(View view) {

        if (halloumi_pancetta_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Halloumi Pancetta?", Toast.LENGTH_SHORT).show();
            return;
        }
        halloumi_pancetta_quantity = halloumi_pancetta_quantity + 1;
        halloumiPancettaDisplayQuantity(halloumi_pancetta_quantity);

    }

    /**
     * This method is called when the halloumi_pancetta decrement button is clicked.
     */
    public void halloumi_pancetta_decrement(View view) {

        if (halloumi_pancetta_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Halloumi Pancetta!", Toast.LENGTH_SHORT).show();
            return;
        }



        halloumi_pancetta_quantity = halloumi_pancetta_quantity - 1;
        halloumiPancettaDisplayQuantity(halloumi_pancetta_quantity);

    }
    /**
     * This method displays the given halloumi_pancetta quantity value on the screen.
     */
    public void halloumiPancettaDisplayQuantity(int halloumi_pancetta_quantity) {
        TextView halloumiPancettaQuantityTextView =  findViewById(R.id.halloumi_pancetta_quantity_text_view);
        halloumiPancettaQuantityTextView.setText(String.valueOf(halloumi_pancetta_quantity));
    }

    /**
     * This method is called when the calimari increment button is clicked.
     */
    public void calimari_increment(View view) {

        if (calamari_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Calamari?", Toast.LENGTH_SHORT).show();
            return;
        }
        calamari_quantity = calamari_quantity + 1;
        calamariDisplayQuantity(calamari_quantity);

    }

    /**
     * This method is called when the calimari decrement button is clicked.
     */
    public void calimari_decrement(View view) {

        if (calamari_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Calamari!", Toast.LENGTH_SHORT).show();
            return;
        }



        calamari_quantity = calamari_quantity - 1;
        calamariDisplayQuantity(calamari_quantity);

    }
    /**
     * This method displays the given calimari quantity value on the screen.
     */
    public void calamariDisplayQuantity(int calamari_quantity) {
        TextView calamariQuantityTextView = findViewById(R.id.calimari_quantity_text_view);
        calamariQuantityTextView.setText(String.valueOf(calamari_quantity));
    }

    /**
     * This method is called when the salad increment button is clicked.
     */
    public void salad_increment(View view) {

        if (salad_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Greek Salad?", Toast.LENGTH_SHORT).show();
            return;
        }
        salad_quantity = salad_quantity + 1;
        saladDisplayQuantity(salad_quantity);

    }

    /**
     * This method is called when the salad decrement button is clicked.
     */
    public void salad_decrement(View view) {

        if (salad_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Greek Salad!", Toast.LENGTH_SHORT).show();
            return;
        }



        salad_quantity = salad_quantity - 1;
        saladDisplayQuantity(salad_quantity);

    }
    /**
     * This method displays the given salad quantity value on the screen.
     */
    public void saladDisplayQuantity(int salad_quantity) {
        TextView saladQuantityTextView = findViewById(R.id.salad_quantity_text_view);
        saladQuantityTextView.setText(String.valueOf(salad_quantity));
    }

    /**
     * This method is called when the patzarosalata increment button is clicked.
     */
    public void patzarosalata_increment(View view) {

        if (patzarosalata_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Patzarosalata Beetroot Salad?", Toast.LENGTH_SHORT).show();
            return;
        }
        patzarosalata_quantity = patzarosalata_quantity + 1;
        patzarosalataDisplayQuantity(patzarosalata_quantity);

    }

    /**
     * This method is called when the  patzarosalata decrement button is clicked.
     */
    public void patzarosalata_decrement(View view) {

        if (patzarosalata_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Patzarosalata Beetroot Salad!", Toast.LENGTH_SHORT).show();
            return;
        }



        patzarosalata_quantity = patzarosalata_quantity - 1;
        patzarosalataDisplayQuantity(patzarosalata_quantity);

    }
    /**
     * This method displays the given patzarosalata quantity value on the screen.
     */
    public void patzarosalataDisplayQuantity(int patzarosalata_quantity) {
        TextView patzarosalataQuantityTextView = findViewById(R.id.patzarosalata_quantity_text_view);
        patzarosalataQuantityTextView.setText(String.valueOf(patzarosalata_quantity));
    }

    /**
     * This method is called when the hummus increment button is clicked.
     */
    public void hummus_increment(View view) {

        if (hummus_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Hummus?", Toast.LENGTH_SHORT).show();
            return;
        }
        hummus_quantity = hummus_quantity + 1;
        hummusDisplayQuantity(hummus_quantity);

    }

    /**
     * This method is called when the  hummus decrement button is clicked.
     */
    public void hummus_decrement(View view) {

        if (hummus_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Hummus!", Toast.LENGTH_SHORT).show();
            return;
        }



        hummus_quantity = hummus_quantity - 1;
        hummusDisplayQuantity(hummus_quantity);

    }
    /**
     * This method displays the given hummus quantity value on the screen.
     */
    public void hummusDisplayQuantity(int hummus_quantity) {
        TextView hummusQuantityTextView = findViewById(R.id.hummus_quantity_text_view);
        hummusQuantityTextView.setText(String.valueOf(hummus_quantity));
    }

    /**
     * This method is called when the tsatziki increment button is clicked.
     */
    public void tsatziki_increment(View view) {

        if (tsatziki_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Tsatziki?", Toast.LENGTH_SHORT).show();
            return;
        }
        tsatziki_quantity = tsatziki_quantity + 1;
        tsatzikiDisplayQuantity(tsatziki_quantity);

    }

    /**
     * This method is called when the  tsatziki decrement button is clicked.
     */
    public void tsatziki_decrement(View view) {

        if (tsatziki_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Tsatziki!", Toast.LENGTH_SHORT).show();
            return;
        }



        tsatziki_quantity = tsatziki_quantity - 1;
        tsatzikiDisplayQuantity(tsatziki_quantity);

    }
    /**
     * This method displays the given tsatziki quantity value on the screen.
     */
    public void tsatzikiDisplayQuantity(int tsatziki_quantity) {
        TextView tsatzikiQuantityTextView = findViewById(R.id.tsatziki_quantity_text_view);
        tsatzikiQuantityTextView.setText(String.valueOf(tsatziki_quantity));
    }

    /**
     * This method is called when the tirokafteri increment button is clicked.
     */
    public void tirokafteri_increment(View view) {

        if (tirokafteri_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Tirokafteri?", Toast.LENGTH_SHORT).show();
            return;
        }
        tirokafteri_quantity = tirokafteri_quantity + 1;
        tirokafteriDisplayQuantity(tirokafteri_quantity);

    }

    /**
     * This method is called when the  tirokafteri decrement button is clicked.
     */
    public void tirokafteri_decrement(View view) {

        if (tirokafteri_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Tirokafteri!", Toast.LENGTH_SHORT).show();
            return;
        }



        tirokafteri_quantity = tirokafteri_quantity - 1;
        tirokafteriDisplayQuantity(tirokafteri_quantity);

    }
    /**
     * This method displays the given tirokafteri quantity value on the screen.
     */
    public void tirokafteriDisplayQuantity(int tirokafteri_quantity) {
        TextView tirokafteriQuantityTextView = findViewById(R.id.tirokafteri_quantity_text_view);
        tirokafteriQuantityTextView.setText(String.valueOf(tirokafteri_quantity));
    }

    /**
     * This method is called when the  gyros decrement button is clicked.
     */
    public void gyros_open_decrement(View view) {

        if (gyros_open_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Gyros Chicken(open)!", Toast.LENGTH_SHORT).show();
            return;
        }



        gyros_open_quantity = gyros_open_quantity - 1;
        gyrosOpenDisplayQuantity(gyros_open_quantity);

    }

    /**
     * This method is called when the gyros open increment button is clicked.
     */
    public void gyros_open_increment(View view) {

        if (gyros_open_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Gyros Chicken(open)?", Toast.LENGTH_SHORT).show();
            return;
        }
        gyros_open_quantity = gyros_open_quantity + 1;
        gyrosOpenDisplayQuantity(gyros_open_quantity);

    }
    /**
     * This method displays the given gyros open quantity value on the screen.
     */
    public void gyrosOpenDisplayQuantity(int gyros_open_quantity) {
        TextView gyrosOpenQuantityTextView =  findViewById(R.id.gyros_open_quantity_text_view);
        gyrosOpenQuantityTextView.setText(String.valueOf(gyros_open_quantity));
    }



    /**
     * This method is called when the  gyros wrapped decrement button is clicked.
     */
    public void gyros_wrapped_decrement(View view) {

        if (gyros_wrapped_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Gyros Chicken(wrapped)!", Toast.LENGTH_SHORT).show();
            return;
        }



        gyros_wrapped_quantity = gyros_wrapped_quantity - 1;
        gyrosWrappedDisplayQuantity(gyros_wrapped_quantity);

    }

    /**
     * This method is called when the gyros open increment button is clicked.
     */
    public void gyros_wrapped_increment(View view) {

        if (gyros_wrapped_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Gyros Chicken(wrapped)?", Toast.LENGTH_SHORT).show();
            return;
        }
        gyros_wrapped_quantity = gyros_wrapped_quantity + 1;
        gyrosWrappedDisplayQuantity(gyros_wrapped_quantity);

    }
    /**
     * This method displays the given gyros wrapped value on the screen.
     */
    public void gyrosWrappedDisplayQuantity(int gyros_wrapped_quantity) {
        TextView gyrosWrappedQuantityTextView = findViewById(R.id.gyros_wrapped_quantity_text_view);
        gyrosWrappedQuantityTextView.setText(String.valueOf(gyros_wrapped_quantity));
    }

    /**
     * This method is called when the kolokithokeftedes increment button is clicked.
     */
    public void mixed_souvlaki_increment(View view) {

        if (mixed_souvlaki_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Mixed Souvlaki?", Toast.LENGTH_SHORT).show();
            return;
        }
        mixed_souvlaki_quantity = mixed_souvlaki_quantity + 1;
        mixedSouvlakiDisplayQuantity(mixed_souvlaki_quantity);

    }

    /**
     * This method is called when the mixed souvlaki decrement button is clicked.
     */
    public void mixed_souvlaki_decrement(View view) {

        if (mixed_souvlaki_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Mixed Souvlaki!", Toast.LENGTH_SHORT).show();
            return;
        }



        mixed_souvlaki_quantity = mixed_souvlaki_quantity - 1;
        mixedSouvlakiDisplayQuantity(mixed_souvlaki_quantity);

    }
    /**
     * This method displays the given mixed souvlaki quantity value on the screen.
     */
    public void mixedSouvlakiDisplayQuantity(int mixed_souvlaki_quantity) {
        TextView mixedSouvlakiQuantityTextView = findViewById(R.id.mixed_souvlaki_quantity_text_view);
        mixedSouvlakiQuantityTextView.setText(String.valueOf(mixed_souvlaki_quantity));
    }

    /**
     * This method is called when the pork souvlaki increment button is clicked.
     */
    public void pork_souvlaki_increment(View view) {

        if (pork_souvlaki_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Souvlaki?", Toast.LENGTH_SHORT).show();
            return;
        }
        pork_souvlaki_quantity = pork_souvlaki_quantity + 1;
        porkSouvlakiDisplayQuantity(pork_souvlaki_quantity);

    }

    /**
     * This method is called when the Pork souvlaki decrement button is clicked.
     */
    public void pork_souvlaki_decrement(View view) {

        if (pork_souvlaki_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Pork Souvlaki!", Toast.LENGTH_SHORT).show();
            return;
        }



        pork_souvlaki_quantity = pork_souvlaki_quantity - 1;
        porkSouvlakiDisplayQuantity(pork_souvlaki_quantity);

    }
    /**
     * This method displays the given Pork souvlaki quantity value on the screen.
     */
    public void porkSouvlakiDisplayQuantity(int pork_souvlaki_quantity) {
        TextView pork_souvlakiQuantityTextView = findViewById(R.id.pork_souvlaki_quantity_text_view);
        pork_souvlakiQuantityTextView.setText(String.valueOf(pork_souvlaki_quantity));
    }



    /**
     * This method is called when the Chicken souvlaki increment button is clicked.
     */
    public void chicken_souvlaki_increment(View view) {

        if (chicken_souvlaki_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Chicken Souvlaki?", Toast.LENGTH_SHORT).show();
            return;
        }
        chicken_souvlaki_quantity = chicken_souvlaki_quantity + 1;
        chickenSouvlakiDisplayQuantity(chicken_souvlaki_quantity);

    }

    /**
     * This method is called when the Chicken souvlaki decrement button is clicked.
     */
    public void chicken_souvlaki_decrement(View view) {

        if (chicken_souvlaki_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Chicken Souvlaki!", Toast.LENGTH_SHORT).show();
            return;
        }



        chicken_souvlaki_quantity = chicken_souvlaki_quantity - 1;
        chickenSouvlakiDisplayQuantity(chicken_souvlaki_quantity);

    }
    /**
     * This method displays the given Chicken souvlaki quantity value on the screen.
     */
    public void chickenSouvlakiDisplayQuantity(int chicken_souvlaki_quantity) {
        TextView chickenSouvlakiDisplayQuantityTextView =  findViewById(R.id.chicken_souvlaki_quantity_text_view);
        chickenSouvlakiDisplayQuantityTextView.setText(String.valueOf(chicken_souvlaki_quantity));
    }

    /**
     * This method is called when the yiaourtlou increment button is clicked.
     */
    public void yiaourtlou_increment(View view) {

        if (yiaourtlou_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Yiaourtlou?", Toast.LENGTH_SHORT).show();
            return;
        }
        yiaourtlou_quantity = yiaourtlou_quantity + 1;
        yiaourtlouDisplayQuantity(yiaourtlou_quantity);

    }

    /**
     * This method is called when the yiaourtlou decrement button is clicked.
     */
    public void yiaourtlou_decrement(View view) {

        if (yiaourtlou_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Yiaourtlou!", Toast.LENGTH_SHORT).show();
            return;
        }



        yiaourtlou_quantity = yiaourtlou_quantity - 1;
        yiaourtlouDisplayQuantity(yiaourtlou_quantity);

    }
    /**
     * This method displays the given yiaourtlou quantity value on the screen.
     */
    public void yiaourtlouDisplayQuantity(int yiaourtlou_quantity) {
        TextView yiaourtlouQuantityTextView = findViewById(R.id.yiaourtlou_quantity_text_view);
        yiaourtlouQuantityTextView.setText(String.valueOf(yiaourtlou_quantity));
    }

    /**
     * This method is called when the seftalies increment button is clicked.
     */
    public void seftalies_increment(View view) {

        if (seftalies_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Seftalies?", Toast.LENGTH_SHORT).show();
            return;
        }
        seftalies_quantity = seftalies_quantity + 1;
        seftaliesDisplayQuantity(seftalies_quantity);

    }

    /**
     * This method is called when the seftalies decrement button is clicked.
     */
    public void seftalies_decrement(View view) {

        if (seftalies_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Seftalies!", Toast.LENGTH_SHORT).show();
            return;
        }



        seftalies_quantity = seftalies_quantity - 1;
        seftaliesDisplayQuantity(seftalies_quantity);

    }
    /**
     * This method displays the given seftalies quantity value on the screen.
     */
    public void seftaliesDisplayQuantity(int seftalies_quantity) {
        TextView seftaliesQuantityTextView = findViewById(R.id.seftalies_quantity_text_view);
        seftaliesQuantityTextView.setText(String.valueOf(seftalies_quantity));
    }

    /**
     * This method is called when the meat_moussaka increment button is clicked.
     */
    public void meat_moussaka_increment(View view) {

        if (meat_moussaka_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Meat Moussaka?", Toast.LENGTH_SHORT).show();
            return;
        }
        meat_moussaka_quantity = meat_moussaka_quantity + 1;
        meatMoussakaDisplayQuantity(meat_moussaka_quantity);

    }

    /**
     * This method is called when the  meat moussaka decrement button is clicked.
     */
    public void meat_moussaka_decrement(View view) {

        if (meat_moussaka_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Meat Moussaka!", Toast.LENGTH_SHORT).show();
            return;
        }



        meat_moussaka_quantity = meat_moussaka_quantity - 1;
        meatMoussakaDisplayQuantity(meat_moussaka_quantity);

    }
    /**
     * This method displays the given meat_moussaka quantity value on the screen.
     */
    public void meatMoussakaDisplayQuantity(int meat_moussaka_quantity) {
        TextView meatMoussakaQuantityTextView = findViewById(R.id.meat_moussaka_quantity_text_view);
        meatMoussakaQuantityTextView.setText(String.valueOf(meat_moussaka_quantity));
    }

    /**
     * This method is called when the meat_moussaka increment button is clicked.
     */
    public void veg_moussaka_increment(View view) {

        if (veg_moussaka_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Vegetable Moussaka?", Toast.LENGTH_SHORT).show();
            return;
        }
        veg_moussaka_quantity = veg_moussaka_quantity + 1;
        vegMoussakaDisplayQuantity(veg_moussaka_quantity);

    }

    /**
     * This method is called when the  veg moussaka decrement button is clicked.
     */
    public void veg_moussaka_decrement(View view) {

        if (veg_moussaka_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Vegetable Moussaka!", Toast.LENGTH_SHORT).show();
            return;
        }



        veg_moussaka_quantity = veg_moussaka_quantity - 1;
        vegMoussakaDisplayQuantity(veg_moussaka_quantity);

    }
    /**
     * This method displays the given meat_moussaka quantity value on the screen.
     */
    public void vegMoussakaDisplayQuantity(int veg_moussaka_quantity) {
        TextView vegMoussakaQuantityTextView =  findViewById(R.id.veg_moussaka_quantity_text_view);
        vegMoussakaQuantityTextView.setText(String.valueOf(veg_moussaka_quantity));
    }

    /**
     * This method is called when the moshari increment button is clicked.
     */
    public void moshari_increment(View view) {

        if (moshari_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Moshari Stifado?", Toast.LENGTH_SHORT).show();
            return;
        }
        moshari_quantity = moshari_quantity + 1;
        moshariDisplayQuantity(moshari_quantity);

    }

    /**
     * This method is called when the  moshari decrement button is clicked.
     */
    public void moshari_decrement(View view) {

        if (moshari_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Moshari Stifado!", Toast.LENGTH_SHORT).show();
            return;
        }



        moshari_quantity = moshari_quantity - 1;
        moshariDisplayQuantity(moshari_quantity);

    }
    /**
     * This method displays the given moshari quantity value on the screen.
     */
    public void moshariDisplayQuantity(int moshari_quantity) {
        TextView moshariQuantityTextView = findViewById(R.id.moshari_quantity_text_view);
        moshariQuantityTextView.setText(String.valueOf(moshari_quantity));
    }

    /**
     * This method displays the given spanakopita quantity value on the screen.
     */
    public void spanakopitaDisplayQuantity(int spanakopita_quantity) {
        TextView spanakopitaQuantityTextView = findViewById(R.id.spanakopita_quantity_text_view);
        spanakopitaQuantityTextView.setText(String.valueOf(spanakopita_quantity));
    }

    /**
     * This method is called when the spanakopita increment button is clicked.
     */
    public void spanakopita_increment(View view) {

        if (spanakopita_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Spanakopita?", Toast.LENGTH_SHORT).show();
            return;
        }
        spanakopita_quantity = spanakopita_quantity + 1;
        spanakopitaDisplayQuantity(spanakopita_quantity);

    }

    /**
     * This method is called when the  spanakopita decrement button is clicked.
     */
    public void spanakopita_decrement(View view) {

        if (spanakopita_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Spanakopita!", Toast.LENGTH_SHORT).show();
            return;
        }



        spanakopita_quantity = spanakopita_quantity - 1;
        spanakopitaDisplayQuantity(spanakopita_quantity);

    }

    /**
     * This method is called when the baklava increment button is clicked.
     */
    public void baklavaIncrement(View view) {

        if (baklava_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 pieces of Baklava!", Toast.LENGTH_SHORT).show();
            return;
        }
        baklava_quantity = baklava_quantity + 1;
        displayBaklavaQuantity(baklava_quantity);

    }

    /**
     * This method is called when the  baklava decrement button is clicked.
     */
    public void baklavaDecrement(View view) {

        if (baklava_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 Baklava!", Toast.LENGTH_SHORT).show();
            return;
        }

        baklava_quantity = baklava_quantity - 1;
        displayBaklavaQuantity(baklava_quantity);

    }
    /**
     * This method displays the given  baklava quantity value on the screen.
     */
    public void displayBaklavaQuantity(int baklava_quantity) {
        TextView quantityTextView =  findViewById(R.id.baklava_quantity_text_view);
        quantityTextView.setText(String.valueOf(baklava_quantity));
    }

    /**
     * This method is called when the baklava increment button is clicked.
     */
    public void galactobureko_increment(View view) {

        if (galactobureko_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 Galactbureko?", Toast.LENGTH_SHORT).show();
            return;
        }
        galactobureko_quantity= galactobureko_quantity + 1;
        displayGalactoburekoQuantity(galactobureko_quantity);

    }

    /**
     * This method is called when the  baklava decrement button is clicked.
     */
    public void galactobureko_decrement(View view) {

        if (galactobureko_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 Galactbureko!", Toast.LENGTH_SHORT).show();
            return;
        }

        galactobureko_quantity = galactobureko_quantity - 1;
        displayGalactoburekoQuantity(galactobureko_quantity);

    }
    /**
     * This method displays the given  baklava quantity value on the screen.
     */
    public void displayGalactoburekoQuantity(int galactobureko_quantity) {
        TextView quantityTextView =  findViewById(R.id.galactobureko_quantity_text_view);
        quantityTextView.setText(String.valueOf(galactobureko_quantity));
    }
    /**
     * This method is called when the baklava increment button is clicked.
     */
    public void cake_increment(View view) {

        if (cake_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 pieces of Chocolate cake?", Toast.LENGTH_SHORT).show();
            return;
        }
        cake_quantity = cake_quantity + 1;
        displayCakeQuantity(cake_quantity);

    }

    /**
     * This method is called when the  baklava decrement button is clicked.
     */
    public void cake_decrement(View view) {

        if (cake_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 pieces of cake!", Toast.LENGTH_SHORT).show();
            return;
        }

        cake_quantity = cake_quantity - 1;
        displayCakeQuantity(cake_quantity);

    }
    /**
     * This method displays the given  baklava quantity value on the screen.
     */
    public void displayCakeQuantity(int cake_quantity) {
        TextView cakeQuantityTextView =  findViewById(R.id.cake_quantity_text_view);
        cakeQuantityTextView.setText(String.valueOf(cake_quantity));
    }

    /**
     * This method is called when the baklava increment button is clicked.
     */
    public void ravani_increment(View view) {

        if (ravani_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 Ravani?", Toast.LENGTH_SHORT).show();
            return;
        }
        ravani_quantity = ravani_quantity + 1;
        displayRavaniQuantity(ravani_quantity);

    }

    /**
     * This method is called when the  baklava decrement button is clicked.
     */
    public void ravani_decrement(View view) {

        if (ravani_quantity ==  0) {
            Toast.makeText(this, "You cannot have less than 0 Ravani!", Toast.LENGTH_SHORT).show();
            return;
        }

        ravani_quantity = ravani_quantity -1;
        displayRavaniQuantity(ravani_quantity);

    }
    /**
     * This method displays the given  baklava quantity value on the screen.
     */
    public void displayRavaniQuantity(int ravani_quantity) {
        TextView ravaniQuantityTextView =  findViewById(R.id.ravani_quantity_text_view);
        ravaniQuantityTextView.setText(String.valueOf(ravani_quantity));
    }



    public void submitOrder(View view) {
        submit_order_quantity = submit_order_quantity + 1;
        EditText enterName = findViewById(R.id.nameBar);
        String showName = enterName.getText().toString(); //gets you the contents of name edit text
        EditText enterTelephone = findViewById(R.id.your_telephone);
        String showPhone = enterTelephone.getText().toString(); //gets you the contents of telephone numberedit text
        EditText enterTime = findViewById(R.id.collect_time);
        String showTime = enterTime.getText().toString(); //gets you the contents of telephone numberedit text
        double totalPrice = calculatePrice();
        String priceMessage = createOrderSummary(showName, showPhone, showTime, totalPrice);

        if(submit_order_quantity == 1 && totalPrice != 0){
            Intent email = new Intent(Intent.ACTION_SENDTO);
            email.setData(Uri.parse("mailto: cullendeveloper@gmail.com")); // only email apps should handle this
            email.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.yiannis_order) + showName);
            email = email.putExtra(Intent.EXTRA_TEXT, priceMessage);
            if (email.resolveActivity(getPackageManager()) != null) {
                startActivity(email);
            }
        }
    }


    /**
     * create summary of order
     *
     * @param showName   name of customer
     * @param totalPrice of order
     * @return text summary
     */


    @SuppressLint("DefaultLocale")
    public String createOrderSummary(String showName, String showPhone, String showTime, double totalPrice) {
        this.totalPrice = totalPrice;
        String priceMessage = getString(R.string.summary_order_name) + showName;
        priceMessage +=  "\n" + getString(R.string.cust_telephone) + showPhone;
        priceMessage +=  "\n" + getString(R.string.collect_time) + showTime;
        if(hummus_quantity > 0){
            priceMessage += "\n" + getString(R.string.halloumi) + hummus_quantity;
        }
        if(kolokithokeftedes_quantity > 0){
            priceMessage += "\n" + getString(R.string.kolokithokeftedes) + kolokithokeftedes_quantity;
        }
        if(keftedes_quantity > 0){
            priceMessage += "\n" + getString(R.string.keftedes) + keftedes_quantity;
        }
        if(halloumi_pancetta_quantity > 0){
            priceMessage += "\n" + getString(R.string.halloumi_pancetta) + halloumi_pancetta_quantity;
        }
        if(calamari_quantity > 0){
            priceMessage += "\n" + getString(R.string.calamari) + calamari_quantity;
        }
        if(salad_quantity > 0){
            priceMessage += "\n" + getString(R.string.salad) + salad_quantity;
        }
        if(patzarosalata_quantity > 0){
            priceMessage += "\n" + getString(R.string.patzarosalata) + patzarosalata_quantity;
        }
        if(hummus_quantity > 0){
            priceMessage += "\n" + getString(R.string.hummus) + hummus_quantity;
        }
        if(tsatziki_quantity > 0){
            priceMessage += "\n" + getString(R.string.tsatziki) + tsatziki_quantity;
        }
        if(tirokafteri_quantity > 0){
            priceMessage += "\n" + getString(R.string.tirokafteri) + tirokafteri_quantity;
        }
        if(gyros_open_quantity > 0){
            priceMessage += "\n" + getString(R.string.gyros_open) + gyros_open_quantity;
        }
        if(gyros_wrapped_quantity > 0){
            priceMessage += "\n" + getString(R.string.gyros_wrapped) + gyros_wrapped_quantity;
        }
        if(mixed_souvlaki_quantity > 0){
            priceMessage += "\n" + getString(R.string.mixed_souvlaki) + mixed_souvlaki_quantity;
        }
        if(pork_souvlaki_quantity > 0){
            priceMessage += "\n" + getString(R.string.pork_souvlaki) + pork_souvlaki_quantity;
        }
        if(chicken_souvlaki_quantity > 0){
            priceMessage += "\n" + getString(R.string.chicken_souvlaki) + chicken_souvlaki_quantity;
        }
        if(yiaourtlou_quantity > 0){
            priceMessage += "\n" + getString(R.string.yiaourtlou) + yiaourtlou_quantity;
        }
        if(seftalies_quantity > 0){
            priceMessage += "\n" + getString(R.string.seftalies) + seftalies_quantity;
        }
        if(moshari_quantity > 0){
            priceMessage += "\n" + getString(R.string.moshari) + moshari_quantity;
        }
        if(meat_moussaka_quantity > 0){
            priceMessage += "\n" + getString(R.string.meat_moussaka) + meat_moussaka_quantity;
        }
        if(veg_moussaka_quantity > 0){
            priceMessage += "\n" + getString(R.string.veg_moussaka) + veg_moussaka_quantity;
        }
        if(spanakopita_quantity > 0){
            priceMessage += "\n" + getString(R.string.spanakopita) + spanakopita_quantity;
        }
        if(baklava_quantity > 0){
            priceMessage += "\n" + getString(R.string.baklava) + baklava_quantity;
        }
        if(galactobureko_quantity > 0){
            priceMessage += "\n" + getString(R.string.galactobureko) + galactobureko_quantity;
        }
        if(cake_quantity > 0){
            priceMessage += "\n" + getString(R.string.cake) + cake_quantity;
        }
        if(ravani_quantity > 0){
            priceMessage += "\n" + getString(R.string.ravani) + ravani_quantity;
        }
        priceMessage += String.format("\n%s%s", getString(R.string.total), String.format("%.2f", totalPrice));
        priceMessage += "\n" + getString(R.string.thank_you);
        return priceMessage;
    }






    private double calculatePrice() {

        //desserts prices
        double baklavaBasePrice = 4.50;
        double galactoburekoBasePrice = 4.50;
        double cakeBasePrice = 4.80;
        double ravaniBasePrice = 4.80;

        //Starters prices
        double halloumiBasePrice = 4.80;
        double kolokithokeftedesBasePrice = 5.00;
        double keftedesBasePrice = 5.00;
        double halloumiPancettaBasePrice = 5.50;
        double calamariBasePrice = 5.00;
        double saladBasePrice = 4.30;
        double patzarosalataBasePrice = 4.50;
        double hummusBasePrice = 2.50;
        double tsatzikiBasePrice = 2.50;
        double tirokafteriBasePrice = 2.70;

        //Mains Prices
        double gyrosOpenBasePrice = 9.90;
        double gyrosWrappedBasePrice = 5.00;
        double mixedSouvlakiBasePrice = 11.90;
        double porkSouvlakiBasePrice = 11.50;
        double chickenSouvlakiBasePrice = 11.50;
        double yiaourtlouBasePrice = 11.50;
        double seftaliesBasePrice = 11.50;
        double moshariBasePrice = 11.90;
        double meatMoussakaBasePrice = 11.50;
        double vegMoussakaBasePrice = 11.50;
        double spanakopitaBasePrice = 9.90;

        //Subtotal prices
        //Dessert Prices
        double baklavaPrice;
        double galactoburekoPrice;
        double cakePrice;
        double ravaniPrice;

        //Starters prices
        double halloumiPrice;
        double kolokithokeftedesPrice;
        double keftedesPrice;
        double halloumiPancettaPrice;
        double calamariPrice;
        double saladPrice;
        double patzarosalataPrice;
        double hummusPrice;
        double tsatzikiPrice;
        double tirokafteriPrice;

        //Mains Prices
        double gyrosOpenPrice;
        double gyrosWrappedPrice;
        double mixedSouvlakiPrice;
        double porkSouvlakiPrice;
        double chickenSouvlakiPrice;
        double yiaourtlouPrice;
        double seftaliesPrice;
        double moshariPrice;
        double meatMoussakaPrice;
        double vegMoussakaPrice;
        double spanakopitaPrice;

        //The Calculations
        baklavaPrice = baklavaBasePrice * baklava_quantity;
        totalPrice = totalPrice + baklavaPrice;

        galactoburekoPrice = galactoburekoBasePrice * galactobureko_quantity;
        totalPrice = totalPrice + galactoburekoPrice;

        cakePrice = cakeBasePrice * cake_quantity;
        totalPrice = totalPrice + cakePrice;

        ravaniPrice = ravaniBasePrice * ravani_quantity;
        totalPrice = totalPrice + ravaniPrice;

        halloumiPrice = halloumiBasePrice * halloumi_quantity;
        totalPrice = totalPrice + halloumiPrice;

        kolokithokeftedesPrice = kolokithokeftedesBasePrice * kolokithokeftedes_quantity;
        totalPrice = totalPrice + kolokithokeftedesPrice;

        keftedesPrice = keftedesBasePrice * keftedes_quantity;
        totalPrice = totalPrice + keftedesPrice;

        halloumiPancettaPrice = halloumiPancettaBasePrice * halloumi_pancetta_quantity;
        totalPrice = totalPrice + halloumiPancettaPrice;

        calamariPrice = calamariBasePrice * calamari_quantity;
        totalPrice = totalPrice + calamariPrice;

        saladPrice = saladBasePrice * salad_quantity;
        totalPrice = totalPrice + saladPrice;

        patzarosalataPrice = patzarosalataBasePrice * patzarosalata_quantity;
        totalPrice = totalPrice + patzarosalataPrice;

        hummusPrice = hummusBasePrice * hummus_quantity;
        totalPrice = totalPrice + hummusPrice;

        tsatzikiPrice = tsatzikiBasePrice * tsatziki_quantity;
        totalPrice = totalPrice + tsatzikiPrice;

        tirokafteriPrice = tirokafteriBasePrice * tirokafteri_quantity;
        totalPrice = totalPrice + tirokafteriPrice;

        gyrosOpenPrice = gyrosOpenBasePrice * gyros_open_quantity;
        totalPrice = totalPrice + gyrosOpenPrice;

        gyrosWrappedPrice = gyrosWrappedBasePrice * gyros_wrapped_quantity;
        totalPrice = totalPrice + gyrosWrappedPrice;

        mixedSouvlakiPrice = mixedSouvlakiBasePrice * mixed_souvlaki_quantity;
        totalPrice = totalPrice + mixedSouvlakiPrice;

        porkSouvlakiPrice = porkSouvlakiBasePrice * pork_souvlaki_quantity;
        totalPrice = totalPrice + porkSouvlakiPrice;

        chickenSouvlakiPrice = chickenSouvlakiBasePrice * chicken_souvlaki_quantity;
        totalPrice = totalPrice + chickenSouvlakiPrice;

        yiaourtlouPrice = yiaourtlouBasePrice * yiaourtlou_quantity;
        totalPrice = totalPrice + yiaourtlouPrice;

        seftaliesPrice = seftaliesBasePrice * seftalies_quantity;
        totalPrice =totalPrice + seftaliesPrice;

        moshariPrice = moshariBasePrice * moshari_quantity;
        totalPrice = totalPrice + moshariPrice;

        meatMoussakaPrice = meatMoussakaBasePrice * meat_moussaka_quantity;
        totalPrice = totalPrice + meatMoussakaPrice;

        vegMoussakaPrice = vegMoussakaBasePrice * veg_moussaka_quantity;
        totalPrice = totalPrice + vegMoussakaPrice;

        spanakopitaPrice = spanakopitaBasePrice * spanakopita_quantity;
        totalPrice = totalPrice + spanakopitaPrice;



        return totalPrice;

    }

    public void reset(View view) {
        halloumi_quantity = 0;
        kolokithokeftedes_quantity = 0;
        keftedes_quantity = 0;
        halloumi_pancetta_quantity = 0;
        calamari_quantity = 0;
        salad_quantity = 0;
        patzarosalata_quantity = 0;
        hummus_quantity = 0;
        tsatziki_quantity = 0;
        tirokafteri_quantity = 0;
        gyros_open_quantity = 0;
        gyros_wrapped_quantity = 0;
        mixed_souvlaki_quantity = 0;
        pork_souvlaki_quantity = 0;
        chicken_souvlaki_quantity = 0;
        yiaourtlou_quantity = 0;
        seftalies_quantity = 0;
        moshari_quantity = 0;
        meat_moussaka_quantity = 0;
        veg_moussaka_quantity = 0;
        spanakopita_quantity = 0;
        baklava_quantity = 0;
        galactobureko_quantity = 0;
        cake_quantity = 0;
        ravani_quantity = 0;

        submit_order_quantity = 0;

        totalPrice = 0;
        ((EditText) findViewById(R.id.nameBar)).setText("");
        ((EditText) findViewById(R.id.your_telephone)).setText("");
        ((EditText) findViewById(R.id.collect_time)).setText("");
        ((TextView) findViewById(R.id.halloumi_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.kolokithokeftedes_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.keftedes_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.halloumi_pancetta_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.calimari_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.salad_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.patzarosalata_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.hummus_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.tsatziki_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.tirokafteri_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.gyros_open_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.gyros_wrapped_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.mixed_souvlaki_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.pork_souvlaki_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.chicken_souvlaki_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.yiaourtlou_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.seftalies_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.meat_moussaka_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.veg_moussaka_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.moshari_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.spanakopita_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.baklava_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.galactobureko_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.cake_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.ravani_quantity_text_view)).setText("0");




    }
}