package com.example.dialogexample;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;

public class LoginDialogFragment extends DialogFragment {
   @Override
   public Dialog onCreateDialog(Bundle savedInstanceState) {
      AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
      // Get the layout inflater
      LayoutInflater inflater = requireActivity().getLayoutInflater();

//       Inflate and set the layout for the dialog
//       Pass null as the parent view because its going in the dialog layout
      builder.setView(inflater.inflate(R.layout.dialog_signin, null))
              // Add action buttons
              .setPositiveButton(R.string.signin, new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int id) {
                    // sign in the user ...
                 }
              })
              .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                 public void onClick(DialogInterface dialog, int id) {
                    LoginDialogFragment.this.getDialog().cancel();
                 }
              });
      return builder.create();
   }

//    Single-choice list
//   @Override
//   public Dialog onCreateDialog(Bundle savedInstanceState) {
//      AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//      builder.setTitle(R.string.pick_color)
//              .setItems(R.array.colors_array, new DialogInterface.OnClickListener() {
//                 public void onClick(DialogInterface dialog, int which) {
//                    // The 'which' argument contains the index position
//                    // of the selected item
//                 }
//              });
//      return builder.create();
//   }

   // Persistent multiple-choice or single-choice list
//   @Override
//   public Dialog onCreateDialog(Bundle savedInstanceState) {
//      ArrayList selectedItems = new ArrayList();  // Where we track the selected items
//      AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//      // Set the dialog title
//      builder.setTitle(R.string.pick_toppings)
//              // Specify the list array, the items to be selected by default (null for none),
//              // and the listener through which to receive callbacks when items are selected
//              .setMultiChoiceItems(R.array.toppings, null,
//                      new DialogInterface.OnMultiChoiceClickListener() {
//                         @Override
//                         public void onClick(DialogInterface dialog, int which,
//                                             boolean isChecked) {
//                            if (isChecked) {
//                               // If the user checked the item, add it to the selected items
//                               selectedItems.add(which);
//                            } else if (selectedItems.contains(which)) {
//                               // Else, if the item is already in the array, remove it
//                               selectedItems.remove(which);
//                            }
//                         }
//                      })
//              // Set the action buttons
//              .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
//                 @Override
//                 public void onClick(DialogInterface dialog, int id) {
//                    // User clicked OK, so save the selectedItems results somewhere
//                    // or return them to the component that opened the dialog
//
//                 }
//              })
//              .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
//                 @Override
//                 public void onClick(DialogInterface dialog, int id) {
//
//                 }
//              });
//
//      return builder.create();
//   }
}