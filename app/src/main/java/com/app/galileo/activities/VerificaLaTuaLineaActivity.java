package com.app.galileo.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.app.galileo.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class VerificaLaTuaLineaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifica_la_tua_linea);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_avvio) void btn_avio(){
        fab_onclick(R.style.DialogScale, "Scale" ,(Activity) this,getWindow().getDecorView().getRootView());
    }



    private void fab_onclick(int type, String message, Activity activity, View view) {
        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        //ViewGroup viewGroup = view.findViewById(android.R.id.content);

        if (view == null) {

        } else {
            //then we will inflate the custom alert dialog xml that we created
            View dialogView = LayoutInflater.from(view.getContext()).inflate(R.layout.activity_dialog_verifica, null, false);


            //Now we need an AlertDialog.Builder object
            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

            //SweetAlertDialog builder1 = new SweetAlertDialog(view.getContext());

            //setting the view of the builder to our custom view that we already inflated
            builder.setView(dialogView);


            //finally creating the alert dialog and displaying it
            final AlertDialog alertDialog = builder.create();


            // Get screen width and height in pixels
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            // The absolute width of the available display size in pixels.
            int displayWidth = displayMetrics.widthPixels;
            // The absolute height of the available display size in pixels.
            int displayHeight = displayMetrics.heightPixels;

            // Initialize a new window manager layout parameters
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();

            // Copy the alert dialog window attributes to new layout parameter instance
            layoutParams.copyFrom(alertDialog.getWindow().getAttributes());


            // Set alert dialog width equal to screen width 70%
            int dialogWindowWidth = (int) (displayWidth * 0.9f);
            // Set alert dialog height equal to screen height 70%
            int dialogWindowHeight = (int) (displayHeight * 0.9f);

            // Set the width and height for the layout parameters
            // This will bet the width and height of alert dialog
            layoutParams.width = dialogWindowWidth;
            layoutParams.height = dialogWindowHeight;


            // Apply the newly created layout parameters to the alert dialog window
            alertDialog.getWindow().setAttributes(layoutParams);
            RelativeLayout lyt = dialogView.findViewById(R.id.root_layout);
            //ImageView product = dialogView.findViewById(R.id.btn_product);
            //Button my_story = dialogView.findViewById(R.id.btn_my_story);

            lyt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    alertDialog.dismiss();
                }
            });

            //alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.getWindow().setBackgroundDrawable(null);
            alertDialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            alertDialog.getWindow().getAttributes().windowAnimations = type;
            alertDialog.setCancelable(true);
            alertDialog.show();

        }

    }
}
