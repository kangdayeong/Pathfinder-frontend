package com.example.pathfinder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.pathfinder.databinding.FragmentStartTravelBinding;

public class StartTravelFragment extends Fragment {

    private FragmentStartTravelBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentStartTravelBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

}
