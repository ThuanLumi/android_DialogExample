package com.example.dialogexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements NoticeDialogFragment.NoticeDialogListener{
   private Button btnTest;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      btnTest = findViewById(R.id.btn_test);
      btnTest.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
//            DialogFragment dialog = new LoginDialogFragment();
//            dialog.show(getSupportFragmentManager(), "LoginDialogFragment");
            showNoticeDialog();
         }
      });
   }

   public void showNoticeDialog() {
      // Create an instance of the dialog fragment and show it
      DialogFragment dialog = new NoticeDialogFragment();
      dialog.show(getSupportFragmentManager(), "NoticeDialogFragment");
   }

   @Override
   public void onDialogPositiveClick(DialogFragment dialog) {

   }

   @Override
   public void onDialogNegativeClick(DialogFragment dialog) {

   }
}