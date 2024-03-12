package com.example.expensemanager.view.fragments;

import android.app.DatePickerDialog;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import com.example.expensemanager.R;
import com.example.expensemanager.databinding.FragmentAddTransactionBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class AddTransactionFragment extends BottomSheetDialogFragment {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    FragmentAddTransactionBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAddTransactionBinding.inflate(inflater);

        binding.Incomebtn.setOnClickListener(v -> {
            binding.Incomebtn.setBackground(getContext().getDrawable(R.drawable.income_selecter));
            binding.Expensebtn.setBackground(getContext().getDrawable(R.drawable.default_selecter));
            binding.Expensebtn.setTextColor(getContext().getColor(R.color.textcolor));
            binding.Incomebtn.setTextColor(getContext().getColor(R.color.Greencolor));
        });

        binding.Expensebtn.setOnClickListener(v -> {
            binding.Incomebtn.setBackground(getContext().getDrawable(R.drawable.default_selecter));
            binding.Expensebtn.setBackground(getContext().getDrawable(R.drawable.expense_selecter));
            binding.Incomebtn.setTextColor(getContext().getColor(R.color.textcolor));
            binding.Expensebtn.setTextColor(getContext().getColor(R.color.Redcolor));
        });

        binding.date.setOnClickListener(v -> {
            DatePickerDialog datePickerDialog = new DatePickerDialog(getContext());
            datePickerDialog.show();
            datePickerDialog.setOnDateSetListener((view, year, month, dayOfMonth) -> {
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.DAY_OF_MONTH,view.getDayOfMonth());
                calendar.set(Calendar.MONTH,view.getMonth());
                calendar.set(Calendar.YEAR,view.getYear());

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM,yyyy");
                String dateToShow = dateFormat.format(calendar.getTime());

                binding.date.setText(dateToShow);
            });
        });
        return binding.getRoot();
    }
}
