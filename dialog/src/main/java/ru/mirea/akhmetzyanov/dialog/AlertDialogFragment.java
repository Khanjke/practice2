package ru.mirea.akhmetzyanov.dialog;

import android.app.DatePickerDialog;
import android.widget.DatePicker;

import androidx.fragment.app.FragmentManager;

import java.util.Calendar;

public class AlertDialogFragment {

    Calendar time= Calendar.getInstance();
    DatePickerDialog.OnDateSetListener d=new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            time.set(Calendar.YEAR, year);
            time.set(Calendar.MONTH, monthOfYear);
            time.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        }
    };
    public void show(FragmentManager supportFragmentManager, String mirea) {
    }
}
