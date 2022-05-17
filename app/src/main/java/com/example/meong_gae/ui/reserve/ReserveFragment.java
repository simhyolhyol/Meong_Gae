package com.example.meong_gae.ui.reserve;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.meong_gae.databinding.FragmentReserveBinding;

public class ReserveFragment extends Fragment {

    private FragmentReserveBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ReserveViewModel reserveViewModel =
                new ViewModelProvider(this).get(ReserveViewModel.class);

        binding = FragmentReserveBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textReserve;
        reserveViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}